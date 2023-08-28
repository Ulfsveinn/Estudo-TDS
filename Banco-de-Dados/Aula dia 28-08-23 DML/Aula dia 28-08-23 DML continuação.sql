use sistema;

select * from cidade where codigoEstado=23 order by nome desc;#mostra todas as cidades do estado do rs em forma decrescente="desc". caso queira fazer na forma crescente é "asc" mas por default é "asc".
select * from cidade where codigoEstado=23;

select c.nome as 'CIDADE', e.nome as 'ESTADO', e.sigla as 'UF' from cidade c, estado e where c.codigoEstado = e.codigo order by c.nome desc;

select * from cidade where codigoEstado=26 order by nome asc;

select s.nome as 'CIDADE', e.nome as 'ESTADO', e.sigla as 'UF' from cidade s , estado e where s.codigoEstado = e.codigo and e.sigla = 'SP';