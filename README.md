```mermaid
classDiagram
    class users {
        -String email
        -String password
        -String cpf
        -String cep
    }

    class product {
        +String nameImage
        +String productName
        +String value
        +String size
    }

    class cart {
        +product[] products
    }

    user --> cart : "toAdd"
    cart --> product : "contains"
```