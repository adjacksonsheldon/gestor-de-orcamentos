package br.com.alura.loja.orcamento;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void deveriaSomarUmOrcamentoAntigoAUmNovoOrcamento() {
		Orcamento antigo = new Orcamento();
		antigo.addItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.addItem(new ItemOrcamento(new BigDecimal("500")));
		novo.addItem(antigo);
		
		System.out.println(novo.getValor());
		
		assertEquals(novo.getValor(), new BigDecimal("700"));
	}

}
