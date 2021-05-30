package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;

//Implementação o pattern Template Method
@AllArgsConstructor
public abstract class Desconto {
	protected Desconto proximo;
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicacar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	};
	
	public abstract boolean deveAplicacar(Orcamento orcamento);
}
