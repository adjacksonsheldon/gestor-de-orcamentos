package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmail {
	public void executar(Pedido pedido) {
		System.out.println("Enviar um email...." + pedido.getData());
	}
}
