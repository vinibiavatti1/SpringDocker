# FURB - Trabalho Docker
FURB - Universidade Regional de Blumenau - Trabalho de Sistemas distribuídos

## App
Esta aplicação simula um serviço de API REST com base no framework Springboot executada através de um container. Existem apenas duas entidades relacionadas entre sí, e dois repositórios sem nenhuma rotina de autenticação. O banco de dados H2 foi utilizado para simular dados em memória.

## Ambiente
Para montagem do ambiente, é necessário que o docker esteja instalado na máquina. Após a instalação do docker, a image do dockerhub deve ser baixada através do comando:

```bash
$ docker pull vinibiavatti/app
```

Após a imagem estar disponível localmente, o comando abaixo deve ser executado para iniciar a aplicação:

```bash
$ docker run -p 8080:8080 -t vinibiavatti/app
```

O serviço irá estar iniciado com sucesso assim que a seguinte mensagem ser exibida no log do prompt.

```text
...
2015-03-31 13:25:48.035  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2015-03-31 13:25:48.037  INFO 1 --- [           main] hello.Application                        : Started Application in 5.613 seconds (JVM running for 7.293)
```

## Dados
Os dados são disponibilizados em memória toda vez que a aplicação é iniciada e os mesmos não são persistidos. Abaixo seguem dos dados disponíveis na aplicação:

**Tabela:** Autor

| id | nome |
| --- | --- |
| 1 | William Shakespeare |
| 2 | Jane Austen |
| 3 | Fiodor Dostoievski |

**Tabela:** Livro

| id | titulo | isbn | descricao | id_autor |
| --- | --- | --- | --- | --- |
| 1 | Macbeth | 0 | Macbeth e um livro de Shakespeare | 1 |
| 2 | Hamlet | 1 | Hamlet e um livro de Shakespeare | 1 |
| 3 | Emma | 2 | Emma e um livro de Austen | 2 |
| 4 | The Idiot | 3 | The Idiot e um livro de Dostoievski | 3 |
| 5 | White Nights | 4 | White Nights e um livro de Dostoievski | 3 |

## API
Os endpoints disponíveis estão listados abaixo:

| Caminho | Método | Descricao |
| --- | --- | --- |
| /autor | POST | Inserir autor |
| /livro | POST | Inserir livro |
| /autor/search/findByNome?nome={nome} | GET | Buscar autor por nome |
| /livro/search/findByAutor_Nome?nome={nome} | GET | Buscar livros por nome do autor |
| /livro/search/findByTitulo?titulo={titulo} | GET | Buscar livros por título |
| /livro/search/findByIsbn?isbn={isbn} | GET | Buscar livros por código ISBN |

## Contribuição
Pré Requisitos necessários para execução do projeto:
- Java 8
- Maven
- Docker (Serviço e Usuário) 

Ao contribuir com o projeto, a imagem em docker deve ser gerada. Para isto, basta executar o comando abaixo tendo como base o diretório raiz do projeto:

```bash
$ ./mvnw install dockerfile:build
```

Após a imagem do container ser gerada, a mesma deve ser disponibilizada no dockerhub. Para isto realize o login no docker com sua conta, e execute o comando de push:

```bash
$ docker login
$ docker push vinibiavatti/app
```

## Equipe
- Vinícius
- Alexandre
- Bryan

