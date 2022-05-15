

## MySQL.
`docker-compose up`

## Install dependencies.
`gradle build --refresh-dependencies`

## Entity Relationship

```mermaid
  erDiagram
    role ||--|{ user : id_role
    role {
        int id PK "Role #"
        string name
        string description
    }
    user ||--|{ employee : id_usuario
    user {
        int id PK "User #"
        string username
        string email
        string password
        int id_role FK
    }
    employee ||--|{ commercial_area : id_commercial_area
    employee {
        int id PK "Employee #"
        string name
        string lastname
        string phone
        int id_commercial_area FK
        int id_usuario FK
    }
    commercial_area {
        int id PK "Comercial Area #"
        string nombre
        string description
    }
```

## Insert data 
`resources/META-INF/sql/create.sql`


## Run project locally
`gradle tomcatRunWar`


## Use
Go to http://localhost:8080/ClienteUMB


## Autor
- [Nelson Castellanos](https://www.linkedin.com/in/nelson-javier-castellanos-garz%C3%B3n-b66861173/)
