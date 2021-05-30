package br.com.alura.loja.desconto;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontosTest {

	@Test
	public void deveriaTestarDescontoParaOrcamentoComMaisDeCincoItens() {
		Orcamento orcamento = Orcamento.builder().valor(new BigDecimal("200")).quantidadeItens(6).build();
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal desconto = calculadora.calcular(orcamento);
		assertTrue(desconto.compareTo(new BigDecimal("20")) == 0);
	}

	@Test
	public void deveriaTestarDescontoParaOrcamentoComMenosDeSeisItens() {
		Orcamento orcamento = Orcamento.builder().valor(new BigDecimal("200")).quantidadeItens(3).build();
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal desconto = calculadora.calcular(orcamento);
		assertTrue(desconto.compareTo(new BigDecimal("0")) == 0);
	}

	@Test
	public void deveriaTestarDescontoParaOrcamentoComValorMaiorQue500EMenosQue6Itens() {
		Orcamento orcamento = Orcamento.builder().valor(new BigDecimal("1000")).quantidadeItens(3).build();
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal desconto = calculadora.calcular(orcamento);
		assertTrue(desconto.compareTo(new BigDecimal("50")) == 0);
	}
}
