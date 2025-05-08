# Primeira API RESTful
Java RESTful API criada para o Bootcamp Bradesco - Java Cloud Native

## Diagrama de classes

 ```mermaid
classDiagram
  class User {
    +String name
    +Account account
    +Feature[] features
    +Card card
    +News[] news
  }

  class Account {
    +String number
    +String agency
    +Float balance
    +Float limit
  }

  class Feature {
    +String icon
    +String description
  }

  class Card {
    +String cardNumber
    +Float cardLimit
  }

  class News {
    +String newsIcon
    +String newsDescription
  }

  User *-- Account
  User *-- Card
  User *-- "0..*" Feature
  User *-- "0..*" News
```
