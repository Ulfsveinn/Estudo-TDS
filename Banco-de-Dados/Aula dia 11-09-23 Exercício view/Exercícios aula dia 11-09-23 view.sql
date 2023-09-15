#26. Clientes com prazo de entrega superior a 15 dias e que pertençam aos estados de São Paulo ou Rio de Janeiro (INNER JOIN com WHERE).
create view prazo_estado_RJ_SP as 
select distinct(c.nome) as 'Cliente',p.prazo as 'Prazo',e.uf as 'Estado' from cliente c
inner join pedido p on(c.codigo=p.codigoCliente  and prazo>15)
inner join cidade cd on (cd.codigo=c.codigoCidade)
inner join estado e on (e.codigo=cd.codigoEstado)
where e.uf in('SP','RJ')
order by c.nome asc;

select * from  prazo_estado_RJ_SP;

#13. Listar os nomes, cidades e estados de todos os clientes, ordenados por estado e cidade de forma descendente, obtendo o seguinte resultado (operador ORDER BY com mais de um campo especificado):
create view estado_cidade_cliente as
select c.nome as ' Cliente', e.nome as 'Estado', cd.nome as 'Cidade' from cliente c 
join cidade cd on (cd.codigo=c.codigoCidade)
join estado e on (e.codigo=cd.codigoEstado)
 order by e.nome desc, cd.nome desc;

select * from  estado_cidade_cliente;


#5. Quais são os clientes que moram em Niterói?
create view clientes_Niteroi as
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

select * from  clientes_Niteroi;
