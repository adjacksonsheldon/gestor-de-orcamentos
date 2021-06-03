package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.EmAanalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Builder
//Utilização do pattern State
public class Orcamento {
	private BigDecimal valor;
	private int quantidadeItens;
	@Setter
	@Builder.Default
	private SituacaoOrcamento situacao = new EmAanalise();
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra );
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
}
