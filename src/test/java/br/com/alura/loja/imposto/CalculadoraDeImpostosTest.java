package br.com.alura.loja.imposto;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostosTest {

	@Test
	public void deveriaCalcularICMS() {
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal imposto = calculadora.calcular(orcamento, new ICMS(null));
		
		assertTrue(imposto.compareTo(new BigDecimal("10")) == 0);
	}

	@Test
	public void deveriaCalcularISS() {
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal imposto = calculadora.calcular(orcamento, new ISS(null));
		
		assertTrue(imposto.compareTo(new BigDecimal("6")) == 0);
	}

	@Test
	public void deveriaCalcularISSEICMS() {
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		BigDecimal imposto = calculadora.calcular(orcamento, new ISS(new ICMS(null)));
		
		assertTrue(imposto.compareTo(new BigDecimal("16")) == 0);
	}
}
