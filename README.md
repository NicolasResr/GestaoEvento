
🔥 Sistema de Gerenciamento de Eventos - Spring Boot Edition

Aplicação web desenvolvida com Java 21 + Spring Boot, com o objetivo de gerenciar eventos e participantes, possibilitando:

- Criação, edição, exclusão e listagem de eventos
- Inscrição e cancelamento com controle de vagas
- Cadastro e listagem de participantes

✅ Funcionalidades

📌 Eventos
- Criar evento com nome, descrição, data, local e número de vagas
- Listar todos os eventos disponíveis (com possibilidade de filtros)
- Atualizar dados de um evento
- Excluir evento

🙋 Participantes
- Cadastrar novo participante (nome, e-mail e telefone)
- Inscrever participante em evento (com verificação de vagas)
- Cancelar inscrição (libera vaga automaticamente)
- Listar participantes de um evento

🔗 Relacionamentos
- Um evento pode ter vários participantes
- Um participante pode estar em diversos eventos

🧱 Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Maven  
- Spring Data JPA + Hibernate  
- MySQL  
- Postman  
- Git & GitHub  

📁 Estrutura do Projeto

- model: entidades Evento e Participante
- repository: interfaces JPA
- service: regras de negócio, como verificação de vagas
- controller: endpoints RESTful
- dto: objetos de transferência de dados (se necessário)

🛠️ Como Executar

git clone https://github.com/seu-usuario/eventos-app.git
cd eventos-app
./mvnw spring-boot:run

Acesse: http://localhost:8080

🌐 Endpoints

🎯 Eventos

| Método | Rota | Descrição |
|--------|------|-----------|
| POST   | /eventos | Criar novo evento |
| GET    | /eventos | Listar todos os eventos |
| PUT    | /eventos/{id} | Atualizar evento |
| DELETE | /eventos/{id} | Remover evento |
| POST   | /eventos/{eventoId}/inscrever/{participanteId} | Inscrever participante |
| POST   | /eventos/{eventoId}/cancelar/{participanteId} | Cancelar inscrição |
| GET    | /eventos/{eventoId}/participantes | Ver participantes do evento |

🙋 Participantes

| Método | Rota | Descrição |
|--------|------|-----------|
| POST   | /participantes | Cadastrar participante |
| GET    | /participantes | Listar todos os participantes |

📌 Regras de Negócio

- Inscrições respeitam o número de vagas disponíveis
- Cancelamento de inscrição libera a vaga automaticamente
- Um participante não pode se inscrever mais de uma vez no mesmo evento

🧪 Testes Manuais (Postman)

Participantes de Teste

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

Evento de Teste

{
  "nome": "Workshop Atualizado",
  "descricao": "Nova descrição",
  "data": "2025-06-15",
  "local": "Auditório Central",
  "vagas": 2
}

Casos de Teste

| Ação | Endpoint | Resultado |
|------|----------|-----------|
| Inscrição de Amanda | /eventos/1/inscrever/1 | ✅ Sucesso |
| Inscrição de Rafael | /eventos/1/inscrever/2 | ✅ Sucesso |
| Rafael tenta se inscrever novamente | /eventos/1/inscrever/2 | ❌ Já inscrito |
| Beatriz tenta inscrição (sem vaga) | /eventos/1/inscrever/3 | ❌ Sem vagas |

👥 Time de Desenvolvimento

| Nome     | Responsável por |
|----------|-----------------|
| Yago     | Modelagem e entidades |
| Leticia  | Regras de negócio e camada service |
| Nycolas  | Controllers e testes manuais |
| Nicolas  | Organização e documentação do projeto |

📊 Controle de Versão

- Commits descritivos e padronizados
- Branches por funcionalidade
- Organização e revisão contínua no GitHub

📄 Licença

Projeto de uso educacional. Sinta-se livre para reutilizar com os devidos créditos à equipe.

💡 Considerações Finais

Este projeto nasceu com o propósito de praticar o desenvolvimento de APIs REST, com foco em:

- Relacionamentos com JPA e Hibernate
- Boas práticas de código e arquitetura
- Trabalho colaborativo em equipe
- Testes reais com Postman

Feito com dedicação, foco e aprendizado contínuo! 🚀
