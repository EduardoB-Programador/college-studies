# Português

O OOP-5th-PDF teve a intenção de me fazer praticar o uso de **herança** e **poliformismo**.

## Parte 1:

### Passo 1: Crie um projeto chamado 13_HerançaBanco.

Conclusão: Projeto OOP-5th-PDF criado.

### Passo 2: Nesse projeto crie o pacote model e as seguinte classes conforme toda a estrutura de Herança apresentada nas atividades anteriores:

#### Classe 1: Elabora a Classe ContaBancaria com a seguinte estrutura:

*• Atributos privados:*
**○ String cliente;
○ int numeroAgencia;
○ int numeroConta;
○ double saldo;**

*• Métodos públicos:*
**○ Todos os métodos getters e setters;
○ Método construtor simples;
○ Método construtor completo;
○ Método toString() que retorna todos os dados da ContaBancaria.**

Conclusão: Classe BankAccount criada, seus atributos são: String holder, int agencyNumber, int accountNumber e double balance. Todos os métodos devidamente criados.

#### Classe 2: Acrescente ao projeto a classe ContaPoupança, que recebe herança da classe conta bancária e possui a seguinte estrutura:

*• Atributos privados:*
**○ int diaDeRendimento;**

*• Métodos públicos:*
**○ Todos os métodos getters e setters;
○ Método construtor simples;
○ Método construtor completo com estrutura da herança;
○ Método toString() que, em seu retorno, aciona o toString() da superclasse e complementa com dados específicos da conta poupança.**

Conclusão: Classe SavingsAccount criada, seu atributo é: int interestDay. E todos os métodos foram criados como instruidos.

#### Classe 3: Acrescente ao projeto a Classe ContaEspecial, que recebe herança da classe ContaBancaria e possui a seguinte estrutura:

*• Atributos privados:*
**○ double limite;**

*• Métodos públicos:*
**○ Todos os métodos getters e setters;
○ Método construtor simples;
○ Método construtor completo com estrutura da herança;
○ Método toString() que, em seu retorno, aciona o toString() da super classe e complementa
com os dados específicos da ContaEspecial.**

Conclusão: Classe SpecialAccount criada, seu atributo é: double creditLimit. E todos os métodos foram criados como instruidos.

### Passo 3: Na classe ContaBancaria implemente um método chamado depositar. Este método deve ser acionado recebendo um valor para depósito.

*• Internamente, sua lógica deve somar o valor atual de saldo com o valor de depósito e atribuir este resultado no próprio atributo global saldo.
• Exibir de dentro desse método a String: Depósito efetuado. Saldo atual \<saldo\>
• Este método não possui retorno.*

### Passo 4: Ainda na classe ContaBancaria, implemente um método chamado sacar. Este método deve ser acionado recebendo um valor pretendido para saque.

*• Internamente, sua lógica deve verificar se o saldo da conta é maior ou igual ao valor a ser sacado.*

**○ Se sim, deve diminuir do saldo da conta o valor que foi sacado, e retornar a seguinte String: Saque efetuado no valor de \<valor recebido quando o método foi acionado\>. Saldo atual: \<valor do saldo atual\>.
○ Se não, deve apenas retornar a seguinte String: O saque não foi efetuado pois não há saldo suficiente.**

### Passo 5: Na Classe ContaPoupanca, implemente o método calcularNovoSaldo, que deve ser acionado recebendo a taxa de rendimento percentual da poupança.

*• Internamente, sua lógica deve calcular o novo saldo da conta a partir da taxa de rendimento e atribuir este valor ao atributo saldo da super classe.
• Exibir de dentro deste método a String: Saldo atualizado. Saldo atual: \<saldo\>
• Este método não possui retorno.*

### Passo 6: Na Classe ContaEspecial, redefina o método sacar, permitindo saldo negativo até o valor do limite.

## Parte 2:

### Passo 1: Crie um pacote chamado controller, contendo uma Classe chamada Contas. Esta classe deve possuir o tradicional método main(), e nessa classe realize os próximos passos:

### Passo 2: – Instanciar um objeto de ContaPoupanca, incluindo todos os dados pelo método construtor completo. O saldo deve ser de 500 Reais.

### Passo 3: Instanciar um objeto de ContaEspecial através do método construtor simples, e em seguida, incluir todos os dados através dos métodos setters. O saldo deve ser de 800 Reais. O limite deve ser de 1000 Reais.

### Passo 4: Exibir os dados das duas contas utilizando os benefícios dos métodos toString.

### Passo 5: Depositar 150 Reais na Conta Poupança que foi criada no item 1 desta etapa.

### Passo 6: Tentar sacar 1000 Reais da Conta Poupança.

### Passo 7: Tentar sacar 250 Reais da Conta Poupança.

### Passo 8: Efetuar rendimento na Conta Poupança utilizando taxa de rendimento de 1,2%

### Passo 9: Depositar 300 Reais na Conta Especial.

### Passo 10: Tentar sacar 2500 Reais da Conta Especial.

### Passo 11: Tentar sacar 1200 Reais da Conta Especial.

### Passo 12: Exibir novamente os dados das duas contas utilizando os benefícios dos métodos toString.

# English

The OOP-5th-PDF intended to make me practice Class **inheritance** and **polyformism**. 

## Part 1:

### Step 1: Create a project called 13_HerançaBanco.

Conclusion: Project OOP-5th-PDF created.

### Step 2: In this project create the model package and the following classes according to all inheritance structure from the previous activities:

#### Class 1: Add a class called ContaBancaria with the following structure:

*• Private attributes:*
**○ String cliente;
○ int numeroAgencia;
○ int numeroConta;
○ double saldo;**

*• Public methods:*
**○ All the get and set methods;
○ Simple constructor method;
○ Complete constructor method;
○ toString() method that returns all data from ContaBancaria.**

Conclusion: BankAccount class created, its attributes are: String holder, int agencyNumber, int accountNumber and double balance. All the methods were created as instructed.

#### Class 2: Add to the project the class ContaPoupança, that inherits from ContaBancaria and has the following structure:

*• Private attributes:*
**○ int diaDeRendimento;**

*• Public methods:*
**○ All the get and set methods;
○ Simple constructor method;
○ Complete constructor method with the inheritance structure;
○ toString() method that, in its return, activate the toString() method from the superclass and complements with the specified data from the current class.**

Conclusion: Class SavingsAccount created, its attribute is: int interestDay. All the methods were created as instructed.

#### Class 3: Add the class ContaEspecial to the project, that inherits from ContaBancaria and has the following structure:

*• Private attributes:*
**○ double limite;**

*• Public methods:*
**○ All the get and set methods;
○ Simple constructor method;
○ Complete constructor method with the inheritance structure;
○ toString() method that, in its return, activate the toString() method from the superclass and complements with the specified data from the current class.**

Conclusion: Class SpecialAccount created, its attribute is: double creditLimit. All the methods were created as instructed.

### Step 3: In ContaBancaria implement a method called deposit. This method must be added receiving a value to deposit.

*• The method must sum the deposit value and the balance into the private global variable balance.
• Show the String: The deposit was made, current balance is now: \<balance\>
• This is a void method.*

### Step 4: Still in the ContaBancaria class, implement a method called withdraw. This method must be added receiving a value to withdraw.

*• The method must verify if the account balance is greater than the value to be withdrawn.*

**○ If the balance is greater, subtract from the balance the withdrawn value, and return the following String: You successfully withdrew \<value\>. Your current balance is now: \<balance\>.
○ If the balance is not greater, it must return the following String: Not enough balance, your balance is \<balance\>.**

### Step 5: In the ContaPoupanca class, implement the method calculateNewBalance, the method must be added receiving the interest percentage for a savings account.

*• The method must calculate the new account balance using the interest percentage and attribute the value to the attribute balance from the superclass.
• Show the following String: Balance updated. Your current balance is now: \<balance\>
• This is a void method.*

### Step 6: In the ContaEspecial class, override the withdraw method, allowing negative balance using the creditLimit attribute as the max minimum value.

## Part 2:

### Step 1: Create the package controller, with a class called Contas. This class must have the main() method, and in this class execute the following steps:

### Step 2: Create an object using the complete constructor from ContaPoupanca. The balance must be defined as 500.

### Step 3: Create and object using the simple constructor from ContaEspecial, then use the set methods to add data. The balance must be defined as 800. The creditLimit must be defined as 1000.

### Step 4: Show the data from both accounts using the toString method.

### Step 5: Deposit 150 in the first account created, the one that used the ContaPoupanca constructor.

### Step 6: Try to withdraw 1000 from the ContaPoupanca account.

### Step 7: Try to withdraw 250 from the ContaPoupança account.

### Step 8: Use the method calculateNewBalance on the ContaPoupança account using the interest percentage of 1,2%.

### Step 9: Deposit 300 in the ContaEspecial account.

### Step 10: Try to withdraw 2500 from the ContaEspecial account.

### Step 11: Try to withdraw 1200 from the ContaEspecial account.

### Passo 12: Show again the data from both accounts using the toString method. 