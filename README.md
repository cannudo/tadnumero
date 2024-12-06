# tadnumero
Primeiro tipo abstrato de dados feito no curso ministrado por Márcio Feitosa através da Udemy

## Como Executar o Projeto com Maven

### Pré-requisitos

- Java Development Kit (JDK) 17 ou superior
- Apache Maven 3.6.0 ou superior

### Passos para Executar

1. **Clone o repositório:**

   ```sh
   git clone https://github.com/cannudo/tadnumero.git
   cd tadnumero
   ```

1. **Compile o projeto:**

    ```sh
    mvn compile
    ```

1. **Execute os testes:**

    ```sh
    mvn test
    ```

1. **Execute a aplicação:**

    ```sh
    mvn exec:java -Dexec.mainClass="com.edl.tadnumero.TadNumero"
    ```


### Dependências Necessárias

As dependências necessárias para a execução do Maven estão listadas no arquivo pom.xml. As principais dependências incluem:

JUnit Jupiter API para testes unitários
AssertJ para asserções fluentes
Para mais detalhes, consulte o arquivo `pom.xml`.