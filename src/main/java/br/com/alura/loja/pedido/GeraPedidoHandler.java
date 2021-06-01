package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmail;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

//Implementação do Command Handlers pattern
public class GeraPedidoHandler {

	public void executa(GeraPedido geraPedido) {
		Orcamento orcamento = Orcamento.builder()
				.valor(geraPedido.getValorOrcamento())
				.quantidadeItens(geraPedido.getQuantidadeItens())
				.build();
		
		Pedido pedido = Pedido.builder()
				.cliente(geraPedido.getCliente())
				.data(LocalDateTime.now())
				.orcamento(orcamento)
				.build();
		
		EnviarEmail enviarEmail = new EnviarEmail();
		SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();
		
		enviarEmail.executar(pedido);
		salvar.executar(pedido);
		
	}
}
