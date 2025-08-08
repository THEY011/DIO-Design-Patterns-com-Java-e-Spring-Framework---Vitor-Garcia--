# Desafio de Projeto: DIO - Design Patterns com Java e Spring

Este projeto faz parte do Bootcamp **GFT Start 7** e tem como objetivo principal aplicar conceitos de **Design Patterns** utilizando o **Spring Framework**.

## Sobre o Projeto

O foco do desafio é implementar padrões de projeto clássicos para criar uma aplicação robusta e organizada, utilizando:

- **Singleton**
- **Strategy / Repository**
- **Facade**

Além disso, o projeto utiliza o **Spring Boot** para desenvolver uma API RESTful que suporta os métodos HTTP:

- `GET`
- `POST`
- `PUT`
- `DELETE`

## Estrutura do Projeto

O código está organizado em pacotes que separam claramente as responsabilidades, facilitando manutenção e escalabilidade:

- `controller` — Camada que recebe as requisições HTTP e controla o fluxo da aplicação.
- `service` — Implementa a lógica de negócio e aplica os Design Patterns.
- `repository` — Responsável pela comunicação com a base de dados, usando o padrão Repository.
- `model` — Contém as entidades e modelos de dados.
- `client` — Camada que faz a comunicação com APIs externas ou serviços de terceiros, facilitando a integração externa.
- `config` — Configurações gerais do Spring e do projeto.

---
