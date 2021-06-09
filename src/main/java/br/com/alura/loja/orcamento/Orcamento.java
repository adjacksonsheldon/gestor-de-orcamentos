package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.situacao.EmAanalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Builder
@NoArgsConstructor
//Utilização do pattern State
public class Orcamento implements Orcavel{
	@Setter
	@Builder.Default
	private SituacaoOrcamento situacao = new EmAanalise();
	
	@Builder.Default
	List<Orcavel> itens = new ArrayList<Orcavel>();
	
	@Builder.Default
	BigDecimal valor = BigDecimal.ZERO;
	
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
	
	public void addItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);		
	}

	public int getQuantidadeItens() {
		return itens.size();
	}
	
	public BigDecimal getValor() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.valor;
	}
}
