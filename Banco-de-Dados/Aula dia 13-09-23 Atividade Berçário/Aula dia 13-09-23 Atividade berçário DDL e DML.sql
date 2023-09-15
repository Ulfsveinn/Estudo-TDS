create database hospital;

use hospital;
#drop database hospital;
create table especialidade(
	id int primary key auto_increment,
    nome varchar(45) not null
);
 insert into especialidade (nome) values 
 ('Obstetrícia'),
 ('Anestesia');
select * from especialidade;

create table medico(
	id int primary key auto_increment,
    nome varchar(45) not null,
    crm int not null unique,
    idEspecialidade int not null,
	foreign key(idEspecialidade) references especialidade(id)
);
desc medico;
insert into medico (nome,crm,idEspecialidade) values 
('Paulo José',102030,1),
('Aline Cunha',203040,1),
('Antônio Jose Alan',304050,1),
('Araújo',405060,1),
('João Paulo',506070,2),
('Viçosa',607080,2);
select * from medico;



create table mae(
	id int primary key auto_increment,
    nome varchar(45) not null,
    endereco varchar(55) not null,
    dataNascimento date not null
);
desc mae;
insert into mae(nome,endereco,dataNascimento) values 
('Adriana','Rua PonsalinoCardoso, 266 – VilaMaria – Alvorada/RS','1970-05-16'),
('Patricia ','Rua Áustria, 140Jdm Golden ParkResidence,Hortolândia/SP','1973-10-10'),
('Daiane','Rua Guarani, 716 –Vila Imbui –Cachoeirinha/RS','1976-04-12');
select * from mae;




create table bebe(
	id int primary key auto_increment,
    nome varchar(45) not null,
    dataNascimento date not null,
    peso float(3,2) not null,
    altura varchar(45) not null,
    idMae int not null,
    idMedico int not null,
	foreign key(idMae) references mae(id),
	foreign key(idMedico) references medico(id)
);
desc bebe;
insert into bebe (nome,dataNascimento,peso,altura,idMae,idMedico) values 
('Aléxia','2001-12-11',3.250,'49cm',3,1),
('André','1998-04-14',4.300,'49.5cm',3,5),
('Alicia','2016-07-08',3.100,'47cm',3,2),
('Natalia','1995-09-15',3.610,'50cm',1,4),
('Fernanda','1993-04-08',3.120,'50cm',1,4),
('Francine','1991-04-16',3.750,'51cm',1,6),
('Rafaela','1996-09-30',3.170,'49cm',2,4),
('Gustavo','2005-09-09',3.070,'47cm',2,3);
select * from bebe;




create table telefone(
	id int primary key auto_increment,
    ddd int not null,
    numero varchar(12) not null,
    idMedico int null,
    idMae int null,
	foreign key(idMedico) references medico(id),
    foreign key(idMae) references mae(id)
);
desc telefone;
insert into telefone (ddd,numero,idMedico,idMae) values 
(51,987654321,1,null),
(51,123456789,2,null),
(51,741258963,3,null),
(19,951753852,4,null),
(51,456321789,5,null),
(51,888997744,6,null),
(51,'99330-7083',null,1),
(19,'99335-9553',null,2),
(51,'9913-20333',null,3);
select * from telefone;

/*insert into celular (ddd,numero,idMae) values 
(51,'99330-7083',1),
(19,'99335-9553',2),
(51,'9913-20333',3);

insert into telefone (ddd,numero,idMedico) values 
(51,987654321,1),
(51,123456789,2),
(51,741258963,3,null),
(19,951753852,4,null),
(51,456321789,5,null),
(51,888997744,6,null);*/
#nome da mãe, nome do filho, data de nascimento filho, crianças que nasceram apartir de 2000

select m.nome as 'Mãe', b.nome as 'Filho', b.dataNascimento as 'Data de Nascimento' from mae m
inner join bebe b on (b.idMae=m.id)
where b.dataNascimento>'2000-01-01';

select * from bebe;

#qtd e média de peso das crianças onde dr auraujo fez parto

select count(b.id) as 'Qtd', avg(b.peso )as 'Peso', m.nome as 'Médico' from bebe b
inner join medico m on (b.idMedico=m.id and m.nome='Araújo');

#nome kid, nome mom, idade atual de todos atual dia de hoje

select  distinct(m.nome) as 'Mãe',timestampdiff(YEAR, m.dataNascimento, curdate()) as 'Idade Mães', b.nome as 'Bebê', timestampdiff(YEAR, b.dataNascimento, curdate()) as 'Idade Bebês' from mae m 
inner join bebe b on (b.idMae=m.id);

select * from mae;