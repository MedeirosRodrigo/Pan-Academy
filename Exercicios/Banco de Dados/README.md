# Atividade MongoDB

Você deve criar um banco de dados novo (database) e uma coleção com um nome pertinente, de acordo com os dados e tema que você escolher. Os seguintes comandos devem ser feitos e entregues:
Inserção de documentos
Atualização de documentos
Exclusão de documentos
Consulta com projeção
Consulta utilizando combinação entre os seletores
Consulta paginada e ordenada (utilizar ignorar , limitar e classificar )

### Criando banco de dados

	use panacademia

### Criando Colection

	db.createCollection('Aulas')

### Inserindo dados

	{
	    "_id" : ObjectId("617d995f6154d40c4c0c56ef"),
	    "Professor" : {
		"nome" : "Jenifer",
		"especialidade" : "Java",
		"telefone" : "(11) 1212-12112"
	    },
	    "Aluno" : {
		"nome" : "Rodrigo Medeiros",
		"telefone" : "(11) 9888-1234",
		"Idade" : 30
	    },
	    "AtividadesJava" : "Spring Boot",
	    "AtividadesDB" : "Criar Banco de dados",
	    "Nivel" : "Iniciante",
	    "dataHora" : ISODate("2021-07-12T10:00:20.000Z")
	}

### Atualizando de documentos

	db.getCollection('Aulas').update(
   	 	// query 
   	 {
        "Aluno.nome" : "Rodrigo Medeiros"
   	 },
    
   	 // update 
   	 {
        $set: {"Nivel" : "Intermediario"}
   	 },
    
   	 // options 
   	 {
        "multi" : false,  // update only one document 
        	"upsert" : false  // insert a new document, if no existing document match the query 
   		 }
	);

### Exclusao de um documento

	db.getCollection('Aulas').remove({ 'Aluno.nome' : 'Mateus' });

### Consulta com projeção

	db.getCollection('Aulas').find({},{"Aluno.nome" : 1, "Nivel" : 1, "_id" : 0})

### Consulta utilizando combinação entre os seletores

	db.getCollection('Aulas').find({"Aluno.Idade": {$gte: 30},"Modulo" : {$gte: 2}})

### Consulta paginada e ordenada (utilizar ignorar , limitar e classificar )

	db.getCollection('Aulas').find({"Modulo" : {$gte : 3 }})

	db.getCollection('Aulas').find().sort({"Aluno.Idade": 1})

	db.getCollection('Aulas').find().limit(3)


