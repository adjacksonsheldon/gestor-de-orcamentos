package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

@AllArgsConstructor
//Implementação do Decorator Pattern. Este padrão é muito útil quando queremos fazer uma composição com a própria classe. 
//Nesse caso utilizamos pra combinar os tipos de impostos sem ter que mudar a implementação deles ou sair criando um monte de if.
public abstract class Imposto {

	private Imposto outro;

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento){
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImposto = outro == null ? BigDecimal.ZERO : outro.realizarCalculo(orcamento);

		return valorImposto.add(valorDoOutroImposto);
	}
}
