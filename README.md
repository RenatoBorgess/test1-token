# Serviço Spring Boot MVC de Cartões de Crédito

Este é um exemplo de aplicação Spring Boot MVC que recebe um array de cartões de crédito com um único atributo "name" e oferece três endpoints diferentes para processar o array. Também inclui um endpoint para fazer o upload de um arquivo CSV e retornar um array de strings com os campos do arquivo.

## Endpoints

### 1. Inverter Array (POST /keepingOriginalArray)

Este endpoint recebe um array de cartões de crédito e retorna um novo array com os cartões invertidos. O array original permanece inalterado.

**Requisição:**

```http
POST /keepingOriginalArray
Content-Type: application/json

[
  {
    "name": "nome1"
  },
  {
    "name": "nome2"
  },
  ...
]
```

**Resposta:**

```json
[
  {
    "name": "nome6"
  },
  {
    "name": "nome5"
  },
  ...
]
```

### 2. Inverter Array In-Place (POST /arrayInPlace)

Este endpoint recebe um array de cartões de crédito e inverte a ordem dos cartões no próprio array, modificando-o.

**Requisição:**

```http
POST /arrayInPlace
Content-Type: application/json

[
  {
    "name": "nome1"
  },
  {
    "name": "nome2"
  },
  ...
]
```

**Resposta:**

```json
[
  {
    "name": "nome6"
  },
  {
    "name": "nome5"
  },
  ...
]
```

### 3. Inverter Lista no Local (POST /listOfCards)

Este endpoint recebe um java.util.List de cartões de crédito e inverte a ordem dos cartões na própria lista, modificando-a.

**Requisição:**

```http
POST /listOfCards
Content-Type: application/json

[
  {
    "name": "nome1"
  },
  {
    "name": "nome2"
  },
  ...
]
```

**Resposta:**

```json
[
  {
    "name": "nome6"
  },
  {
    "name": "nome5"
  },
  ...
]
```

### 4. Upload de CSV (POST /upload/csv)

Este endpoint permite fazer o upload de um arquivo CSV e retorna um array de strings com os campos do arquivo.

**Requisição:**

```http
POST /uploadCsv
Content-Type: multipart/form-data
```

**Resposta:**

```json
[
  "campo1",
  "campo2",
  ...
]
```
## Enviando um arquivo CSV usando o Postman

Para enviar um arquivo CSV chamado "cards.csv" usando o Postman, siga estas etapas:

1. Certifique-se de ter o Postman Desktop instalado em seu sistema.

2. Mova o arquivo "cards.csv" para o diretório de trabalho do Postman. Geralmente, o diretório é:

   ```
   <path_para_postman>/Postman/files/
   ```

   Certifique-se de substituir `<path_para_postman>` pelo caminho correto para o diretório do Postman em seu sistema.

3. Abra o Postman Desktop.

4. Crie uma nova solicitação (Request) e defina o método HTTP como POST.

5. Insira a URL do endpoint adequado (por exemplo, `http://localhost:8080/uploadCsv`).

6. No painel de cabeçalho (Header) da solicitação, adicione uma nova chave (key) com o nome "file" e deixe o valor (value) em branco.

7. No corpo (Body) da solicitação, selecione o tipo de conteúdo (Content-Type) como "form-data".

8. Na seção de formulário (Form-data), clique em "Choose Files" e selecione o arquivo "cards.csv" no diretório de trabalho do Postman.

9. Envie a solicitação clicando no botão "Send".

O arquivo CSV "cards.csv" será enviado para o endpoint especificado. Verifique a resposta da solicitação para obter o array de strings com os campos do arquivo.

Certifique-se de ter executado a aplicação Spring Boot localmente antes de enviar a solicitação do Postman.

Observação: Se você estiver usando um nome de arquivo ou diretório diferente, ajuste as instruções de acordo com o seu cenário específico.


## Executando a Aplicação Localmente com o Swagger-UI

Para executar o projeto localmente e acessar o Swagger UI, siga estes passos:

1. Clone o repositório e navegue até o diretório do projeto.

2. Certifique-se de ter o Java e o Maven instalados no seu sistema.

3. Abra um terminal e execute o seguinte comando para construir o projeto:

```bash
mvn clean package
```

4. Após a construção bem-sucedida, inicie a aplicação usando o seguinte comando:

```bash
mvn spring-boot:run
```

5. A aplicação será iniciada, e você pode acessar o Swagger UI abrindo a seguinte URL no seu navegador:

```
http://localhost:8080/swagger-ui.html
```

O Swagger UI fornece uma interface interativa para explorar e

 testar os diferentes endpoints da aplicação.

Observação: Você pode precisar ajustar o número da porta (8080) se houver conflito com outro serviço em execução em sua máquina.

Pronto! Agora você pode usar o Swagger UI para testar os diferentes endpoints do Serviço Spring Boot MVC de Cartões de Crédito.
