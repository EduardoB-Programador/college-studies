# Português

Esse PDF teve a intenção de me fazer **praticar o uso de classes abstratas**, **entender como funciona abstrações**, **usar e montar uma interface java**.

---

## Parte 1: Diagrama - Pacote model

### Inicial:

* Classe Animal:

	* Atributos:

		1. nomenclatura - String;
		2. numeroDePatas - int;
		3. cobertoPor - String;
		4. reproducao - String;
		5. alimentacao - String;

	* Métodos:

		1. tipoDeRespiracao() - void;

* Classe Mamifero (Herda de Animal):

	* Atributos:

		1. habitat - String;

	* Métodos:

		1. tipoDeRespiracao() - void;

* Classe Reptil (Herda de Animal):

	* Atributos:

		1. capacidadeRegenerativa - boolean;

	* Métodos:

		1. tipoDeRespiracao() - void;

* Interface IAnimal (implementa em Mamifero e Reptil);

---

### Final

* Classe Animal:

	* Atributos:

		1. nomenclature - String;
		2. legAmount - int;
		3. coveredBy - String;
		4. reproduction - String;
		5. dietType - String;

	* Métodos:

		* respirationType() - void;

* Classe Mammal (Herda de Animal):

	* Atributos:

		* habitat - String;

	* Métodos:

		* respirationType() - void;

* Classe Reptile

	* Atributos:

		* regenerationCapability - boolean;

	* Métodos:

		* respirationType() - void;

* Interface IAnimal (implementa em Mamifero e Reptil);

---

## Parte 2: Exemplos

Na SuperClasse Animal, eis alguns exemplos de valores que seus atributos podem assumir quando seus respectivos objetos forem instanciados:

* numeroDePatas: a partir de 0
* cobertoPor: Pelos, escamas
* reproducao: Ovíparos, vivíparos
* alimentacao: Herbívoros, carnívoros

Na subclasse Mamifero, alguns exemplos de valores que o atributo habitat pode assumir quando seus respectivos objetos forem instanciados: terrestre, aquático.

Na subclasse Reptil, os valores que o atributo capacidadeRegenerativa pode assumir quando seus respectivos objetos forem instanciados só podem ser verdadeiro (true) ou falso (false).

---

## Parte 3: Instruções

1. Crie um projeto chamado ExFixacao_01 e elabore as referidas Classes com todos os seus atributos, métodos construtores e métodos get e set. (O método tipoDeRespiracao será feito na questão 3)

	* Conclusão: O nome do projeto é OOP-6th-PDF, e as classes foram feitas como instruido.

2. Crie no pacote controller a Classe CadastroAnimal e instancie os seguintes objetos:

	* Inicial:

		* jacare: réptil de 4 patas, coberto por escamas, reprodução tipo ovíparo, alimentação carnívoro, não possui capacidade regenerativa.
		* lagartixa: réptil de 4 patas, coberto por escamas, reprodução tipo ovíparo, alimentação carnívoro, possui capacidade regenerativa.
		* cachorro: mamífero de 4 patas, coberto por pelos, reprodução tipo vivíparo, alimentação carnívoro, habitat terrestre.
		* baleia: mamífero sem patas, coberto por pele, reprodução tipo vivíparo, alimentação carnívoro, habitat aquático.

	* Final: 

		* alligator: réptil de 4 patas, coberto por escamas, reprodução tipo ovíparo, alimentação carnívoro, não possui capacidade regenerativa.
		* lizard: réptil de 4 patas, coberto por escamas, reprodução tipo ovíparo, alimentação carnívoro, possui capacidade regenerativa.
		* dog: mamífero de 4 patas, coberto por pelos, reprodução tipo vivíparo, alimentação carnívoro, habitat terrestre.
		* whale: mamífero sem patas, coberto por pele, reprodução tipo vivíparo, alimentação carnívoro, habitat aquático.

3. Aplique o polimorfismo no método tipoDeRespiracao(), da seguinte forma:

	* Inicial:

		* Na SuperClasse Animal, o referido método exibe na tela o texto “Respiração do tipo: ”
		* Na subclasse Mamifero, o referido método aciona o método de mesmo nome na Classe Animal e também exibe na tela o texto “Pulmonar”.
		* Na subclasse Reptil, o referido método aciona o método de mesmo nome na Classe Animal e também exibe na tela o texto “Traquial”.

	* Final:

		* Na SuperClasse Animal, o referido método exibe na tela o texto “This animal's respiration type is: ”
		* Na subclasse Mammal, o referido método aciona o método de mesmo nome na Classe Animal e também exibe na tela o texto “Pulmonary”.
		* Na subclasse Reptile, o referido método aciona o método de mesmo nome na Classe Animal e também exibe na tela o texto “Tracheal”.

4. Transforme a SuperClasse em Classe abstrata.

5. Crie a Interface IAnimal, e faça com que as Classes Mamifero e Reptil implementem esta interface.

6. Na Interface IAnimal, crie o método temperaturaCorporal(), do tipo void.

	* Conclusão: O método criado é chamado bodyTemperature().	

7. Nas Classes que implementam a Interface, crie o método temperaturaCorporal(), de forma que ao ser acionado, exiba o texto “Temperatura Corporal: Pecilotérmico” para a Classe Reptil, e “Temperatura Corporal: Homeotérmico” para a Classe Mamifero.

	* Conclusão: O texto que aparece na classe Reptile é "Body Temperature: poikilothermic", e na classe Mammal é "Body Temperature: Homeothermic".

8. Crie um método abstrato chamado exibir(), que ao ser acionado, exiba todas as características do referido objeto e também acione os métodos tipoDeRespiracao e temperaturaCorporal. Acione o método exibir para cada objeto instanciado na Classe CadastroAnimal.

# English

This PDF intended to make me **practice using abstract classes**, **understand how abstractions work**, **build and use java interfaces**.