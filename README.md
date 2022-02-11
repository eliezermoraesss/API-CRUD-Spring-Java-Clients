# API CRUD de Clientes

## Technologies<br>
Spring Boot<br>
Spring Data JPA<br>
ORM<br>
H2 Database <br>

## Features
DTO (Data Transfer Object) principles<br>
Automaticaly converter DTO to Entity<br>
Custom Exception Handler messages<br>
Resources (REST Controller)<br>
DTO<br>
Services<br>
Entities<br>
Respositories<br>
Exceptions<br>

## Built With<br>
Spring Initializr<br>
Maven<br>

How can I test my endpoints?<br>

For tests cases, you can check the API endpoints with Postman.<br>

[Postman Collection](https://www.postman.com/)<br>

## Endpoints: 
Busca paginada de recursos<br>
Busca de recurso por id<br>
Inserir novo recurso<br>
Atualizar recurso<br>
Deletar recurso<br>
<br>
O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar Maven como gerenciador de dependência, e Java 11 como linguagem.
<br>
Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no diagrama):<br>

Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS (não é para usar dados sem significado como “Nome 1”, “Nome 2”, etc.).<br>

Atenção: lembre-se de que por padrão a JPA transforma nomes de atributos em camelCase para snake_case, como foi o caso do campo imgUrl do DSCatalog, que no banco de dados tinha o nome img_Url. Assim, o campo birthDate acima será criado no banco de dados como birth_Date, então seu script SQL deverá seguir este padrão.<br>

## Testes manuais no Postman<br>

GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name<br>

### Busca de cliente por id<br>
GET /clients/1<br>

### Inserção de novo cliente<br>
POST /clients<br>
{<br>
  "name": "Maria Silva",<br>
  "cpf": "12345678901",<br>
  "income": 6500.0,<br>
  "birthDate": "1994-07-20T10:30:00Z",<br>
  "children": 2<br>
}<br>

### Atualização de cliente<br>
PUT /clients/1<br>
{<br>
  "name": "Maria Silvaaa",<br>
  "cpf": "12345678901",<br>
  "income": 6500.0,<br>
  "birthDate": "1994-07-20T10:30:00Z",<br>
  "children": 2<br>
}<br>

