
# 🔥 Sistema de Gerenciamento de Eventos

Bem-vindo ao sistema de **gestão de eventos** desenvolvido com **Java 21 + Spring Boot**!  
Com ele, é possível criar eventos, cadastrar participantes e controlar inscrições com verificação automática de vagas.

---

## ✅ Funcionalidades

### 📌 Eventos
- Criar evento com nome, descrição, data, local e número de vagas
- Listar todos os eventos
- Atualizar dados de um evento
- Excluir evento

### 👥 Participantes
- Cadastrar participante (nome, e-mail e telefone)
- Inscrever participante em evento (com verificação de vagas)
- Cancelar inscrição (libera a vaga)
- Listar participantes de um evento

### 🔗 Relacionamentos
- Um evento comporta vários participantes
- Um participante pode estar em diversos eventos

---

## 🧱 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Maven
- Spring Data JPA + Hibernate
- MySQL
- Postman (testes manuais)
- Git & GitHub

---

## 📁 Estrutura do Projeto

src/
├── model         # Entidades: Evento, Participante  
├── repository    # Interfaces JPA  
├── service       # Regras de negócio  
├── controller    # Endpoints RESTful  
├── dto           # Data Transfer Objects (opcional)  

---

## 🚀 Como Executar o Projeto

```bash
git clone https://github.com/seu-usuario/eventos-app.git
cd eventos-app
./mvnw spring-boot:run
```

🔗 Acesse: [http://localhost:8080](http://localhost:8080)

---

## 🌐 Endpoints Principais

### Eventos

| Método | Rota                                             | Descrição                   |
| ------ | ------------------------------------------------ | --------------------------- |
| POST   | `/eventos`                                       | Criar novo evento           |
| GET    | `/eventos`                                       | Listar eventos              |
| PUT    | `/eventos/{id}`                                  | Atualizar evento            |
| DELETE | `/eventos/{id}`                                  | Remover evento              |
| POST   | `/eventos/{eventoId}/inscrever/{participanteId}` | Inscrever participante      |
| POST   | `/eventos/{eventoId}/cancelar/{participanteId}`  | Cancelar inscrição          |
| GET    | `/eventos/{eventoId}/participantes`              | Ver participantes do evento |

### Participantes

| Método | Rota             | Descrição              |
| ------ | ---------------- | ---------------------- |
| POST   | `/participantes` | Cadastrar participante |
| GET    | `/participantes` | Listar participantes   |

---

## 🧪 Dados de Teste

### Participantes

```json
{ "nome": "Amanda Costa", "email": "amanda@email.com", "telefone": "1199990001" }
{ "nome": "Rafael Lima", "email": "rafael@email.com", "telefone": "1199990002" }
{ "nome": "Beatriz Nunes", "email": "beatriz@email.com", "telefone": "1199990003" }
```

### Evento

```json
{ "nome": "Workshop", "descricao": "Nova descrição", "data": "2025-06-15", "local": "Auditório Central", "vagas": 2 }
```

### Testes

| Ação                       | Endpoint                       | Resultado Esperado |
| -------------------------- | ------------------------------ | ------------------ |
| Inscrição Amanda (ID 1)    | `/participantes/1/inscrever/1` | ✅ Sucesso          |
| Inscrição Rafael (ID 2)    | `/participantes/2/inscrever/1` | ✅ Sucesso          |
| Inscrição duplicada Rafael | `/participantes/2/inscrever/1` | ❌ Já inscrito      |
| Evento lotado (Beatriz)    | `/participantes/3/inscrever/1` | ❌ Sem vagas        |

---

## 📌 Regras de Negócio

* Número de vagas é respeitado rigorosamente
* Cancelamento de inscrição libera a vaga
* Participantes não podem se inscrever mais de uma vez no mesmo evento

---

## 👨‍💻 Equipe

| Nome    | Tarefa                                    |
| ------- | ----------------------------------------- |
| Yago    | Modelagem e entidades                     |
| Leticia | Serviços e regras de negócio              |
| Nycolas | Controllers e testes com Postman          |
| Nicolas | Organização do repositório e documentação |

---

## 📊 Controle de Versão

* Commits descritivos e padronizados
* Branches por funcionalidade
* Organização via GitHub

---

## 📄 Licença

Projeto de uso **educacional**. Pode ser reutilizado com os devidos créditos à equipe.

---

## 💡 Considerações Finais

Este projeto ensina, na prática, como:

* Criar APIs REST completas
* Usar relacionamentos @ManyToMany
* Separar bem camadas (Controller, Service, Repository)
* Trabalhar em equipe com Git e GitHub

> Feito com 💚 e vontade de aprender!
