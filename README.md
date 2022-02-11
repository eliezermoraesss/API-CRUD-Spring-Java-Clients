# API CRUD de Clientes

This project is an implementation of a basic CRUD using RESTful principles.<br>

# About<br>
The main goal of this project is to serve as a basis to start the development of a new REST API.<br>

# Technologies<br>
Spring Boot<br>
Spring Data JPA<br>
ORM<br>
H2 Database <br>

# Features
DTO (Data Transfer Object) principles<br>
Automaticaly converter DTO to Entity<br>
Custom Exception Handler messages<br>
Resources (REST Controller)<br>
DTO<br>
Services<br>
Entities<br>
Respositories<br>

# Built With<br>
Spring Initializr<br>
Maven<br>

How can I test my endpoints?<br>

For tests cases, you can check the API endpoints with Postman.<br>

[Postman Collection](https://www.postman.com/)

Desafio para entregar (trabalho final do capítulo)
Enunciado
Você deverá entregar um projeto Spring Boot 2.4.x contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:
Busca paginada de recursos
Busca de recurso por id
Inserir novo recurso
Atualizar recurso
Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar Maven como gerenciador de dependência, e Java 11 como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no diagrama):

Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS (não é para usar dados sem significado como “Nome 1”, “Nome 2”, etc.).

Atenção: lembre-se de que por padrão a JPA transforma nomes de atributos em camelCase para snake_case, como foi o caso do campo imgUrl do DSCatalog, que no banco de dados tinha o nome img_Url. Assim, o campo birthDate acima será criado no banco de dados como birth_Date, então seu script SQL deverá seguir este padrão.

Como o trabalho será corrigido?
1) Importação do projeto
O professor deverá ser capaz de fazer um simples clone do projeto Github, e importar e executar o mesmo no STS sem necessidade de qualquer configuração especial diferente daquelas das aulas.
2) Testes manuais no Postman
O professor já terá preparado em seu computador as requisições Postman abaixo. Todas elas deverão funcionar corretamente:
Busca paginada de clientes
GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name

Busca de cliente por id
GET /clients/1

Inserção de novo cliente
POST /clients
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}

Atualização de cliente
PUT /clients/1
{
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}

