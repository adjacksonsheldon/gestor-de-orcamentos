package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
	public void executar(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados..." + pedido.getData());
	}
}
