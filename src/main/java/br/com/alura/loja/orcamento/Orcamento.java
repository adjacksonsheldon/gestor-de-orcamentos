package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Orcamento {
	private BigDecimal valor;
	private int quantidadeItens;
}
