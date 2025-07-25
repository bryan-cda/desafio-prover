# desafio-prover
Desenvolver um sistema web que receba uma frase digitada pelo usuário e retorne a quantidade de palavras distintas, bem como a quantidade de ocorrências de cada palavra encontrada na frase.

# 🧠 Analisador de Frases Web

Este é um sistema web desenvolvido com **Java EE (JSF + CDI)** que permite ao usuário digitar uma frase e obter:

- ✅ A **quantidade de palavras distintas**
- ✅ A **quantidade de ocorrências** de cada palavra

Este projeto foi criado como parte de um **desafio técnico**, com foco em clareza, simplicidade e boas práticas de desenvolvimento Java Web.

---

## 🚀 Como rodar o projeto

Você pode executar a aplicação de duas formas:

### 🔧 **1. Usando Docker (recomendado)**

> Já incluído no projeto — zero configuração de ambiente!

#### Pré-requisitos:

- [Docker](https://www.docker.com/) instalado (Linux, Windows ou WSL)

#### Execute os comandos:

```bash
# Clone o repositório
git clone git@github.com:bryan-cda/desafio-prover.git
cd AnalisadorFrasesWeb

# Compile o projeto
mvn clean package

# Construa a imagem Docker
docker build -t analisador-frases-web .

# Rode o container
docker run -p 8080:8080 analisador-frases-web

