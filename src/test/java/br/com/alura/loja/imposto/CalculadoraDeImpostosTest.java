package br.com.alura.loja.imposto;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostosTest {

	@Test
	public void deveriaCalcularICMS() {
		Orcamento orcamento = Orcamento.builder().valor(new BigDecimal("100")).build();
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal imposto = calculadora.calcular(orcamento, new ICMS());
		
		assertTrue(imposto.compareTo(BigDecimal.TEN) == 0);
	}

	@Test
	public void deveriaCalcularISS() {
		Orcamento orcamento = Orcamento.builder().valor(new BigDecimal("100")).build();
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal imposto = calculadora.calcular(orcamento, new ISS());
		
		assertTrue(imposto.compareTo(new BigDecimal("6")) == 0);
	}
}
