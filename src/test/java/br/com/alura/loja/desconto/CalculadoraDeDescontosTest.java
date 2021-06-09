package br.com.alura.loja.desconto;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontosTest {

	@Test
	public void deveriaTestarDescontoParaOrcamentoComMaisDeCincoItens() {
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new ItemOrcamento(new BigDecimal("10")));
		orcamento.addItem(new ItemOrcamento(new BigDecimal("10")));
		orcamento.addItem(new ItemOrcamento(new BigDecimal("10")));
		orcamento.addItem(new ItemOrcamento(new BigDecimal("10")));
		orcamento.addItem(new ItemOrcamento(new BigDecimal("10")));
		orcamento.addItem(new ItemOrcamento(new BigDecimal("10")));
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal desconto = calculadora.calcular(orcamento);
		assertTrue(desconto.compareTo(new BigDecimal("6")) == 0);
	}

	@Test
	public void deveriaTestarDescontoParaOrcamentoComMenosDeSeisItens() {
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal desconto = calculadora.calcular(orcamento);
		assertTrue(desconto.compareTo(new BigDecimal("0")) == 0);
	}

	@Test
	public void deveriaTestarDescontoParaOrcamentoComValorMaiorQue500EMenosQue6Itens() {
		Orcamento orcamento = new Orcamento();
		orcamento.addItem(new ItemOrcamento(new BigDecimal("1000")));
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal desconto = calculadora.calcular(orcamento);
		assertTrue(desconto.compareTo(new BigDecimal("50")) == 0);
	}
}
