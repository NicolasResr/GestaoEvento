# 🔥 Sistema de Gerenciamento de Eventos - Spring Boot Edition

Bem-vindo ao sistema definitivo de **gestão de eventos**, desenvolvido com **Java 21 + Spring Boot**!  
Aqui, você pode **criar eventos épicos**, **cadastrar participantes** e **gerenciar inscrições com controle de vagas**. Tudo isso com uma arquitetura sólida, endpoints bem definidos e um time afiado por trás! # 📅 Sistema de Gerenciamento de Eventos

Aplicação web desenvolvida com **Java 21** e **Spring Boot**, com o objetivo de gerenciar **eventos** e **participantes**, possibilitando a criação, edição, exclusão e inscrição com controle de vagas. O sistema adota boas práticas de modelagem, arquitetura e organização de código.

---

## ✅ Funcionalidades

### 📌 Eventos
- Criar evento com nome, descrição, data, local e número de vagas
- Listar todos os eventos disponíveis
- Atualizar os dados de um evento
- Excluir evento

### 👥 Ações
- Cadastro de participante com nome, e-mail e telefone
- Inscrição do participante em evento (com verificação de vagas disponíveis)
- Cancelamento de inscrição
- Listar todos os participantes de um evento

### 🔗 Relacionamentos
- Um evento pode conter múltiplos participantes
- Um participante pode estar inscrito em vários eventos

---

## 🧱 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Maven
- Spring Data JPA + Hibernate
- MySQL
- Postman (para testes manuais)
- Git & GitHub

---

## 📁 Estrutura do Projeto

- `model`: entidades `Evento` e `Participante`
- `repository`: interfaces JPA
- `service`: regras de negócio, incluindo verificação de vagas
- `controller`: endpoints RESTful
- `dto`: objetos de transferência de dados (se necessário)

---

## 🔧 Executando o Projeto

```bash
git clone https://github.com/seu-usuario/eventos-app.git
cd eventos-app
./mvnw spring-boot:run
```

O backend será iniciado em:  
📍 `http://localhost:8080`

---

## 🌐 Endpoints Principais

### Eventos

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST | `/eventos` | Criar evento |
| GET | `/eventos` | Listar todos os eventos |
| PUT | `/eventos/{id}` | Atualizar evento |
| DELETE | `/eventos/{id}` | Deletar evento |
| POST | `/eventos/{eventoId}/inscrever/{participanteId}` | Inscrição |
| POST | `/eventos/{eventoId}/cancelar/{participanteId}` | Cancelar inscrição |
| GET | `/eventos/{eventoId}/participantes` | Listar participantes |

### Participantes

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST | `/participantes` | Cadastrar novo participante |
| GET | `/participantes` | Listar todos os participantes |


## 🧪 Dados de Teste

### 👥 Participantes Cadastrados

```json
{
  "nome": "Amanda Costa",
  "email": "amanda.costa@email.com",
  "telefone": "1199990001"
}
{
  "nome": "Rafael Lima",
  "email": "rafael.lima@email.com",
  "telefone": "1199990002"
}
{
  "nome": "Beatriz Nunes",
  "email": "beatriz.nunes@email.com",
  "telefone": "1199990003"
}
```

### 🎯 Evento Atualizado

```json
{
  "nome": "Workshop Atualizado",
  "descricao": "Nova descrição",
  "data": "2025-06-15",
  "local": "Auditório Central",
  "vagas": 2
}
```

### 🔁 Testes de Inscrição e Validações

| Ação | Endpoint | Resultado Esperado |
|------|----------|--------------------|
| Inscrever Amanda (ID 1) no evento (ID 1) | `/participantes/1/inscrever/1` | ✅ Sucesso |
| Inscrever Rafael (ID 2) no evento (ID 1) | `/participantes/2/inscrever/1` | ✅ Sucesso |
| Inscrição duplicada (Rafael novamente) | `/participantes/2/inscrever/1` | ❌ Falha: participante já inscrito |
| Inscrição além do limite (Beatriz) | `/participantes/3/inscrever/1` | ❌ Falha: evento sem vagas |

---

## 📌 Regras de Negócio

- Inscrições respeitam o número de vagas disponíveis
- Cancelamento de inscrição libera a vaga automaticamente
- Participantes não podem se inscrever mais de uma vez no mesmo evento

---

## 👨‍💻 Equipe de Desenvolvimento

| Nome     | Tarefa |
|----------|--------|
| Yago     | Modelagem, entidades e relacionamentos |
| Leticia  | Repository, Service e regras de negócio |
| Nycolas  | Controllers e testes com Postman |
| Nicolas  | Organização do repositório e documentação |

---

## 📈 Controle de Versão

- Histórico de commits com mensagens descritivas
- Branches por funcionalidade
- Acompanhamento por meio do GitHub

---

## 📄 Licença

Este projeto é de uso **educacional** e pode ser reutilizado com atribuição à equipe autora.

---

## 🚀 Funcionalidades de Outro Nível

### 📌 Eventos
- ✅ Criar evento com: nome, descrição, data, local e número de vagas
- ✅ Listar eventos disponíveis (com filtro por data e vagas disponíveis)
- ✅ Atualizar qualquer dado do evento
- ✅ Excluir evento com segurança

### 🙋 Participantes
- ✅ Cadastrar novo participante (nome, e-mail e telefone)
- ✅ Inscrição em evento (com **verificação automática de vagas**)
- ✅ Cancelamento de inscrição (libera a vaga automaticamente)
- ✅ Listagem de participantes por evento

### 🔗 Relacionamentos Poderosos
- 🔁 Um evento comporta **vários participantes**
- 🔁 Um participante pode se inscrever em **diversos eventos**

---

## 🧱 Stack de Tecnologias

- 💻 Java 21
- ⚙️ Spring Boot
- 📦 Maven
- 🛠️ JPA + Hibernate
- 🗃️ Banco de Dados: MySQL
- 🔎 Postman para testes de API
- 🌐 Git + GitHub para versionamento

---

## 🛠️ Como Rodar o Projeto Localmente

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/eventos-app.git

# Entre na pasta do projeto
cd eventos

# Execute com Maven
./mvnw spring-boot:run
```

🔗 Acesse em: [http://localhost:8080](http://localhost:8080)

---

## 📁 Endpoints RESTful

### 🎯 Eventos
| Método | Rota | Descrição |
|--------|------|------------|
| POST | `/eventos` | Criar novo evento |
| GET | `/eventos` | Listar todos os eventos |
| PUT | `/eventos/{id}` | Atualizar evento existente |
| DELETE | `/eventos/{id}` | Remover evento |
| POST | `/eventos/{eventoId}/inscrever/{participanteId}` | Inscrever participante |
| POST | `/eventos/{eventoId}/cancelar/{participanteId}` | Cancelar inscrição |
| GET | `/eventos/{eventoId}/participantes` | Ver todos os participantes de um evento |

### 🙋 Participantes
| Método | Rota | Descrição |
|--------|------|------------|
| POST | `/participantes` | Cadastrar novo participante |
| GET | `/participantes` | Listar todos os participantes |

---

## 🔐 Regras de Ouro (Validações)

- ❌ Não é possível ultrapassar o número de vagas de um evento
- ✅ Cancelamentos devolvem as vagas automaticamente
- 🔁 Um mesmo participante **não pode se inscrever duas vezes** no mesmo evento
- 🆔 IDs são gerados automaticamente

---

## 👥 Time Monstruoso de Devs

| Dev        | Responsabilidades |
|------------|-------------------|
| **Yago**    | Modelagem, entidades, relacionamentos |
| **Leticia** | Camada Service + lógica de vagas |
| **Nycolas** | Controllers e testes com Postman |
| **Nicolas** | Organização do repositório e README boladão |

---

## 📊 Histórico de Colaboração

- 🔄 Commits com mensagens claras e padronizadas
- 🌿 Branches organizadas por funcionalidade
- 📌 Issues e tarefas distribuídas de forma colaborativa
- ✅ Revisões em grupo e testes manuais via Postman

---

## 🧪 Testes 100% Realizados

Testamos todos os fluxos principais no **Postman**, incluindo:
- Cenários de sucesso
- Casos de erro (vagas excedidas, IDs inválidos, etc.)

> ⚠️ Testes automatizados ainda não foram implementados, mas os testes manuais garantiram a qualidade das rotas.

---

## 📄 Licença

Este projeto é **aberto para fins educacionais**. Se usar, por favor mencione a equipe ❤️

---

## 💡 Considerações Finais

Este projeto nasceu com o objetivo de **aprender na prática** como criar:
- APIs REST completas
- Relacionamentos @ManyToMany com tabela intermediária
- Camadas bem separadas (Controller, Service, Repository)
- Um projeto colaborativo de verdade no GitHub

> **Feito com dedicação, colaboração e vontade de aprender! 💪**

---
