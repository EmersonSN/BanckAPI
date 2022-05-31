<h1 align="center">API com CRUD em Kotlin</h1>
<h4>
    Criando projeto API em kotlin com CRUD, o material seguido está a baixo:
</h4>
<p>https://www.youtube.com/watch?v=9ysYuVJSKAQ&t=596s</p>
<p>Kotlin, Spring e MongoDB - Criando um CRUD de uma API Rest | HANDS ON</p>

<h3> Usaremos nesse projeto: </h3>

<!--ts-->
   * Kotlin
   * Spring
   * MongoDB
<!--te-->

<h3>Endpoints:</h3>
<strong>Create</strong><br>
POST http://localhost:8080/accounts

```
"name": "Owner-name",
"Document": "Document-number"
```
<hr>
<strong>Read</strong><br>
GET http://localhost:8080/accounts
<hr>
<strong>Update</strong><br>
PUT http://localhost:8080/account/{Document}

```
"name": "Owner-name",
"Document": "Document-number"
"balance": "Value"
```
<hr>
<strong>Delete</strong><br>
DELETE http://localhost:8080/account/{Document}

<h3 align="center"> 
	🚧  Status do projeto: Em construção  🚧
</h3>