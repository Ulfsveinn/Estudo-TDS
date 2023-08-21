#criando meu banco de dados
create database aula_2108;
use aula_2108; 
#o "use" é usado apenas para utilizar o bando de dados "aula_2108", deve ser selecionado antes de executar.
#drop database aula_2108; 
#o "drop" é usado para excluir toda a base do banco de dados, cuidado ao usar.
create table cliente(
	id int primary key auto_increment, 
    #não precisa colocar "not null" no id pq ele ja é uma chave primaria e auto incrementação
	#e ele nunca sera nulo, então colocar "not null" seria um comando redundante
    nome varchar(255) not null,
    idade int null default 25  
    #o ultimo comando não pode ter virgula 
    #"null": idade pode ser null pq caso o usuario não queira colocar a idade o espaço continuara nulo. não colcocar nada também serve.
    #"default 25": caso o usuario n informe a idade ele irá colocar automaticamente 25 anos.
    #"unique": ele irá definir que aquele número sera unico e não irá repetir jamais.
);
desc cliente; # aqui irá mostrar a tebela "desc=describe"
#drop table cliente; # deleta a tabela

create table categoria(
	id int primary key not null auto_increment,
    nome varchar(45) not null
);
#drop table categoria;
desc categoria;

create table produto(
	id int primary key not null auto_increment,
    nome varchar(45) not null,
    preco float(10,2),
    idCategoria int not null,
    foreign key(idCategoria) references categoria(id)
    #"foreign key" deve ser embaixo e dentro dela vc irá colocar o campo que vc deseja que sejá a chave estrangeira.
    #"references" irá fazer uma referencia ou conectar com a tabela categoria definindo que o id da tabela categoria seja a chave estrangeira na tabela produtos.
);
#drop table produto;
desc produto;

create table pedido(
	id int primary key not null auto_increment,
    numero int not null unique,
    dataPedido datetime,
    idCliente int not null,
    foreign key(idCliente) references cliente(id)
);
#drop table pedido;
desc pedido;