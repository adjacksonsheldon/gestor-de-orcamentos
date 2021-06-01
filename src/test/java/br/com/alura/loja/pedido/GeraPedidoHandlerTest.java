package br.com.alura.loja.pedido;

import java.math.BigDecimal;

import org.junit.Test;

public class GeraPedidoHandlerTest {
	@Test
	public void deveriaTestarGeraPedidoHandlerTest() {
		BigDecimal valorOrcamento = new BigDecimal("600");
		String cliente = "Adjackson Sheldon";
		int quantidadeItens = 4;

		GeraPedido gerador = GeraPedido.builder()
										.cliente(cliente)
										.quantidadeItens(quantidadeItens)
										.valorOrcamento(valorOrcamento)
										.build();
		
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler();
		geraPedidoHandler.executa(gerador);
	}
}
