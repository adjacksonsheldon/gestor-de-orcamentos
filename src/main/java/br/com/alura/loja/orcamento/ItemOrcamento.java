package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemOrcamento implements Orcavel{
	private BigDecimal valor;
}