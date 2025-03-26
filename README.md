# MEDICO, PACIENTE, CONSULTAS

=> O nosso sistema recebera dados de medicos e pacientes. Um médico atende a um paciente por vez. O paciente pode ter várias consultas com diferentes médicos.

2. O nosso sistema tambem é de gestão de médicos para uma clinica. Ele permite o cadastro e gerenciamento de médicos, armazenando suas informações como:
- Nome
- Email
- CRM
- Especialidade
- Endereço do médico (Logradouro, bairro, cep, cidade, uf, numero, complemento)


3. Funcionalidades 
- Cadastro de médico
- Listagem de médicos cadastrados
- Atualização de dados do médico
- Remoção de médicos

# Aula 02

Verbos / Métodos HTTP
`get` -> é quando você pede algo de retorno
`POST` -> é quando você envia informações
PUT
DELETE

request [requisição] -> é o que você passa esperando o retorno.
Response [Resposta] -> é a resposta recebida.

# Aula 03

`DTO` -> Padrão de projetos onde isolamos cada item que está sendo enviado pleo ``simulador de requisição``. DATA TRANSFER OBJECT
- Criação de uma classe record chamada DadosCadastroMedico, onde iremos receber os dados do json e converter em dados autonomos.

    `api` -> É um conjunto de açoes e regras para a comunicação entre diferentes ferramentas e sistemas. Define como os sistemas devem interagir.
    Normalmente uma API oferece dados para serem consumidos pelo frontEnd.

    `Polimorfismo` -> É quando um metodo se comporta de maneira diferente dependendo da forma que é invocado. Significa muitas formas.
    - Sobrecarga de metodo - [OVERLOADING] - tempo de compilação.
    - Sobiescrita de método - [OVERRINDING] - Tempo de execução

    `Abistração` -> É quando uma classe ou metodo não pode ser instanciada(clonada). [Abstract].     

## ANOTATIONS - ANOTAÇÕES
1. Anotações do Spring Web
`@RequestMapping`("/medicos") 
-> Define que a classe esta mapeada para  url[endpoint] /medicos.
`@RestController`  
-> Define que a classe é uma classe controladora no spring.

`@GetMapping`
-> Define que o método sera somente de leitura

`@PostMapping`
-> Define que o método ira receber dados.

`@DeleteMapping`
-> Atualiza alguma informação.

`@PutMapping`
-> Deleta dados.

`@RequestBody`
-> é utilizada quando você ira receber dados pelo simulador de requisiçao, e informa que os dados serão enviados no corpo da requisição.

2. Anotações do lombok

`@Getter`
-> Cria todos os getters para todos os atributos da classe

`@Setter`
-> Cria todos os setters para todos os atributos da classe

`@AllArgsConstructor`
-> Cria um metodo construtor com todos os atributos

`@NoArgsConstructor`
-> Cria um metodo construtor sem os atributos

3. Anotações do Spring JPA

`@Entity`
-> É uma anotação que você ira utilizar para informar ao springboot que a classe anotada será uma tabela no banco de dados.

`@Table(name = "nome_da_tabela")`
-> É uma anotação para criar uma tabela no banco de dados com o nome informado nos parenteses

`@id`
-> Define que o atributo será uma chaver primaria 

`@GeneratedValue`
-> Define que a criação do ID será de forma automatica.

`@Enumarated`
-> Informa que aquele atributo é uma classe Enum.
- Construir um pacote chamado endereco e criar uma classe Endereco com os atributos listados abaixo. Além disso, crie os getters e setters, construtor com todos os parametros e construtor sem nenhum parametro. (logradouro, bairro, cep, cidade, uf, numero, complemento)
* Coloque todos os atributos privados e do tipo String.


`Embedded`
-> Anota que uma classe faz parte dessa tabela no banco de dados.


`Embeddable`
-> Anota que essa classe ira fazer parte de uma tabela de outra classe.


``

`@GeneratedValue(strategy = GenerationType.IDENTITY)`
-> informa que aquele atributo tera uma geração de valor automatica.
-> Strategy - é a estrategia utilizada
-> GenerationType - tipo de geração utilizada
-> IDENTITY - a geração automatica sera atraves do ID.




4. BANCO DE DADOS

`Chave primaria(PK)` -> Atributo que identifica a tabela no banco de dados.
``Chave Estrangeira(FK)` -> é o atributo que se relaciona cm uma tabela que possui esse atributo como cave primariano banco de dados.





5. Padrões de Projeto

`DTO` -> Padrão de projetos onde isolamos cada item que está sendo enviado pleo ``simulador de requisição``. DATA TRANSFER OBJECT
- Criação de uma classe record chamada DadosCadastroMedico, onde iremos receber os dados do json e converter em dados autonomos.

`DAO` -> É um padrao de projetos em que separamos a logica do acesso ao banco de dados do restante da aplicação.

`INTERFACE` -> É um tipo de padrao de projetos presente no java onde uma classe é declarada e ela possui atributos constantes e não pode instanciada. É conhecida como uma classe de contrato onde você podera utilizar os métodos e atributos dessa classe.

`INJEÇÃO DE DEPENDENCIAS` -> É um tipo de padrão de projetos [DI] onde você informa ao springboot que ele irá ficar responsável pela criação de determinado dado (ele que conhece como funciona).

``