package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import org.junit.Test;

public class OrcamentoProxyTest {

	@Test
	public void deveriaChamarGetValor() {
		Orcamento antigo = new Orcamento();
		antigo.addItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovar();
		
		Orcamento novo = new Orcamento();
		novo.addItem(new ItemOrcamento(new BigDecimal("500")));
		novo.addItem(antigo);
		
		OrcamentoProxy proxy = new OrcamentoProxy(novo);
		
		System.out.println(proxy.getValor());
		System.out.println(proxy.getValor());
	}

}
