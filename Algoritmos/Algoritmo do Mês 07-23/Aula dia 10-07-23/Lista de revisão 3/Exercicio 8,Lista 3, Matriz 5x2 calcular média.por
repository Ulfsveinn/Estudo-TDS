programa
{
	inclua biblioteca Tipos-->t
	inclua biblioteca Util-->u
/*8. Crie um algoritmo que calcule a média dos elementos de uma matriz 5x2.*/
/*---------------------------------------------------------------------------*/
inteiro i,j,div,numInteiro
real Matriz[5][2],numReal,media=0.0

/*---------------------------------------------------------------------------*/
	funcao CriarMatriz()
	{
		para(i=0;i<5;i++)
		{
			para(j=0;j<2;j++)
			{
				numInteiro=u.sorteia(10,50)
				numReal=t.inteiro_para_real(numInteiro)
				Matriz[i][j]=numReal
				escreva(" | ",Matriz[i][j]," | ")
			}
			escreva("\n")
		}
	}
/*---------------------------------------------------------------------------*/
	funcao DivisaoMatriz()
	{
		para(i=0;i<5;i++)
		{
			para(j=0;j<2;j++)
			{
				media+=Matriz[i][j]/10
			}

		}
		escreva("\nA média da matriz é ",media)
	}
/*---------------------------------------------------------------------------*/
	funcao inicio()
	{
		CriarMatriz()
		DivisaoMatriz()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 39; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */