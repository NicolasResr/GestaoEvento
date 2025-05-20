# 📅 Sistema de Gerenciamento de Eventos

Sistema web desenvolvido com **Spring Boot** para gestão de **eventos** e **participantes**, com controle de vagas, inscrições e cancelamentos. A aplicação conta com CRUD completo para eventos e participantes, além de um relacionamento muitos-para-muitos entre essas entidades.

---

## 🚀 Funcionalidades Mínimas

### 📌 Eventos
- ✅ Criar evento (nome, descrição, data, local, vagas)
- ✅ Listar eventos disponíveis
- ✅ Atualizar dados do evento
- ✅ Excluir evento

### 🚀 Funcionalidade
- ✅ Cadastrar participante (nome, e-mail, telefone)
- ✅ Inscrever em evento (com verificação de vagas)
- ✅ Cancelar inscrição
- ✅ Listar participantes de um evento

### 🔗 Relacionamentos
- Um **evento** pode ter **vários participantes**
- Um **participante** pode se inscrever em **vários eventos**

---

## 🧱 Arquitetura e Tecnologias

- Java 21
- Spring Boot
- Maven
- JPA/Hibernate
- Banco de dados MySql
- Postman (para testes de API)
- Git & GitHub

---

## 🛠️ Configuração do Projeto

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/eventos-app.git

# Acesse a pasta
cd eventos

# Execute o projeto
./mvnw spring-boot:run
```

A aplicação estará disponível em:  
📍 `http://localhost:8080`

---

## 📁 Endpoints da API

### 🎯 Eventos
| Método | Endpoint | Ação |
|--------|----------|------|
| POST   | `/eventos` | Criar evento |
| GET    | `/eventos` | Listar eventos |
| PUT    | `/eventos/{id}` | Atualizar evento |
| DELETE | `/eventos/{id}` | Excluir evento |
| POST   | `/eventos/{eventoId}/inscrever/{participanteId}` | Inscrição |
| POST   | `/eventos/{eventoId}/cancelar/{participanteId}` | Cancelar inscrição |
| GET    | `/eventos/{eventoId}/participantes` | Listar participantes |

### 🙋 Participantes
| Método | Endpoint | Ação |
|--------|----------|------|
| POST   | `/participantes` | Cadastrar participante |
| GET    | `/participantes` | Listar todos os participantes |

---

## 🔐 Regras de Negócio

- Um evento **não permite inscrições acima do número de vagas**.
- Ao cancelar uma inscrição, a vaga é liberada.
- Participantes **não são duplicados** em eventos.
- Eventos e participantes são armazenados com chave primária `id` gerada automaticamente.

---

## 👨‍👩‍👧‍👦 Time de Desenvolvimento

| Nome     | Responsabilidades |
|----------|--------------------|
| **Yago**     | Configuração do projeto, entidades e relacionamentos |
| **Leticia**  | Repository, Service e lógica de controle de vagas |
| **Nycolas**  | Controllers e testes com Postman |
| **Nicolas**  | Organização do repositório, README.md e histórico de commits |

---

## 🔄 Histórico de Commits e Colaboração

✅ Commits organizados com mensagens claras  
✅ Branches bem definidas (ex: `feature/controller`, `fix/validacao-inscricao`)  
✅ Divisão de tarefas bem distribuída entre os membros  
✅ Acompanhamento contínuo das entregas e testes com Postman

---

## 🧪 Testes

Utilizamos o **Postman** para testar todos os endpoints de forma manual.

> ⚠️ Os testes automáticos ainda não foram implementados, mas os endpoints foram todos validados com entradas reais, incluindo cenários de erro (ex: exceder vagas, ID inexistente).

---

## 📄 Licença

Este projeto é **livre para fins educacionais**. Caso utilize, mencione os autores!

---

## 🧠 Observações Finais

Este projeto foi idealizado como uma forma de consolidar conhecimentos em:
- Modelagem de relacionamentos entre entidades
- Boas práticas REST
- Estrutura de serviços e repositórios
- Trabalho em equipe com versionamento no Git

---
