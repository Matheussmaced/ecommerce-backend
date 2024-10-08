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

    users "1" --> "0..1" cart : "possui"
    cart --> "0..*" product : "contém"

```