programa
{
	
	 funcao inicio()
	{
		real
		valor , numero , resultado
		
		escreva ("Insira um valor: ")
		leia (valor)
		escreva ("Insira um outro valor para ser multiplicado: ")
		leia (numero)
		resultado = valor * numero
		escreva ("O resultado obtido foi "+resultado)


		
	}
}

programa
{
	
	funcao inicio()
	{
		/*
		 * escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor e sucessor.
		 */

		 inteiro valor, antecessor, sucessor

		 escreva ("Insira um valor: ")
		 leia (valor)
		 antecessor = valor-1
		 sucessor = valor+1
		 escreva ("\nAntecessor= "+antecessor)
		 escreva ("\nSucessor= "+sucessor)
		 escreva ("\n-----------------------------------------")
		 

		 
	}
}

programa
{
	
	funcao inicio()
	{
		/*
		 * usando o PortugolStudio, faça um algoritmo que dado um ano de nascimento e o ano anual mostre a idade3 da pessoa.
		 */

		 inteiro anoNascimento = 2006, anoAtual = 2022, idade
		 idade = anoAtual - anoNascimento
		 escreva ("Sua idade é: ",idade)

	}
}

programa
{
	
	funcao inicio()
	{
		/*
		 * Escreva um algoritmo que leia um valor em Fahrenheit e transforme em Celsius, usando a fómula:
		 * C/5 = F-32/9
		 */
		
		real F, Celsius

		escreva ("informe o valor em graus Fahrenheit: ")
		leia (F)
		Celsius = ((F-32/9)*5)
		escreva ("O valor, em graus Celsius, é: ",Celsius)
		
		
	}
}
