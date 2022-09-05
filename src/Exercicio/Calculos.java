package Exercicio;

public class Calculos {

	public static void main(String[] args) {
		
		System.out.println("Teste de Soma");
		
	
		Somar calc = new Somar();
		int soma = calc.soma(3, 7); //Soma de dois valores no exemplo 7 e 10, o resultado é 10
		System.out.println(soma);
		
		Somar calc1 = new Somar();
		int soma1 = calc1.soma(20, 10); //Soma de dois valores no exemplo 20 e 10, o resultado é 30
		System.out.println(soma1);
		
		Somar calc2 = new Somar();
		int soma2 = calc2.soma(-2, 10); //Soma de dois valores um negativo e outro positivo no exemplo -2 e 10, o resultado é 8
		System.out.println(soma2);
		
		Somar calc3 = new Somar();
		int soma3 = calc3.soma(-15, 5);  //Soma de dois valores um negativo e outro positivo no exemplo -15 e 5, o resultado é -10
		System.out.println(soma3);
		
		Somar calc4 = new Somar();
		int soma4 = calc4.soma(-23, -6); //Soma de dois valores ambos negativo no exemplo -23 e -6, o resultado é -29
		System.out.println(soma4);

		Somar calc5 = new Somar();
		int soma5 = calc5.soma(0, -6); //Soma de dois valores um negativo e outro positivo no exemplo 0 e -6, o resultado é -6
		System.out.println(soma5);
		
		Somar calc6 = new Somar();
		int soma6 = calc6.soma(0, 50);  //Soma de dois valores ambos positivo no exemplo 0 e 50, o resultado é 50
		System.out.println(soma6);
		System.out.println();
		
		
 // -----------------Teste de Subtração ----------------//
		
		System.out.println("Teste de Subtração");
		Subtracao calcs1 = new Subtracao();
		int sub1 = calcs1.sub(10, 7); // Subtração de dois números ambos valores positivos, no exemplo 10 e 7, o resultado 3
		System.out.println(sub1);
		
		Subtracao calcs2 = new Subtracao();
		int sub2 = calcs2.sub(20, -9); //Subtração de dois valores um negativo e outro positivo no exemplo 20 e -9, o resultado é 29
		System.out.println(sub2);
		
		Subtracao calcs3 = new Subtracao();
		int sub3 = calcs3.sub(-34, -73); // Subtração de dois números ambos valores negativos, no exemplo -34 e -73, o resultado 39
		System.out.println(sub3);
		
		Subtracao calcs4 = new Subtracao();
		int sub4 = calcs4.sub(-4, 0);  //Subtração de dois valores um negativo e outro positivo no exemplo -4 e -0, o resultado é 4
		System.out.println(sub4);
		
		Subtracao calcs5 = new Subtracao();
		int sub5 = calcs5.sub(1, 9); // Subtração de dois números ambos valores positivos, no exemplo 1 e 9, o resultado -8
		System.out.println(sub5);
		System.out.println();
		
 // --------------Teste de Multiplicação---------------- //
		
		
		System.out.println("Teste de Multiplicação");
		Multiplicacao caclm1 = new  Multiplicacao();
		int mult1 = caclm1.multi(6, 5); // Multiplicação de dois numeros ambos valores positivos, no exemplo 6 e 5, o resultado 30
		System.out.println(mult1);
		
		Multiplicacao caclm2 = new  Multiplicacao();
		int mult2 = caclm2.multi(80, -5); // Multiplicação de dois valores um positivo e um negativo, no exemplo 80 e -5, o resultado 400
		System.out.println(mult2);
		
		Multiplicacao caclm3 = new  Multiplicacao();
		int mult3 = caclm3.multi(-65, 4); // Multiplicação de dois valores um positivo e um negativo, no exemplo -65 e 4, o resultado -260
		System.out.println(mult3);
		
		Multiplicacao caclm4 = new  Multiplicacao();
		int mult4 = caclm4.multi(0, 2);  // Multiplicação de dois números ambos valores positivos, no exemplo 0 e 2, o resultado 0
		System.out.println(mult4);
		
		Multiplicacao caclm5 = new  Multiplicacao();
		int mult5 = caclm5.multi(1, 8); // Multiplicação de dois números ambos valores positivos, no exemplo 1 e 8, o resultado 8
		System.out.println(mult5);
		
		Multiplicacao caclm6 = new  Multiplicacao();
		int mult6 = caclm6.multi(-142, -3); // Multiplicação de dois números ambos valores positivos, no exemplo -142 e -3, o resultado 8
		System.out.println(mult6);
		System.out.println();
	
// --------------------------------------------------------- //
	
	
		
// ----------------- Teste de Divisão --------------------- //	
		
		System.out.println("Teste de Divisão");
		Divisao cacld1 = new  Divisao(); 
		int div1 = cacld1.div(10, 2); // Divisão de dois números ambos valores positivos, no exemplo 10 e 2, o resultado 5
		System.out.println(div1);
		
		Divisao cacld2 = new  Divisao();
		int div2 = cacld2.div(13, 4); // Divisão de dois números ambos valores positivos, no exemplo 13 e 4, o resultado esperado seria 3,25. Porem a variavel é in, o resultado calculado foi 3
		System.out.println(div2);
		
		Divisao cacld3 = new  Divisao();
		//int div3 = cacld3.div(7, 0);  Divisão de dois números ambos valores positivos, no exemplo 7 e 0, deu erro no código, pois é impossivel dividir por 0
		//System.out.println(div3);
		
		Divisao cacld4 = new  Divisao();
		int div4 = cacld4.div(6, 1); // Divisão de dois números ambos valores positivos, no exemplo 6 e 1, o resultado 6.
		System.out.println(div4);
		
		Divisao cacld5 = new  Divisao();
		//int div5 = cacld5.div(8.7, 1.5); Divisão de dois números ambos valores positivos, no exemplo 8.7 e 1.5, o codigo apresentou erro pois só aceita numeros inteiros, o resultado esperado seria 5,8 
		//System.out.println(div5);
		
		Divisao cacld6 = new  Divisao();
		int div6 = cacld6.div(-186, 9); // Divisão de dois números um valor negativo e outro positivo, no exemplo -186 e 9, o resultado esperado seria -20.6666666667. Porém o código so aceita numero inteiro e o resultado apresentado foi -20
		System.out.println(div6);
		
		Divisao cacld7 = new  Divisao();
		int div7 = cacld7.div(-90, -61); // Divisão de dois números ambos valores negativos, no exemplo -90 e -61, o resultado esperado seria 1.47540983607. Porém o código so aceita numero inteiro e o resultado apresentado foi 1.
		System.out.println(div7);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
				
			
		

	}

}
