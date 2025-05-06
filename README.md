# VOLL.MED-API – API Rest para Gestão de Consultas Médicas

## 📌 Sobre o Projeto
O **VOLL.MED-API** é uma API desenvolvida durante os cursos de **Java Spring Boot** da Alura. Este backend é parte da aplicação **Voll.med**, um sistema voltado para a gestão de consultas médicas, seguindo as melhores práticas de desenvolvimento, arquitetura em camadas e segurança.

## 🏗 Arquitetura e Estrutura do Código
A aplicação foi organizada para garantir escalabilidade e manutenção eficiente:

### **Domain**
Contém as entidades fundamentais da aplicação:
- **Médico**, **Paciente**, **Consulta** e **Usuário** (responsável pelo agendamento das consultas).
- Para cada entidade, foram criados **DTOs** e **Repositories**, garantindo separação de responsabilidades e clareza estrutural.

### **Controllers**
Os controladores seguem um padrão arquitetural limpo:
- **Autenticação**, **Consulta**, **Médico** e **Paciente**.
- Todas as requisições retornam os códigos HTTP apropriados para cada ação.

### **Infraestrutura**
- **Exceptions**: Implementação de tratativas de erro, retornando respostas adequadas para diferentes cenários (BadRequest, falhas de validação e erros internos do servidor).
- **Segurança**: Configuração de **Spring Security**, bloqueando todas as requisições exceto o login. As demais ações requerem autenticação via **token JWT**.
- **Documentação**: Integração com **SpringDoc**, possibilitando a visualização completa da API no **Swagger UI**.

## 🗄 Banco de Dados e Migrations
O banco de dados utilizado é **MySQL**, com versionamento e controle de migrações via **Flyway**, garantindo integridade e evolução estruturada do schema.

## 🛠 Testes Unitários
Foram implementados **testes unitários** utilizando **DataJpaTest**, garantindo validações eficazes sem interferir nos dados reais. Destacam-se testes específicos no **MedicoRepository**, incluindo uma query para seleção de um médico aleatório dentro de uma especialidade.

## 🚀 Tecnologias Utilizadas
- **Spring Boot 3.4**
- **Java 17**
- **Lombok**
- **MySQL + Flyway**
- **JPA / Hibernate**
- **Maven**

### **Passos para execução**
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/vollmed-api.git

2. Acesse o diretório do projeto:
   ```sh
    cd vollmed-api

3. Execute as migrations do Flyway para criar as tabelas:
   ```sh
    mvn flyway:migrate

4. Compile e execute a aplicação:
   ```sh 
    mvn spring-boot:run

💻 Importação para IDE
Para importar o projeto na sua IDE favorita:
IntelliJ IDEA
- Abra o IntelliJ IDEA.
- Vá em File > Open e selecione o diretório do projeto.
- O IntelliJ reconhecerá automaticamente o Maven e configurará as dependências.
- Aguarde o download das dependências e execute a aplicação.

VS Code
- Instale a extensão Java Extension Pack.
- Abra o diretório do projeto no VS Code.
- No terminal, execute:
  ```sh 
  mvn clean install

- Rode a aplicação com:
  ```sh
  mvn spring-boot:run
 
📑 Acessando o Swagger UI
Após iniciar a aplicação, você pode acessar a documentação interativa via Swagger UI:

🔗 URL: http://localhost:8080/swagger-ui.html
Isso permitirá visualizar todos os endpoints disponíveis e testar requisições diretamente pelo navegador.





 
