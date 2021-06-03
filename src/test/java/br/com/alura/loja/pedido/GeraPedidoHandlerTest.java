package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

import br.com.alura.loja.pedido.acao.EnviarEmail;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

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
		
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmail()));
		geraPedidoHandler.executa(gerador);
	}
}
