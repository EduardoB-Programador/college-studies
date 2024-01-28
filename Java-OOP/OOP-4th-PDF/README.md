# Português

Adiantando que provavelmente a tradução do português para inglês não deve estar muito boa por conta da minha falta de vocabulário.

O 4° PDF teve a intenção de me fazer praticar o uso do **@Override**.

### Passo 1: Crie o projeto 13_Poliformismo.

Conclusão: O nome do projeto é OOP-4th-PDF.

### Passo 2: Crie o pacote model.

Conclusão: Criado.

### Passo 3: Crie a superclasse "ContaCorrente", com os atributos: "titular", "agencia", "numeroConta" e "saldo". Crie também os getters e setters para esses atributos e os contrutores. Crie um método que retorne double chamado "CalcularSaldo", da mesma forma abaixo:

	```java
	public double calcularSaldo(){
		return this.saldo;
	}
	```

Conclusão: A superclasse "Account" foi criada, com os atributos: "holder", "agency", "accountNum", e "balance". Também foram criados os getters e setters para cada tributo e os contrutores também. E o método "calculateBalance" também foi criado.

### Passo 4: Crie subclasse "ContaEspecial" recebendo através de herança os atributos de "ContaCorrente", também crie o atributo "limite" na subclasse junto com seus métodos get e set, e os construtores da subclasse. Crie também o método "CalcularSaldo" incluindo função abaixo, utilize o "@Override" para sobreescrever o método.

	```java
	double saldoFinal;
	saldoFinal = super.calcularSaldo() + limite;
	return saldoFinal;
	```

Conclusão: A subclasse "SpecialAccount" foi criada, recebendo através de herança os atributos da superclasse "Account". O atributo "creditLimit" foi adicionado junto com seus métodos get e set, e os construtores da subclasse. O método "CalculateBalance" também foi adicionado e usando o "@Override" foi sobreescrito. 

### Passo 5: Crie o pacote controller.

Conclusão: Criado.

### Passo 6: Crie a classe "Teste" no pacote controller, essa classe dará funcionalidade ao sistema.

Conclusão: A classe "Atividade" foi criada, e foi criado 2 objetos, um usando a classe "Account" e o outro usando a classe "SpecialAccount".

# English