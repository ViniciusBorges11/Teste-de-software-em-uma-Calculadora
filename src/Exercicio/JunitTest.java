package Exercicio;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class JunitTest {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void SomaDoisNumerosPositivos() {
		
		Somar calc = new Somar();
		int soma = calc.soma(3, 7); // Soma de dois valores positivos, no exemplo 3 e 7  resultado esperado 10
		
		Assert.assertEquals(10, soma);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void SomaDoisNumerosPositivoeNegativo() {
		
		Somar calc = new Somar();
		int soma = calc.soma(10, -1); // Soma de dois valores positivo e negativo, no exemplo 10 e -1,  resultado esperado 9
		
		Assert.assertEquals(9, soma);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void SomaDoisNumerosNegativos() {
		
		Somar calc = new Somar();
		int soma = calc.soma(-23, -6); // Soma de dois valores negativos, no exemplo -23 e -6, resultado esperado -29
		
		Assert.assertEquals(-29, soma);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void SubDoisNumerosPositivos() {
		
		Somar calc = new Somar();
		int soma = calc.soma(10, 7);  // Subtração de dois valores positivos, no exemplo 10 e 7, resultado esperado 3
		
		Assert.assertEquals(17, soma);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void SubDoisNumerosNegativoePositivo() {
		
		Subtracao calc = new Subtracao();
		int sub = calc.sub(20, -9); // Subtração de dois valores positivo e negativo, no exemplo 20 e -9, resultado esperado -29
		
		Assert.assertEquals(29, sub);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void SubDoisNumerosNegativos() {
		
		Subtracao calc = new Subtracao();
		int sub = calc.sub(-34, -73); // Soma de dois valores negativos, no exemplo -34 e -73, resultado esperado 39
		
		Assert.assertEquals(39, sub);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void MultDoisNumerosPositivos() {
		
		Multiplicacao calc = new Multiplicacao();
		int multi = calc.multi(6, 5); // Multiplicação de dois valores positivos, no exemplo 6 e 5, resultado esperado 30
		
		Assert.assertEquals(30, multi);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void MultDoisNumerosNegativoePositivo() {
		
		Multiplicacao calc = new Multiplicacao();
		int multi = calc.multi(-65, 4); // Subtração de dois valores positivo e negativo, no exemplo -65 e -4, resultado esperado -260
		
		Assert.assertEquals(-260, multi);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void MultDoisNumerosNegativos() {
		
		Multiplicacao calc = new Multiplicacao();
		int multi = calc.multi(-142, -3); // Subtração de dois valores negativos, no exemplo -142 e -3, resultado esperado 426
		
		Assert.assertEquals(426, multi);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void DivDoisNumerosPositivos() {
		
		Divisao calc = new Divisao();
		int div = calc.div(10, 2);  // Subtração de dois valores positivos, no exemplo 10 e 2, resultado esperado 5
		
		Assert.assertEquals(5, div);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void DivDoisNumerosPositivoeNegativo() {
		
		Divisao calc = new Divisao();
		int div = calc.div(-186, 9);  // Subtração de dois valores positivo e negativo, no exemplo -186 e 9, resultado esperado -20
		
		Assert.assertEquals(-20, div);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void DivDoisNumerosNegativos() {
		
		Divisao calc = new Divisao();
		int div = calc.div(-90, -61);  // Subtração de dois valores negativos, no exemplo -90 e -61, resultado esperado 1
		
		Assert.assertEquals(1, div);
	}
	
}
