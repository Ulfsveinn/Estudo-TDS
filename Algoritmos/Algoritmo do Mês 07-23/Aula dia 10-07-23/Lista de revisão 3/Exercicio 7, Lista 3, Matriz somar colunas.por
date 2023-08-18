programa
{
	inclua biblioteca Util-->u	
/*7. Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das 
colunas da matriz. Ex: 
 Soma da coluna 1: 8
 Soma da coluna 2: 5
 Soma da coluna 3: 6*/

	inteiro Matriz[3][3],i,j,soma=0
/*---------------------------------------------------------------------------*/	
	funcao CriarMatriz()
	{
		para(i=0;i<3;i++)
		{
			para(j=0;j<3;j++)
			{
				Matriz[i][j]=u.sorteia(0, 9)
				escreva(" | ",Matriz[i][j]," | ")
			}
				escreva("\n")
		}
	}
/*---------------------------------------------------------------------------*/
	funcao SomarMatriz()
	{
		para(j=0;j<3;j++)// aqui deve mudar a ordem porque eu quero somar apenas as colunas e por isso o "j" subiu e o "i" desceu
		{
			para(i=0;i<3;i++)
			{
				soma+=Matriz[i][j]
			}
			escreva("\nA soma das colunas ",j, " é: ",soma)
			soma=0
		}
	}
/*---------------------------------------------------------------------------*/
	funcao inicio()
	{
		CriarMatriz()
		SomarMatriz()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 732; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */