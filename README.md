# Programação Orientada a Objetos - Atividade Prática Guiada

#### Desenvolva um sistema simplificado de gerenciamento para um restaurante. Crie classes que representam diferentes funcionários, pratos do cardápio e o próprio restaurante. Use construtores, encapsulamento, sobrecarga e sobrescrita de métodos conforme necessário.

### - Passos Sugeridos:

Construa a Hierarquia de Funcionários:

Crie uma classe Funcionario como classe base para os funcionários do restaurante. Em seguida, implemente classes derivadas como Garçom, Cozinheiro e Gerente, com métodos específicos para cada função.

#### - Classe Funcionario:
  
Atributos:

String nome: Nome do funcionário.

int idade: Idade do funcionário.

double salario: Salário do funcionário.

Outros atributos relevantes, como ID, cargo, etc.

Métodos:

Construtor para inicializar os atributos.

método pagamento();

Métodos getters e setters para acessar e modificar os atributos encapsulados.


#### - Classe Garcom:

Atributos:

int numeroMesas: Número de mesas que o garçom atende.

Métodos:

Construtor para inicializar os atributos.

Métodos específicos, como atenderMesa(), receberPedido(), etc.

Lembrar da sobrescrita do método pagamento(), salario do garçom 2500;


#### - Classe Cozinheiro:

Atributos:

ArrayList<Prato> pratosPreparados: Lista de pratos preparados.

Métodos:

Construtor para inicializar os atributos.

Métodos para preparar pratos, como cozinharPrato(), finalizarPrato(), etc.

Lembrar da sobrescrita do método pagamento(), salario do cozinheiro 4000;


#### - Classe Gerente:

Atributos:

ArrayList<Funcionario> funcionariosGerenciados: Lista de funcionários sob sua supervisão.

Métodos:

Construtor para inicializar os atributos.

Métodos para gerenciar funcionários, como contratarFuncionario(Funcionario F), demitiFuncionario(Funcionario F), etc.

Lembrar da sobrescrita do método pagamento(), salario do gerente 5000;

#### - Classe Prato para o Cardápio:

Crie uma classe Prato para representar os itens do cardápio do restaurante. 

Atributos:

String nomePrato: Nome do prato.

String descricao: Descrição do prato.

double preco: Preço do prato.

Métodos:

Construtor para inicializar os atributos.

Métodos getters e setters para acessar e modificar os atributos encapsulados.


#### - Classe Restaurante:

Desenvolva uma classe Restaurante que encapsule informações sobre o restaurante, como nome, endereço, lista de funcionários e cardápio. Implemente métodos para adicionar/remover funcionários, adicionar pratos ao cardápio, pagamento de Funcionários, etc.

Atributos:

String nomeRestaurante: Nome do restaurante.

String endereco: Endereço do restaurante.

ArrayList<Funcionario> funcionarios: Lista de funcionários do restaurante.

ArrayList<Prato> cardapio: Lista de pratos do cardápio do restaurante.

Métodos:

Construtor para inicializar os atributos.

Métodos para gerenciar funcionários, como contratarFuncionario(Gerent g, Funcionario F), demitiFuncionario(Gerent g, Funcionario F), pagarFuncionarios (Funcionario F), etc.

Métodos para gerenciar o cardápio, como adicionarPrato(Prato p), removerPrato(Prato p), etc.


#### O método de pagamento de funcionários deve-se atentar aos seguintes critérios:

Tem meses que existe uma bonificação no salarios dos funcionarios, outros meses não se tem a bonificação. O salário do gerente é 5.000, o salário do cozinheiro é 4.000, e o salário do garçom é 2500.

