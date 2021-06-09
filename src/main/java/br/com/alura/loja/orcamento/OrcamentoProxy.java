package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento{
	
	public OrcamentoProxy(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	private BigDecimal valor;
	private Orcamento orcamento;
	
	@Override
	public BigDecimal getValor() {
		if(this.valor == null) {
			this.valor = orcamento.getValor();
		}
			
		return this.valor;
	}
}
