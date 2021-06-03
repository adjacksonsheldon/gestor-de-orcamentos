package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.alura.loja.http.JavaHTTPClient;

public class RegistroDeOrcamentoTest {

	@Test
	public void test() {
		Orcamento orcamento = Orcamento.builder()
										.valor(BigDecimal.TEN)
										.quantidadeItens(1)
										.build();
		orcamento.aprovar();
		orcamento.finalizar();
		
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHTTPClient());
		registro.registrar(orcamento);
	}
}
