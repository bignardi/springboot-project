<h1 align="center">
    <br>WEB SERVICE SPRING BOOT JPA / HIBERNATE 1.0<br/>
    Spring Boot | Java | PostgreSQL | Heroku
</h1>

<p align="center">
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/bignardi/api-springboot?style=flat-square">
    <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/bignardi/api-springboot?style=flat-square">
    <img alt="GitHub" src="https://img.shields.io/github/license/bignardi/api-springboot?style=flat-square">
</p>

<p align="center">
    <a href="#bookmark-About-this-project">About</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#rocket-Technologies-used">Technology</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#boom-How-to-run">How to run</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#memo-License">License</a>
</p>

## :bookmark: About this project

The **WEB SERVICE SPRING BOOT JPA / HIBERNATE** project is a small CRM project, where users can place orders, register products and users. The structure is established in Heroku and provisioned in the PostgreSQL database. The backend link on Heroku can be accessed here: https://web-service-spring.herokuapp.com/

## :rocket: Technologies used

- Java version 11
- Spring Boot version 2.4.2
- Maven Version 4.0.0
- PostgreSQL database Version 13

## :wrench: Tools
- Spring Tool Suite 4
- pgAdmin
- Heroku
- Postman

<p align="center">
<h4 align="left">Backend Structure</h4>
    <img alt="Backend Structure" width="650px" src="./.github/logical_layer.PNG" />
<p>

<p align="center">
<h4 align="left">Domain Model</h4>
    <img alt="Spring Boot" width="650px" src="./.github/domain_model.PNG" />

<h4 align="left">Domain Instance</h4>
    <img alt="Spring Boot" width="650px" src="./.github/domain_instance.PNG" />
<p>

<p align="center">
<h4 align="left">Database PostgreSQL</h4>
    <img alt="MongoDB Compass" width="650px" src="./.github/postgresql.PNG" />
<p>

<p align="center">
<h4 align="left">Spring Tool Suit</h4>
    <img alt="Spring Boot" width="650px" src="./.github/spring.PNG" />
<p>

<p align="center">
<h4 align="left">Checking endpoints with Postman</h4>
    <img alt="Post" width="650px" src="./.github/postman.PNG" />
<p>

<p align="center">
<h4 align="left">Technology</h4>
    <img alt="Post" width="650px" src="./.github/tecnologias.PNG" />
<p>

## :boom: How to run

- ### **Requirements**

  - It is **necessary** to have the Java 11 version installed and with the environment variable properly allocated for operation.
  - It is necessary to have the version of Spring Tool Suit 4 for the project to function properly.
  - For quick endpoint testing, the project has the H2 database and a local PostgreSQL dev base, for which version 13 of PostegreSQL must be installed to work, the bank script is in the database folder. To test the endpoint on the prod base, simply access the project on Heroku: https://web-service-spring.herokuapp.com/
  

## :memo: License

This project is under the MIT license.
