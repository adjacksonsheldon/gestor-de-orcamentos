package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

import br.com.alura.loja.pedido.acoes.EnviarEmail;
import br.com.alura.loja.pedido.acoes.SalvarPedidoNoBancoDeDados;

public class GeraPedidoHandlerTest {
	@Test
	public void deveriaTestarGeraPedidoHandlerTest() {
		BigDecimal valorOrcamento = new BigDecimal("600");
		String cliente = "Adjackson Sheldon";
		int quantidadeItens = 4;

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(
								new SalvarPedidoNoBancoDeDados()
							   ,new EnviarEmail()
							   ,new LogDePedido())
				);
		handler.executa(gerador);
	}
}
