#Aula_28-08-23

use sistema;

desc pessoa;

alter table pessoa change cpf cpf varchar(11) not null unique;  

select * from cidade where nome ='Porto Alegre' and codigoEstado=23;
select * from estado where codigo = '23';
select codigo from cidade where nome = 'Porto Alegre' and codigoEstado='23';
select * from cidade;

insert into pessoa (nome,cpf,codigoCidade) values ('André','78952641251',4237);
insert into pessoa(nome,cpf,codigoCidade) values ('Marta','45896475365',4237),('André','12354846985',4237);
select* from pessoa;
desc pessoa;

#delete from pessoa where codigo=1; / exclui 

alter table pessoa auto_increment = 1;

select * from estado;

select * from cidade where codigoEstado = '23';

update pessoa set nome ='André Luis Mesquita' where codigo = 1; #Atualiza as informações caso precise, att o nome/"update(tabela) set (coluna) = ('nformação que vc deseja att') where (coluna) = ..."

update pessoa set nome ='Pessoa x' where codigo = 3;

select * from pessoa;

update pessoa set cpf ='32254842541' where codigo= 1;

update pessoa set cpf ='15423659421' where cpf= '32254842541';#quando não temos a informação do "id=codigo" podemos modificar da forma que está ali, ex:"update (tabela) set (coluna) = ('informação nova') where cpf = ('informação antiga');