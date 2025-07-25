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
git clone https://github.com/seu-usuario/AnalisadorFrasesWeb.git
cd AnalisadorFrasesWeb

# Compile o projeto
mvn clean package

# Construa a imagem Docker
docker build -t analisador-frases-web .

# Rode o container
docker run -p 8080:8080 analisador-frases-web
```

#### Acesse a aplicação no navegador:

```
http://localhost:8080/AnalisadorFrasesWeb-1.0-SNAPSHOT/
```

---

### 🖥️ **2. Deploy manual no WildFly (standalone)**

> Útil se preferir rodar o projeto com sua própria instalação de WildFly.

#### Pré-requisitos:

- Java 8
- Maven
- WildFly 10+

#### Etapas:

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/AnalisadorFrasesWeb.git
cd AnalisadorFrasesWeb

# Compile o projeto
mvn clean package

# Copie o .war para o WildFly
cp target/AnalisadorFrasesWeb-1.0-SNAPSHOT.war $WILDFLY_HOME/standalone/deployments/

# Inicie o servidor WildFly
$WILDFLY_HOME/bin/standalone.sh
```

#### Acesse:

```
http://localhost:8080/AnalisadorFrasesWeb-1.0-SNAPSHOT/
```

---

## 🧪 Como rodar os testes unitários

```bash
mvn test
```

Os testes encontram-se na classe:

```
src/test/java/br/com/prover/analisador/FraseBeanTest.java
```

---

## 🔍 Tecnologias e Padrões Utilizados

- Java 8
- JSF 2.2
- CDI (Context and Dependency Injection)
- PrimeFaces
- Maven
- WildFly 10
- JUnit 4
- Docker (imagem WildFly + .war incluído)

---

## 📂 Estrutura do Projeto

```
AnalisadorFrasesWeb/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/prover/analisador/
│   │   │       └── FraseBean.java
│   │   └── webapp/
│   │       └── index.xhtml
│   └── test/
│       └── java/
│           └── br/com/prover/analisador/
│               └── FraseBeanTest.java
├── Dockerfile
├── pom.xml
└── README.md
```

---

## 💬 Observações

- O `FraseBean` é um ManagedBean com escopo `@ViewScoped`, facilitando a análise da frase na mesma view.
- O projeto é compatível com Linux e Windows.
- A interface gráfica é feita com **JSF + PrimeFaces**, permitindo uma experiência leve e responsiva.

---

## 👨‍💻 Autor

Carlos Lemos

---

## 📄 Licença

Distribuído sob a licença [MIT License](LICENSE).
