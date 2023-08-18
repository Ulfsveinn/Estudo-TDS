programa
{
	inclua biblioteca Util --> u

  /*7. Um cliente de supermercado fez uma compra de 20 itens. Leia o preço de cada item e
calcule o total que a pessoa vai pagar.*/
	real somatotal=0.0
	inteiro i=1
	

	funcao real Produtos()
	{
		inteiro Respost
		real Pao=4.5,Paosoma=0.0,Leite=7.4,Leitesoma=0.0,Queijo=3.2,Queijosoma=0.0,Mortadela=2.8,Mortadelasoma=0.0,Carne=65.78,Carnesoma=0.0
		
			enquanto(i<=20)
			{
			escreva("\n1 - Pão\n2 - Leite\n3 - Queijo\n4 - Mortadela\n5 - Carne\n0 - Conferir o valor das compras até o momento\nDigite aqui ",i," : ")
			leia(Respost)
			escolha(Respost)
			{
				
				 caso 1:
				limpa()
				escreva("Você acaba de comprar um Pão por ",Pao,"$")
				u.aguarde(3000)
				Paosoma=Pao+Paosoma
				i++
				pare

				caso 2:
				limpa()
				escreva("Você acaba de comprar um Leite por ",Leite,"$")
				u.aguarde(3000)
				Leitesoma=Leite+Leitesoma
				i++
				pare

				caso 3:
				limpa()
				escreva("Você acaba de comprar um Queijo por ",Queijo,"$")
				u.aguarde(3000)
				Queijosoma=Queijo+Queijosoma
				i++
				pare

				caso 4:
				limpa()
				escreva("Você acaba de comprar uma Mortadela por ",Mortadela,"$")
				u.aguarde(3000)
				Mortadelasoma=Mortadela+Mortadelasoma
				i++
				pare
				
				caso 5:
				limpa()
				escreva("Você acaba de comprar uma Carne por ",Carne,"$")
				u.aguarde(3000)
				Carnesoma=Carne+Carnesoma
				i++
				pare

				caso 0:
				limpa()
				escreva("O valor até agora é de: ",somatotal)
				u.aguarde(3000)
				pare
				caso contrario:
				limpa()
				escreva("Opção invalida")
				u.aguarde(3000)
			}
			somatotal=Paosoma+Leitesoma+Queijosoma+Mortadelasoma+Carnesoma
		}
		retorne somatotal
	}
	funcao inicio()
	{
	real valor
	escreva("Você deve comprar 20 itens no mercado.")
	u.aguarde(3000)
	Produtos()
	valor=Produtos()
	limpa()
	escreva("O total das compras foram ",valor)
	u.aguarde(3000)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1653; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {somatotal, 7, 6, 9}-{Pao, 14, 7, 3}-{Paosoma, 14, 15, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
