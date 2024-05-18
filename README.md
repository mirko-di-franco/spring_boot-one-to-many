# Relazione One To Many
Ogni `elemento` di una tabella può essere collegato a **più** elementi di un'altra tabella, ma gli `elementi` di quest'altra tabella possono essere collegati a un **solo** elemento della prima.

## Steps
1. Creare l'`entità`
    - [Entità 1](src/main/java/com/generation/relazionionetomany/entity/User.java)
    - [Entità 2](src/main/java/com/generation/relazionionetomany/entity/Photo.java)
2. Collegare le tabelle(creare la `relazione`)
    - [Many to one(tabella che ha la foreign key)](src/main/java/com/generation/relazionionetomany/entity/Photo.java)
    - [One to many](src/main/java/com/generation/relazionionetomany/entity/User.java)
3. Completare `repository`, `service`
    - [Repo 1](src/main/java/com/generation/relazionionetomany/repository/UserRepo.java)
    - [Service 1](src/main/java/com/generation/relazionionetomany/service/UserServ.java)
    - [Repo 2](src/main/java/com/generation/relazionionetomany/repository/PhotoRepo.java)
    - [Service 2](src/main/java/com/generation/relazionionetomany/service/PhotoServ.java)
4. Creare rotta `swagger`
    - [Swagger](src/main/java/com/generation/relazionionetomany/mvcController/SwaggerController.java)
    - [Dipendenza Swagger](pom.xml)
5. Creare restController `User` e `UserDTO`
    - [UserController](src/main/java/com/generation/relazionionetomany/restController/UserController.java)
    - [UserDTO](src/main/java/com/generation/relazionionetomany/dto/UserDTO.java)
6. Creare restController `Photo`
    - [PhotoController](src/main/java/com/generation/relazionionetomany/restController/PhotoController.java)
