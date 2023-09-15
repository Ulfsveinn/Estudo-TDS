use exercicio_300823;

#1. Listar todos os produtos com as respectivas descrições, unidades e valores unitários, obtendo o  seguinte resultado (SELECT simples sem WHERE com especificação de todos os campos): 
select p.descricaProduto as 'Descrição', p.unidadeProduto as 'Unidade', p.valorUnitario as 'Valor Unitário' from produto p order by p.descricaProduto;#1 
------------------------------------------------------------------------------------------------------------------------------------------------------------
#2. Listar da tabela CLIENTE o CNPJ, o nome do cliente e seu endereço, obtendo o seguinte resultado (idem com especificação de parte dos campos):
select c.cnpj as 'CNPJ', c.nome as 'Nome do Cliente',endereco as 'Endereço' from cliente c order by nome asc;#2
------------------------------------------------------------------------------------------------------------------------------------------------------------
select 
c.cnpj as 'CNPJ', c.nome as 'Nome do Cliente',endereco as 'Endereço',cd.nome as 'Nome Cidade',es.nome as 'Nome Estado' from cliente c #2 melhorado
join cidade cd on (cd.id = c.idCidade)
join estado es on (es.id = cd.idEstado)
order by c.nome asc;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#3. Listar todo o conteúdo de vendedor, obtendo o seguinte resultado (SELECT sem a especificação de campos – coringa *):
select 
	v.id as 'ID Do Vendedor',v.nome as 'Nome Do vendedor', v.salarioFixo as 'Salário Fixo', v.faixaComissao as 'Faixa De Comissão' 
from 
	vendedor v;#3
------------------------------------------------------------------------------------------------------------------------------------------------------------
#4. Problema: Listar o numero do pedido, o código do produto e a quantidade dos itens do pedido com a quantidade igual a 35 da tabela item de pedido, obtendo o seguinte resultado (SELECT com WHERE):
select 
	* 
from 
	pedido_produto pp 
where 
	quantidade=35;#4

select 
	p.descricaProduto as 'Produto',pp.idPedido as 'Pedido',pp.quantidade as 'Qtde' from pedido_produto pp #4
join 
	produto p on(p.id =pp.idProduto)
where 
	pp.quantidade=35;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#5. Quais são os clientes que moram em Niterói?

select 
	c.nome as 'Nome Do cliente', cd.nome as 'Nome Da Cidade'  
from 
	cliente c
join 
	cidade cd on (cd.id=c.idCidade)
where 
	cd.nome='Niterói'
order by 
	c.nome asc;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#6.Listar os produtos que tenham unidade igual a ‘M’ e valor unitário igual a R$ 1,05 da tabela produto, obtendo o seguinte resultado (operadores lógicos):
select 
	p.descricaProduto as 'Nome Produto', p.valorUnitario as 'Valor'
from 
	produto p 
where 
	unidadeProduto='M' 
and 
	valorUnitario=1.05;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#7. Listar o código e a descrição dos produtos que tenham o valor unitário na faixa de R$ 0,32 até R$ 2,00, obtendo o seguinte resultado (operador between):

select p.id as 'ID',p.descricaProduto as 'Descrição Produto',p.valorUnitario as 'Valor'				#BETWEEN
from produto p
where p.valorUnitario between 0.32 and 2.00
order by p.valorUnitario asc;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#8. Listar todos os produtos que tenham o seu nome começando por Q, obtendo o seguinte resultado (operador LIKE, com os coringas _ - um caractere - e % - vários caracteres):
select p.id as 'Id Produto',p.descricaProduto as 'Descrição' from produto p where p.descricaProduto like'q%';
------------------------------------------------------------------------------------------------------------------------------------------------------------
#9. Listar os vendedores que não começam por ‘Jo’, , obtendo o seguinte resultado (operador LIKE, com os coringas _ - um caractere - e % - vários caracteres):
select v.id as 'Id Vendedor', v.nome as 'Nome Vendedor' from vendedor v where v.nome not like 'jo%' order by v.nome asc;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#10. Listar os vendedores que são da faixa de comissão A e B, obtendo o seguinte resultado (operadores IN e um conjunto de valores):			#IN
select v.nome as 'Nome Vendedor', v.faixaComissao as 'Faixa Comissão'  from vendedor v where v.faixaComissao in ('A','B') order by v.nome asc ;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#11. Mostrar os clientes que não tenham inscrição estadual, obtendo o seguinte resultado (IS NULL):
select c.id as 'Id Cliente',c.nome as 'Nome Cliente', c.ie as 'Inscrição Estadual' from cliente c where c.ie is null;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#12. Mostrar em ordem alfabética a lista de vendedores e seus respectivos salários fixos, obtendo o seguinte resultado (ORDER BY [ASC/DESC]):
select v.nome as 'Nome Vendedor', v.salarioFixo as 'Salário Atual',(v.salarioFixo*1.0675) as 'Salario Simulado' from vendedor v  order by v.nome asc;
select v.nome as 'Nome Vendedor', v.salarioFixo as 'Salário Fixo' from vendedor v order by v.nome desc;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#13. Listar os nomes, cidades e estados de todos os clientes, ordenados por estado e cidade de forma descendente, obtendo o seguinte resultado (operador ORDER BY com mais de um campo especificado):
select c.nome as ' Cliente', e.nome as 'Estado', cd.nome as 'Cidade' from cliente c 
join cidade cd on (cd.id=c.idCidade)
join estado e on (e.id=cd.idEstado)
 order by e.nome desc, cd.nome desc;
 ------------------------------------------------------------------------------------------------------------------------------------------------------------
 #14. Mostrar a descrição e o valor unitário de todos os produtos que tenham a unidade ‘M’, em ordem de valor unitário ascendente, obtendo o seguinte resultado (ORDER BY):
 select p.descricaProduto as 'Descrição', p.valorUnitario as 'Valor' 
 from produto p
 where p.unidadeProduto='M'
 order by p.valorUnitario asc;
 ------------------------------------------------------------------------------------------------------------------------------------------------------------
 #15. Mostrar o novo salário fixo dos vendedores, de faixa de comissão ‘C’, calculado com base no reajuste de 75% acrescido de R$ 120,00 de bonificação. Ordenar pelo nome do vendedor, obtendo 
 #o seguinte resultado (coluna calculda):
 select nome as 'Nome Vendedor',salarioFixo as 'Salario atual',((salarioFixo*1.75)+120) as 'Novo Salario'
 from vendedor
 where faixaComissao='C'
 order by nome asc;
 ------------------------------------------------------------------------------------------------------------------------------------------------------------
 #16 Mostrar o menor e o maior salários da tabela vendedores, obtendo o seguinte resultado (funções MAX() e MIN()):
 select min(salarioFixo),max(salarioFixo) from vendedor;
 ------------------------------------------------------------------------------------------------------------------------------------------------------------
 #17. Mostrar a quantidade total pedida para o produto ‘VINHO’ de código ‘78’ na tabela item de pedido, obtendo o seguinte resultado (função SUM() com cláusula WHERE): 
 select sum(pp.quantidade) as 'QTDE VINHOS VENDIDOS'
 from pedido_produto pp
 where pp.idProduto=78;
 ------------------------------------------------------------------------------------------------------------------------------------------------------------
#18. Qual a média dos salários fixos dos vendedores (função AVG())?
select avg(salarioFixo) as 'Média salarial', count(nome) as 'Quantidade' from vendedor;
 ------------------------------------------------------------------------------------------------------------------------------------------------------------
 #19. Quantos vendedores ganham acima de R$ 2.500,00 de salário fixo (função COUNT() com cláusula WHERE)? 
 select count(*) from vendedor v
 where salarioFixo>2500;
------------------------------------------------------------------------------------------------------------------------------------------------------------
select * from produto;
#20. Quais são as unidades de produtos, diferentes, na tabela produto (cláusula DISTINCT)?
select distinct (unidadeProduto) as 'Unidade' from produto p;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#21. Listar a quantidade de produtos que cada pedido contém.
select * from pedido;
select p.id as 'Pedido',count(pp.quantidade) as '	Qtde' from pedido p
join pedido_produto pp on(p.id=idPedido)
group by p.id order by p.id;
#OU
select pp.idPedido as 'Pedido',count(pp.quantidade) as 'Qtde' 
from pedido_produto pp 
group by pp.idPedido order by pp.idPedido;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#22. Listar os pedidos que tem mais de três produtos. 
select pp.idPedido as 'Pedido',count(pp.quantidade) as 'Qtde' 
from pedido_produto pp 
group by pp.idPedido 
having count(pp.quantidade)>3;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#23. Ver os pedidos de cada cliente, listando nome do cliente e número do pedido (INNER JOIN). 
select * from pedido;
select c.nome as'Cliente', p.idCliente as 'Número' 
from cliente c
inner join pedido p on (c.id=p.idCliente)
order by c.nome;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#24. Listar a junção de clientes com pedidos (CROSS JOIN).
select * from cliente c
cross join pedido p;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#25. Listar todos os clientes com seus respectivos pedidos. Os clientes que não têm pedidos também  devem ser apresentados (OUTER JOIN). 
select c.nome as'Clientes',p.id as 'Pedidos' from cliente c 
left join pedido p on (c.id=p.idCliente)
order by c.nome;
use exercicio_300823;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#26. Clientes com prazo de entrega superior a 15 dias e que pertençam aos estados de São Paulo ou Rio de Janeiro (INNER JOIN com WHERE).
select distinct(c.nome) as 'Cliente',p.prazo as 'Prazo',e.uf as 'Estado' from cliente c
inner join pedido p on(c.codigo=p.codigoCliente  and prazo>15)
inner join cidade cd on (cd.codigo=c.codigoCidade)
inner join estado e on (e.codigo=cd.codigoEstado)
where e.uf in('SP','RJ')
order by c.nome asc;
use lojinhaprof;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#27. Mostrar os clientes e seus respectivos prazos de entrega, ordenando do maior para o menor. 
select distinct(c.nome) as 'Cliente', p.prazo as 'Prazo' from cliente c
inner join pedido p on (c.codigo=p.codigoCliente)
order by p.prazo desc, c.nome asc;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#28. Modifique o exemplo acima para apresentar apenas prazos de entrega diferentes para cada cliente. 
select distinct(p.prazo) as 'prazo',c.nome as 'Cliente' from cliente c
inner join pedido p on (c.codigo=p.codigoCliente)
order by p.prazo desc, c.nome asc;
------------------------------------------------------------------------------------------------------------------------------------------------------------
#29. Apresentar os vendedores, em ordem alfabética, que emitiram pedidos com prazos de entrega superiores a 15 dias e que tenham salários fixos iguais ou superiores a R$ 1.000,00. 
select distinct(v.nome) as 'Nome Vendedor', v.salario as'Salario' from vendedor v 
inner join pedido p on (v.codigo=p.codigoVendedor and p.prazo>15)
where v.salario>=1000
order by v.nome asc;
select distinct(p.codigoVendedor) from pedido p where p.prazo>15;
select * from pedido;
select * from vendedor v where v.salario>=1000; 

select v.nome 
from  vendedor v 
where v.salario>=1000
and v.codigo in(select distinct(codigoVendedor) from pedido where prazo>15)
order by v.nome asc; 

------------------------------------------------------------------------------------------------------------------------------------------------------------
#30. Mostre os clientes, em ordem alfabética, que têm prazo de entrega maior que 15 dias para o produto Queijo e que sejam do Rio de Janeiro.

------------------------------------------------------------------------------------------------------------------------------------------------------------ 
#31. Mostre todos os vendedores que venderam chocolate em quantidade superior a dez quilos. 
------------------------------------------------------------------------------------------------------------------------------------------------------------
#32. Quantos clientes fizeram pedidos com o vendedor João? 
------------------------------------------------------------------------------------------------------------------------------------------------------------
#33. Quais os clientes da cidade Rio de Janeiro e Niterói que tiveram seus pedidos tirados pelo vendedor João? 
------------------------------------------------------------------------------------------------------------------------------------------------------------
#34. Que produtos participaram de qualquer pedido cuja quantidade seja 10? 
------------------------------------------------------------------------------------------------------------------------------------------------------------
#35. Quais os vendedores ganham um salário fixo abaixo da média? 
------------------------------------------------------------------------------------------------------------------------------------------------------------
#36. Quais os produtos que não estão presentes em nenhum pedido? 
------------------------------------------------------------------------------------------------------------------------------------------------------------
#37. Quais os vendedores que só venderam produtos por grama? 
------------------------------------------------------------------------------------------------------------------------------------------------------------
#38. Quais os clientes que estão em mais de três pedidos? 
------------------------------------------------------------------------------------------------------------------------------------------------------------
#39. Criar uma nova tabela como resultado de um select (cláusula INTO).

#Aula 05-09-23

use lojinhaprof;


#todas as quantidades de cidades do SP que não tem clientes cadastrados.alter

select count(cd.nome) as 'Cidades' 
from cliente c
right join cidade cd on (cd.codigo=c.codigoCidade)
join estado e on (e.codigo=cd.codigoEstado)
where e.uf='SP' and c.nome is null;


select * from cidade;

