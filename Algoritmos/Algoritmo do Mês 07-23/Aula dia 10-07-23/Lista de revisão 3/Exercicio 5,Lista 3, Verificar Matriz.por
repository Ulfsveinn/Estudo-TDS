programa
{
/*5. Escreva um algoritmo que leia uma matriz 4x3. Em seguida, receba um novo valor 
do usuário e verifique se este valor se encontra na matriz. Caso o valor se 
encontre na matriz, escreva a mensagem “O valor se encontra na matriz”. Caso 
contrário, escreva a mensagem “O valor NÃO se encontra na matriz”.*/
/*----------------------------------------------------------------------------*/	
	inclua biblioteca Util-->u
	inteiro Matriz[4][3],i,j,num,numloop=0
	logico verificar=falso
/*----------------------------------------------------------------------------*/	
	funcao CriarMatriz()
	{
		para(i=0;i<4;i++)
		{
			para(j=0;j<3;j++)
			{
				Matriz[i][j]=u.sorteia(0,9)
				escreva(" | ",Matriz[i][j]," | ")
			}
			escreva("\n")
		}
	}
/*----------------------------------------------------------------------------*/	
	funcao VerificarMatriz()
	{
		enquanto(numloop<12)
		{
		verificar=falso
		escreva("\nQual valor você deseja verificar? ")
		leia(num)
		
		para(i=0;i<4;i++)
		{
			para(j=0;j<3;j++)
			{
				se(Matriz[i][j]==num)
				{
					verificar=verdadeiro
				}
			}
		}
		se(verificar)
				{
					limpa()
					escreva("O valor se encontra na matriz\n")
					u.aguarde(3000)
				}
				senao
				{
					limpa()
					escreva("O valor NÃO se encontra na matriz\n")
					u.aguarde(3000)
				}
				numloop++
		}
	}
/*----------------------------------------------------------------------------*/	
	funcao inicio()
	{
		CriarMatriz()
		VerificarMatriz()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */