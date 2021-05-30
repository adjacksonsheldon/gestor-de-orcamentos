package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//Implementação do padrão Chain of Responsibility
public class CalculadoraDeDescontos {
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = 
				new DescontoParaOrcamentoComMaisDeCincoItens(
						new DescontoParaOrcamentoValorMaiorQueQuinhentos(
								new SemDesconto()));
		return cadeiaDeDescontos.calcular(orcamento);
	}
}
