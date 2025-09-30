# Sistema de Coworking

Este projeto é uma aplicação de gerenciamento de espaços de coworking, desenvolvida em Java utilizando o framework Spring Boot. O sistema permite que usuários reservem espaços de trabalho, gerenciem suas reservas e interajam com a plataforma de forma eficiente.

## Estrutura do Projeto

A estrutura do projeto é organizada da seguinte forma:

- **src/main/java/com/coworking**: Contém o código-fonte da aplicação.
  - **CoworkingApplication.java**: Ponto de entrada da aplicação Spring Boot.
  - **controller**: Contém os controladores que gerenciam as requisições HTTP.
    - **EspacoController.java**: Gerencia as requisições relacionadas aos espaços de coworking.
    - **ReservaController.java**: Gerencia as requisições relacionadas às reservas.
    - **UsuarioController.java**: Gerencia as requisições relacionadas aos usuários.
  - **model**: Contém as classes que representam as entidades do sistema.
    - **Espaco.java**: Representa um espaço de coworking.
    - **Reserva.java**: Representa uma reserva de espaço.
    - **Usuario.java**: Representa um usuário do sistema.
  - **repository**: Contém as interfaces para operações de CRUD.
    - **EspacoRepository.java**: Interface para operações na entidade Espaco.
    - **ReservaRepository.java**: Interface para operações na entidade Reserva.
    - **UsuarioRepository.java**: Interface para operações na entidade Usuario.
  - **service**: Contém a lógica de negócios da aplicação.
    - **EspacoService.java**: Lógica relacionada aos espaços.
    - **ReservaService.java**: Lógica relacionada às reservas.
    - **UsuarioService.java**: Lógica relacionada aos usuários.

- **src/main/resources**: Contém recursos da aplicação.
  - **application.properties**: Configurações da aplicação.
  - **static**: Arquivos estáticos (CSS, JS, imagens).
  - **templates**: Templates para renderização de páginas.

- **src/test/java/com/coworking**: Contém os testes da aplicação.

- **docs**: Documentação adicional do projeto.
  - **press-release.md**: Informações relevantes sobre o coworking.
  - **estrategia-comunicacao.md**: Estratégia de comunicação da empresa.

- **pom.xml**: Gerenciador de dependências do Maven.

- **docker-compose.yml**: Configuração para serviços Docker.

## Instruções de Instalação

1. Clone o repositório:
   ```
   git clone <URL_DO_REPOSITORIO>
   ```

2. Navegue até o diretório do projeto:
   ```
   cd sistema-coworking
   ```

3. Compile o projeto utilizando Maven:
   ```
   mvn clean install
   ```

4. Execute a aplicação:
   ```
   mvn spring-boot:run
   ```

## Uso

Após a execução da aplicação, você pode acessar a interface do usuário através do navegador em `http://localhost:8080`. A partir daí, você poderá gerenciar espaços, fazer reservas e interagir com outros usuários.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorias e correções.

## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo LICENSE para mais detalhes.