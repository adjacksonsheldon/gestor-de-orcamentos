package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

//Implementação do pattern Command
@AllArgsConstructor
@Builder
@Getter
public class GeraPedido {
	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;

	public void executa() {
		Orcamento orcamento = Orcamento.builder()
				.valor(this.valorOrcamento)
				.quantidadeItens(this.quantidadeItens)
				.build();
		
		Pedido pedido = Pedido.builder()
				.cliente(cliente)
				.data(LocalDateTime.now())
				.orcamento(orcamento)
				.build();
		
		System.out.println("Salvar no banco de dados...." + pedido);

	}
}
