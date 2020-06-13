## Trabalhando com Banco de Dados utilizando JDBC e JPA- Gradle build
### Exemplo tirado do curso da digital inovation one

> Requisitos Básicos

1. [MySQL](https://www.mysql.com/downloads/)
2. [MySQLWorkbench](https://www.mysql.com/products/workbench/)
2. [Java Development Kit(JDK) - 1.8 ou superior](https://www.oracle.com/java/technologies/javase-downloads.html)
3. [Intellij IDE ou Eclipse, NetBeans qq uma de sua preferência rs](https://www.jetbrains.com/idea/download/)
4. [Gradle 5.3.1](https://gradle.org/install/)



 > Banco de dados 
 
1- Criando o Banco de dados 
<br/>
CREATE database digital_innovation_one;


2 - Criar uma tabela no banco de dados (rodar no prompt do MySQL OU no MySQL workbench)<br/>
CREATE TABLE aluno (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    idade INTEGER NOT NULL,
    estado CHARACTER(2) NOT NULL
);

3 - Adicionar alguns exemplos (rodar no prompt do MySQL OU no MySQL workbench)<br/>
INSERT INTO aluno(nome, idade, estado) VALUES ('Pedro', 20, 'RJ');
INSERT INTO aluno(nome, idade, estado) VALUES ('Maria', 35, 'AC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Joao', 10, 'SC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Ana', 51, 'GO');