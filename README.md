# ContaBanco

## Descrição

O projeto **ContaBanco** é um programa simples em Java que simula a criação de uma conta bancária. Ele permite que o usuário insira informações sobre a conta, como número, agência, nome do cliente e saldo inicial, e então exibe uma mensagem de confirmação com os dados inseridos.

## Tecnologias Utilizadas

- **Java 17**: A versão do Java usada para desenvolver o projeto.
- **IDE**: Você pode utilizar qualquer IDE de sua preferência, como IntelliJ IDEA, Eclipse, ou VS Code, para compilar e executar o programa.
- **Terminal/Prompt de Comando**: O programa é executado via terminal, onde o usuário pode inserir dados e ver a saída.

## Como Configurar o Projeto

1. **Pré-requisitos**: Certifique-se de que o Java 17 está instalado no seu sistema. Você pode verificar a versão do Java instalada executando o comando:

   ```bash
   java -version
   ```

   Se o Java não estiver instalado, você pode baixá-lo no site oficial: [Oracle JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).

2. **Clone o Repositório**: Clone o repositório do projeto na sua máquina local. Caso você ainda não tenha o código do projeto, você pode criar um arquivo `ContaTerminal.java` e copiar o código fornecido.

## Como Executar o Projeto

Siga as instruções abaixo para compilar e executar o programa `ContaBanco`.

### Passos para Compilação e Execução

1. **Navegue até o diretório do projeto**: Abra o terminal ou prompt de comando e vá até o diretório onde o arquivo `ContaTerminal.java` está localizado.

   ```bash
   cd caminho/para/o/projeto
   ```

2. **Compile o código**: Compile o arquivo `ContaTerminal.java` utilizando o comando `javac`:

   ```bash
   javac ContaTerminal.java
   ```

   Esse comando criará um arquivo `ContaTerminal.class` no mesmo diretório.

3. **Execute o programa**: Para rodar o programa, use o comando `java`:

   ```bash
   java ContaTerminal
   ```

4. **Interaja com o programa**: Siga as instruções exibidas no terminal para inserir as informações solicitadas. Por exemplo:

   ```
   Por favor, digite o número da Conta:
   1021
   Por favor, digite o número da Agência:
   067-8
   Por favor, digite o nome do Cliente:
   MARIO ANDRADE
   Por favor, digite o saldo inicial:
   237.48
   ```

   Após inserir todas as informações, o programa exibirá a mensagem de confirmação:

   ```
   Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
   ```

### Como Testar o Projeto

1. **Testar em Diferentes Cenários**: Você pode testar o programa com diferentes entradas para garantir que ele funciona corretamente com diversos tipos de dados.

2. **Verificar Validações**: Atualmente, o programa não inclui validações robustas para os dados inseridos. Para testes mais avançados, você pode adicionar validações de entrada, como verificar se o número da conta é realmente um número inteiro ou se o saldo é um número decimal válido.
