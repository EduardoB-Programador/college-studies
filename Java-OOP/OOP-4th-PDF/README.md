# Português

Adiantando que provavelmente a tradução do português para inglês não deve estar muito boa por conta da minha falta de vocabulário.

O 4° PDF teve a intenção de me fazer praticar **poliformismo**.

### Passo 1: Crie o projeto "13_Poliformismo".

Conclusão: O nome do projeto é OOP-4th-PDF.

### Passo 2: Crie o pacote model.

Conclusão: Criado.

### Passo 3: Crie a superclasse "ContaCorrente", com os atributos: "titular", "agencia", "numeroConta" e "saldo". Crie também os getters e setters para esses atributos e os contrutores. Crie um método que retorne double chamado "CalcularSaldo", da mesma forma abaixo:

	public double calcularSaldo() {
		return this.saldo;
	}

Conclusão: A superclasse "Account" foi criada, com os atributos: "holder", "agency", "accountNum", e "balance". Também foram criados os getters e setters para cada atributo e os contrutores também. E o método "calculateBalance" também foi criado.

### Passo 4: Crie subclasse "ContaEspecial" recebendo através de herança os atributos de "ContaCorrente", também crie o atributo "limite" na subclasse junto com seus métodos get e set, e os construtores da subclasse. Crie também o método "CalcularSaldo" incluindo função abaixo, utilize o "@Override" para sobreescrever o método.

	double saldoFinal;
	saldoFinal = super.calcularSaldo() + limite;
	return saldoFinal;

Conclusão: A subclasse "SpecialAccount" foi criada, recebendo através de herança os atributos da superclasse "Account". O atributo "creditLimit" foi adicionado junto com seus métodos get e set, e os construtores da subclasse. O método "CalculateBalance" também foi adicionado e usando o "@Override" foi sobreescrito. 

### Passo 5: Crie o pacote controller.

Conclusão: Criado.

### Passo 6: Crie a classe "Teste" no pacote controller, essa classe dará funcionalidade ao sistema.

Conclusão: A classe "Atividade" foi criada, e foi criado 2 objetos, um usando a classe "Account" e o outro usando a classe "SpecialAccount".

# English

I must say in advance that the trasnlation portuguese to english might not be that good, I don't know much about the topic so I had basically no vocabulary to work with.

The 4th PDF intended to make me practice **polyformism**.

### Step 1: Create the project "13_Poliformismo".

Conclusion: The project "OOP-4th-PDF" was created.

### Step 2: Create the package model.

Conclusion: Done.

### Step 3: Create the superclass "ContaCorrente" its atributes are: "titular", "agencia", "numeroConta" and "saldo". Create the get and set methods for each atribute and create the class constructors. Also create the method "CalcularSaldo" that returns a double, just as shown bellow.

	public double calcularSaldo() {
		return this.saldo;
	}

Conclusion: The superclasse "Account" was created, its atributes are: "holder", "agency", "accountNum", and "balance". The get and set methods were created for each atribute as well as the constructors. The method "calculateBalance" was created too.

### Step 4: Create the subclass "ContaEspecial" inheriting the atributes from "ContaCorrente", create the atribute "limite" to the subclass and add its methods get and set, as well as the constructors. Create the method "CalcularSaldo" and use "@Override" on it, and include what's written bellow.

	double saldoFinal;
	saldoFinal = super.calcularSaldo() + limite;
	return saldoFinal;

Conclusion: The subclass "SpecialAccount" was created, it inherits the atributes from the superclass "Account". The atribute "creditLimit" was added as well as the methods get and set and the subclass constructors. The method "calculateBalance" was added using "@Override" with the code above.

### Step 5: Create the package controller.

Conclusion: Done.

### Step 6: Create the class "Teste" in the package controller and do some tests

Conclusion: The class "Atividade" was created and I added 2 objects, one using the "Account" constructor and the other using the "SpecialAccount" constructor.