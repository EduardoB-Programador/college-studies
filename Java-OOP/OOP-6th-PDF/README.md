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

	Conclusão: A classe criada no package controller foi chamada de Atividade.

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

	* Conclusão: O método criado foi chamado de "showInfo()", o resto foi realizado como instruido

# English

This PDF intended to make me **practice using abstract classes**, **understand how abstractions work**, **build and use java interfaces**.

---

## Part 1: Diagram - Package model

### Initial instruction:

* Class Animal:

	* Atributes:

		1. nomenclatura - String;
		2. numeroDePatas - int;
		3. cobertoPor - String;
		4. reproducao - String;
		5. alimentacao - String;

	* Methods:

		1. tipoDeRespiracao() - void;

* Class Mamifero (inherits from Animal):

	* Atributes:

		1. habitat - String;

	* Methods:

		1. tipoDeRespiracao() - void;

* Class Reptil (inherits from Animal):

	* Atributes:

		1. capacidadeRegenerativa - boolean;

	* Methods:

		1. tipoDeRespiracao() - void;

* Interface IAnimal (implements in Mamifero and Reptil);

---

### Written

* Class Animal:

	* Atributes:

		1. nomenclature - String;
		2. legAmount - int;
		3. coveredBy - String;
		4. reproduction - String;
		5. dietType - String;

	* Methods:

		* respirationType() - void;

* Class Mammal (inherits from Animal):

	* Atributes:

		* habitat - String;

	* Methods:

		* respirationType() - void;

* Class Reptile

	* Atributes:

		* regenerationCapability - boolean;

	* Methods:

		* respirationType() - void;

* Interface IAnimal (implements in Mammal and Reptile);

---

## Part 2: Examples

In the Animal superclass, you can see below some values that its atributes may assume when instantiating its objects:

* legAmount: Starting from 0
* cobertoPor: fur, scales
* reproducao: Lay eggs, give birth
* alimentacao: Herbivore, carnivore

In the subclass Mammal, some examples of values that the atribute "habitat" may assume are: terrestrial and aquatic.

In the subclass Reptile, the values that the atribute "regenerationCapability" may assume are either true or false.

---

## Part 3: Instructions

1. Create a project called "ExFixacao_01" and create the mentioned classes with its atributes, constructor methods and get and set methods. (The method respirationType() will be created in the third step)

	* Conclusion: The project name is "OOP-6th-PDF", and the classes were done as instructed.

2. Create the package controller and the class "CadastroAnimal" and instanciate the following objects:

	Conclusion: The class created in the package controller was called "Atividade".

	* Initial instruction:

		* jacare: 4 leg reptile, covered by scales, lay eggs, carnivore, doesn't have regeneration capabilities.
		* lagartixa: 4 leg reptile, covered by scales, lay eggs, carnivore, has regeneration capabilities.
		* cachorro: 4 leg mammal, covered by fur, gives birth, carnivore, terrestrial habitat.
		* baleia: legless mammal, covered by skin, gives birth, carnivore, aquatic habitat.

	* Written: 

		* alligator: 4 leg reptile, covered by scales, lay eggs, carnivore, doesn't have regeneration capabilities.
		* lizard: 4 leg reptile, covered by scales, lay eggs, carnivore, has regeneration capabilities.
		* dog: 4 leg mammal, covered by fur, gives birth, carnivore, terrestrial habitat.
		* whale: legless mammal, covered by skin, gives birth, carnivore, aquatic habitat.

3. Apply the polyformism on the method respirationType(), just like bellow:

	* Initial instruction:

		* On superclass Animal, the method must show “Respiração do tipo: ”.
		* On subclass Mamifero, the method must trigger the method respirationType() from the superclass and show “Pulmonar”.
		* On subclass Reptil, the method must trigger the method respirationType() from the superclass and show “Traquial”.

	* Written:

		* On superclass Animal, the method must show “This animal's respiration type is: ”
		* On subclass Mammal, the method must trigger the method respirationType() from the superclass and show “Pulmonary”.
		* On subclass Reptile, the method must trigger the method respirationType() from the superclass and show “Tracheal”.

4. Transform the superclass in an abstract class.

5. Create the interface IAnimal, nad make the classes Mammal and Reptile implement the interface.

6. In the IAnimal interface, create the method "temperaturaCorporal()", that returns void.

	* Conclusion: The method created was called "bodyTemperature()".	

7. In the classes that implement the interface, create the method "temperaturaCorporal()", that shows when triggered “Temperatura Corporal: Pecilotérmico” in the Reptile class, and “Temperatura Corporal: Homeotérmico” in the Mammal class.

	* Conclusion: The text that will appear in the Reptile class is "Body Temperature: poikilothermic", and in the Mammal class is "Body Temperature: Homeothermic".

8. Create a method called "exibir()", that shows all the object's characteristics when triggered and also trigger the respirationType() and bodyTemperature() methods. Show all info using this method from all objects in the "Atividade" class in the package controller.

* Conclusion: The method created was called "showInfo()", the remainig instructions were done a intended.