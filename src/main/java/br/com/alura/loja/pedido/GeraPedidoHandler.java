package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;

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

		//Listener utilizado para chamar o observer
		acoes.forEach(a -> a.executar(pedido));
	}
}
