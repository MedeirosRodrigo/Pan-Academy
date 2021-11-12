# Atividade MySql

	Criar uma tabela de Estados com id, nome, sigla(utilizar ENUM), região utilizar ENUM (), população.
	- Id deve ser a PK
	- nome campo único
	- Inserir 10 estados (dois de cada região)
	- Listar estados ordenando por sigla
	- Encontrar a população total de cada região
	- Encontrar a média da população por região
	- Agrupar estados por região

### Criando a tabela
	CREATE DATABASE estados;

	USE estados;

	CREATE TABLE estados (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	nome_estado VARCHAR(20) NOT NULL,
	sigla ENUM('RS','SC','RJ','MG','PB','AL','AM','AP','MT','GO'),
	regiao ENUM('Sul','Sudeste','Centro Oeste','Nordeste','Norte'),
	populacao INT NOT NULL,
	UNIQUE KEY (nome_estado),
	PRIMARY KEY (id) 
	);
	
### Inserir 10 estados (dois de cada região

	INSERT INTO estados (nome_estado, sigla, regiao, populacao) 
	VALUES 
	("Rio Grade do sul","RS", "Sul",'11290000'),
	("Santa Catarina","SC","Sul",'7165000'),
	("Rio de janeiro","RJ","Sudeste",'16460000'),
	("Minas Gerais","MG","Sudeste",'20870000'),
	("Pernanbuco","PB","Nordeste",'9278000'),
	("Alagoas","AL","Nordeste",'3220000'),
	("Amazonas","AM","Norte",'3874000'),
	("Amapa","AP","Norte",'751000'),
	("Goias","GO","Centro Oeste",'6523000'),
	("Mato Grosso","MT","Centro Oeste", '3224000')
	;

### Listar estados ordenando por sigla

	SELECT * from estados ORDER BY sigla;

### Encontrar a população total de cada região

	SELECT regiao, SUM (populacao) AS total_regiao FROM estados GROUP BY regiao;

### Encontrar a média da população por região

	SELECT regiao, AVG (populacao) AS Media FROM estados GROUP BY regiao;

### Agrupar estados por região

	SELECT regiao, group_concat(sigla SEPARATOR ' , ') as nome_estados FROM estados GROUP BY regiao;
	

