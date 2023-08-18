programa
{
	inclua biblioteca Util-->u
/**1. Faça um algoritmo, utilizando funções, que gere uma matriz 8x8 (entre números inteiros de 1 a 99)
	a.Encontrar na matriz os números pares e ímpares
	b.Encontrar na matriz números primos (números que só são divisíveis por 1 e por ele mesmo)
	c.Encontrar na matriz o maior e o menor número
	d.Somar a diagonal principal
	e.Multiplicar a diagonal secundária
	f.Procurar determinado número informado pelo usuário e retornar a posição que ele se encontra
	g.Gerar uma matriz transposta (linhas viram colunas)*/
/*-----------------------------------------------------------------------------------------------------*/
	inteiro Matriz[8][8],i,j,maior=0,menor=100,somadp,Multids,numero,n
	logico menu=verdadeiro
/*-----------------------------------------------------------------------------------------------------*/
	funcao GerarMatriz()
	{
		para(i=0;i<8;i++)
		{
			para(j=0;j<8;j++)
			{
				Matriz[i][j]=u.sorteia(1,99)
			}
		}
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao MostrarMatriz()
	{
		para(i=0;i<8;i++)
		{
			para(j=0;j<8;j++)
			{
				escreva(" | ",Matriz[i][j]," | ")
			}
			escreva("\n")
		}
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao Par()
	{
		escreva("\n\nOs números Pares na matriz são: \n\n")
		para(i=0;i<8;i++)
		{
			para(j=0;j<8;j++)
			{
				se(Matriz[i][j]%2==0)
			{
				escreva(" | ",Matriz[i][j]," | ")
			}
			}
		}
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao Impar()
	{
		escreva("\n\nOs números Impares na matriz são: \n\n")
		para(i=0;i<8;i++)
		{
			para(j=0;j<8;j++)
			{
				se(Matriz[i][j]%2==1)
			{
				escreva(" | ",Matriz[i][j]," | ")
			}
			}
		}
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao  NumPrimos()
	{
		escreva("\n\nNúmeros primos na matriz:\n")
		para (i = 0; i < 8; i++) {
			para(j = 0; j < 8; j++) {
				numero = Matriz[i][j]
				verificarPrimo(numero, 2)
				verificarPrimo(numero, 3)
				verificarPrimo(numero, 5)
				verificarPrimo(numero, 7)
				verificarPrimo(numero, 11)
				verificarPrimo(numero, 13)
				verificarPrimo(numero, 17)
				verificarPrimo(numero, 19)
				verificarPrimo(numero, 23)
				verificarPrimo(numero, 29)
				verificarPrimo(numero, 31)
				verificarPrimo(numero, 37)
				verificarPrimo(numero, 41)
				verificarPrimo(numero, 43)
				verificarPrimo(numero, 47)
				verificarPrimo(numero, 53)
				verificarPrimo(numero, 59)
				verificarPrimo(numero, 61)
				verificarPrimo(numero, 67)
				verificarPrimo(numero, 71)
				verificarPrimo(numero, 73)
				verificarPrimo(numero, 79)
				verificarPrimo(numero, 83)
				verificarPrimo(numero, 89)
				verificarPrimo(numero, 97)
			}
		}
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao verificarPrimo(inteiro num, inteiro primo) {
		se (num == primo) {
			escreva(num," ")
		}
	}	
/*-----------------------------------------------------------------------------------------------------*/
	funcao Maior()
	{
		para(i=0;i<8;i++)
		{
			para(j=0;j<8;j++)
			{
				se(Matriz[i][j]>maior)
				{
				maior=Matriz[i][j]
				}
			}
		}
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao Menor()
	{
		para(i=0;i<8;i++)
		{
			para(j=0;j<8;j++)
			{
				se(Matriz[i][j]<menor)
				{
				
				menor=Matriz[i][j]
				}
			}
		}
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao SomaDiagonal()
	{
		somadp = Matriz[0][0]+Matriz[1][1]+Matriz[2][2]+Matriz[3][3]+Matriz[4][4]+Matriz[5][5]+Matriz[6][6]+Matriz[7][7]
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao MatrizTransposta()
	{
		para(j=0;j<8;j++)
		{
			para(i=0;i<8;i++)
			{
				escreva(" | ",Matriz[i][j]," | ")
				
			}
			escreva("\n")
		}
		escreva("\n")
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao verificarPosicao()
	{
		inteiro num
		escreva("\nDigite o número que você deseja verificar? ")
		leia(num)
		para(i=0;i<8;i++)
		{
			para(j=0;j<8;j++)
			{
				se(num==Matriz[i][j])
				{
					escreva("\nseu número ",Matriz[i][j]," fica na linha ",i," e na coluna ",j)
				}
			}
			
		}
		
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao MultiplicarDiagonalSecundario()
	{
		Multids=Matriz[0][7]*Matriz[1][6]*Matriz[2][5]*Matriz[3][4]*Matriz[4][3]*Matriz[5][2]*Matriz[6][1]*Matriz[7][0]
	}
/*-----------------------------------------------------------------------------------------------------*/

	funcao menuInicio()
	{
	inteiro num
	enquanto(menu)
	{
	limpa()
	MostrarMatriz()
	escreva("\n1 - Mostrar Matriz\n2 - Mostrar números Pares e Impares na Matriz\n3 - Mostrar números primos na Matriz")
	escreva("\n4 - Mostrar o menor e o maior número da Matriz\n5 - Somar a diagonal principal da Matriz\n6 - Multiplicar a diagonal secundaria da Matriz")
	escreva("\n7 - Verificar o número na Matriz e falar aonde está\n8 - Gerar uma Matriz Transposta\n0 - Sair")
	escreva("\n\nEscolha sua Opção: ")
	leia(num)

	escolha(num)
	{
		caso 1:
		limpa()
		MostrarMatriz()
		u.aguarde(4000)
		pare

		caso 2:
		limpa()
		Par()
		Impar()
		u.aguarde(4000)
		pare

		caso 3:
		MostrarMatriz()
		NumPrimos()
		
		u.aguarde(5000)
		pare

		caso 4:
		MostrarMatriz()
		Maior()
		Menor()
		escreva("\nO número maior é: ",maior)
		escreva("\nO número menor é: ",menor)
		u.aguarde(4000)
		pare

		caso 5:
		limpa()
		MostrarMatriz()
		SomaDiagonal()
		escreva("\nSoma diagonal principal é: ",somadp)
		u.aguarde(4000)
		pare	

		caso 6:
		limpa()
		MostrarMatriz()
		MultiplicarDiagonalSecundario()
		escreva("\nMultiplicação do diagonal secundario é: ",Multids)
		u.aguarde(4000)
		pare

		caso 7:
		limpa()
		MostrarMatriz()
		verificarPosicao()
		u.aguarde(5000)
		pare

		caso 8:
		limpa()
		escreva("\n                    Matriz Normal \n")
		MostrarMatriz()
		escreva("\n                    Matriz Transposta \n")
		MatrizTransposta()
		u.aguarde(10000)
		pare

		caso 0:
		menu=falso
		pare

		caso contrario:
		limpa()
		escreva("Opção invalida")
		u.aguarde(3000)
		pare
	}
	}
	}
/*-----------------------------------------------------------------------------------------------------*/
	funcao inicio()
	{
	GerarMatriz()
	menuInicio()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 682; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
