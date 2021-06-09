package br.com.alura.loja.pedido;

import br.com.alura.loja.pedido.acoes.AcaoAposGerarPedido;

public class LogDePedido implements AcaoAposGerarPedido {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Pedido gerado" + pedido);
	}

}
