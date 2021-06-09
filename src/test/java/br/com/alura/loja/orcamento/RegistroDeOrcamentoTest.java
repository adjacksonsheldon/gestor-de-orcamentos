package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.alura.loja.http.JavaHTTPClient;

public class RegistroDeOrcamentoTest {

	@Test
	public void test() {
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new ItemOrcamento(new BigDecimal("10")));
		
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHTTPClient());
		registro.registrar(orcamento);
	}
}
