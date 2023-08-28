#criando meu banco de dados
create database sistema;
use sistema;

create table cidade (
codigo int primary key auto_increment,
nome varchar (100) not null
);

create table estado(
	codigo int primary key auto_increment,
	nome varchar(100) not null,
    sigla varchar(2) not null
);

create table pessoa (
	codigo int primary key auto_increment,
    nome varchar(100) not null,
    cpf varchar(11) default '00000000000'
);

alter table cidade
add column codigoEstado int not null;
 
 
 alter table cidade
 add constraint fk_estado foreign key(codigoEstado) references estado(codigo);
 

 alter table pessoa
 add column codigoCidade int not null;

 
 alter table pessoa
 add constraint fk_cidade foreign key(codigoCidade) 
 references cidade(codigo);
 
 # comandos DML
 # selecionando todos os dados da tabela
 select * from estado; # seleciona todos os dados dessa tabela
 insert into estado (nome,sigla)  values ('Rio Grande do Sul','RS'); #não tem necessidade definir o valor "codigo" por conta dele ja ser um auto_increment, ele ja vai incrementar automaticamente a ordem númerica.
 insert into estado (nome,sigla)  values ('Santa Catarina','SC');
 insert into estado (nome,sigla)  values ('Paraná','PR');
 insert into estado (nome,sigla) values ('Espírito Santo','ES');
 insert into estado (nome,sigla) values ('Rio de Janeiro','RJ');
insert into estado (nome,sigla) values ('Minas Gerais','MG');
insert into estado (nome,sigla) values ('São Paulo','SP');

 #Outra forma - insert em lote
 #INSERIR NA TABELA ESTADO, TODOS OS ESTADOS DA REGIÃO NORTE EM LOTE
 
 insert into estado(nome,sigla) values 
 ('Amazonas','AM'),('Pará ','PA'),('Acre ','AC'),('Roraima ','RR'),('Rondônia ','RO'),
 ('Amapá ','AP'),('Tocantins ','TO');
 
 desc estado;
 
 insert into estado(nome) values('xxx');#executa mas avias que a coluna sigla não pode ser vazia.
 insert into estado(nome,sigla) values('yyy',null);#não executa e não aceita porque a coluna não poode ser nula.
  insert into estado(nome,sigla) values('zzz','');#executa  numa boa porque '' não é vazio, é alguma coisa

insert into estado values(null,'teste2','22');#

show tables;#mostra as tabelas criadas

desc cidade;
select * from cidade;
select * from estado;
insert into cidade(nome,codigoEstado) values ('Porto Alegre',1);

insert into cidade(nome,codigoEstado) values
('Curitiba',3),('Florianópolis',2),('Canoas',1);
