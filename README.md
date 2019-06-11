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
 
| id | nome |
| --- | --- |
| 1 | William Shakespeare |
| 2 | Jane Austen |
| 3 | Fiodor Dostoievski |
 
 /*
 * Autores
 */
INSERT INTO Autor VALUES (1, 'William Shakespeare')
INSERT INTO Autor VALUES (2, 'Jane Austen')
INSERT INTO Autor VALUES (3, 'Fiodor Dostoievski')

/*
 * Livros
 */
INSERT INTO Livro VALUES (1, 'Macbeth', '0', 'Macbeth e um livro de Shakespeare', 1)
INSERT INTO Livro VALUES (2, 'Hamlet', '1', 'Hamlet e um livro de Shakespeare', 1)
INSERT INTO Livro VALUES (3, 'Emma', '2', 'Emma e um livro de Austen', 2)
INSERT INTO Livro VALUES (4, 'The Idiot', '3', 'The Idiot e um livro de Dostoievski', 3)
INSERT INTO Livro VALUES (5, 'White Nights', '4', 'White Nights e um livro de Dostoievski', 3)

## Equipe
- Vinícius
- Alexandre
- Bryan

