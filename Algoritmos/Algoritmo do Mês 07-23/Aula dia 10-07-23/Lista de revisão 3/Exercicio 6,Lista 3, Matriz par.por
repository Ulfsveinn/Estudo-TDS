programa
{
/*6. Crie um algoritmo que leia uma matriz 5x5. Em seguida, conte quantos números 
pares existem na matriz.*/

inclua biblioteca Util-->u
inteiro vetor[5][5],i,j,par=0,vetorpar[50]
/*-----------------------------------------------------------------------*/
	funcao Vetor()
	{
		escreva("\n\nVetor normal\n\n")
		para(i=0;i<5;i++)
		{
			para(j=0;j<5;j++)
			{
			vetor[i][j]=u.sorteia(0,9)
			escreva(" | ",vetor[i][j]," | ")
			}
			escreva("\n")
		}
	}
/*-----------------------------------------------------------------------*/	
	funcao Imparsomar()
	{
		para(i=0;i<5;i++)
		{
			para(j=0;j<5;j++)
			{
		se(vetor[i][j]%2==0)
		{
			par++
		}
			}
		}
		escreva("\n\nExistem ",par," números impares \n")
	}
/*-----------------------------------------------------------------------*/	
	funcao inicio()
	{
		Vetor()
		Imparsomar()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */