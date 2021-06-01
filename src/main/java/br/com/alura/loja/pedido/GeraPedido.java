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
}
