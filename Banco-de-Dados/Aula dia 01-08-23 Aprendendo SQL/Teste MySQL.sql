 CREATE DATABASE teste;
 
 USE teste;
 
 CREATE TABLE IF NOT EXISTS testes_livro (
	id_teste smallint AUTO_INCREMENT PRIMARY KEY,
    nome_teste varchar(50) NOT NULL,
    data_teste  date NOT NULL,
    preco_teste decimal NOT NULL
    );
    
    SHOW TABLES;