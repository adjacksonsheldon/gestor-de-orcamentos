package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

//padrão de projeto observer
public class EnviarEmail implements AcaoAposGerarPedido{
	public void executar(Pedido pedido) {
		System.out.println("Enviar um email...." + pedido.getData());
	}
}
