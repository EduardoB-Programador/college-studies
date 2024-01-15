package controller;

//3 - Class name is "Atividade"

public class Atividade {

    //10
    static int x = 1;

    public static void main(String[] args) {

        /*English
        1st step: Create the project 07_Metodo
        1 - The project's name, defined by me, is OOP-1st-PDF

        2nd step: Create the package controller
        2 - Done

        3rd step: Create the class "escopoDeVariavel"

        4th step: In the main method, create the local variable int x = 5, and type:
            System.out.println("x in the start of the main() is " + x)

        5th step: run the code
            analyse
                (intellij broke IDK lol, no autocompletion) but it ran ok

        6th step: Create the methodA() and type:
            public static void methodA() {
                int x = 25;
                System.out.println("Local variable x entering the methodA() is " + x);
                x = x+1;
                System.out.println("Local variable x before leaving the methodA() is " + x);
            }

        7th step: run the code
            analyse
                methodA() didn't run

        8th step: Call the methodA() inside the main method
            methodA();

        9th step: run the code
            analyse
                the methodA() ran

        10th step: Create global variable "x" before the main method
            static int x = 1;

        11th step: Create the methodB() as it is below
            public static void methodB() {
                System.out.println("x variable entering the methodB() is global " + x);
                x = x*10;
                System.out.println("x variable before leaving the methodB is " + x);
            }

        12th step: run the code
            analyse
                methodB() didn't run

        13th step: call the methodB() inside the main method
            methodB();

        14th step: run the code
            analyse
                the methodB() ran

        15th step: Call the methodA() inside the main method again

        16th step: run the code
            analyse
                the methodA() ran twice

        17th step: Call the methodB() inside the main method again

        18th step: run the code
            analyse
                methodB() ran twice, but the variable got 10 times bigger than the first time

        19th step: Create the methodB() getting the local variable from the main method:
            public static void methodB(int x) {
                System.out.println("x variable entering the methodB() is global " + x);
                x = x*10;
                System.out.println("x variable before leaving the methodB is " + x);
            }

        20th step: run the code
            analyse
                it ran the same as the 18th step

        21st step: Call the methodB() inside the main method inserting a parameter x (from main to methodB)
            methodB(x);

        22nd step: run the code
            analyse
                the output from the 3rd methodB() call was different, it was because it took the variable
                from main

                tested in the main method and the x variable didn't change

                apparently even if you return x the x variable in main doesn't change, but if I assign
                the return to another variable it gets the returned value
        */
        /*Português
        Passo 1 - Criar o projeto 07_Metodo
        O nome que eu dei pro projeto foi OOP-1st-PDF

        Passo 2 - Criar o pacote controller
        criado

        Passo 3 - Criar a Classe EscopoDeVariavel
        O nome que eu dei pra classe foi "Atividade"

        Passo 4 - No método main, criar variável local do main x=5 e exibir este valor:
            public static void main(String[] args) {
                int x = 5;
                System.out.println("x no início de main() é " + x);
            }

        Passo 5 - Rodar o programa. O que você conclui observando o resultado apresentado até aqui?
            Intellij deu uma quebrada mas foi só o autocompletar, rodou tranquilo

        Passo 6 - Criar o metodoA:
            public static void metodoA(){
                int x = 25;
                System.out.println("Variavel local x ao entrar no metodoA é " + x);
                x=x+1;
                System.out.println("variável local x antes de sair do metodoA é " + x);
            }

        Passo 7 - Rodar o programa. O que você conclui observando o resultado apresentado até aqui?
            metodoA() não rodou

        Passo 8 - Criar a chamada do metodoA dentro do main:
            metodoA();

        Passo 9 - Rodar o programa. O que você conclui observando o resultado apresentado até aqui?
            metodoA() rodou

        Passo 10 - Criar variável global x, antes do método main:
            static int x = 1; //variável global

        Passo 11 - Criar o metodoB, conforme abaixo:
            public static void metodoB(){
                System.out.println("Variável x ao entrar no metodoB é "+ x + " global.");
                x = x*10;
                System.out.println("Variável x antes de sair do metodoB é "+x);
            }

        Passo 12 - Rodar o programa. O que você conclui observando o resultado apresentado até aqui?
            metodoB() não rodou

        Passo 13 - Inserir chamada do metodoB dentro do main:
            metodoB();

        Passo 14 - Rodar o programa. O que você conclui observando o resultado apresentado até aqui?
            metodoB() rodou

        Passo 15 - Inserir outra chamada do metodoA no main:
            metodoA();

        Passo 16 - Rodar o programa. O que você conclui observando o resultado apresentado até aqui?
            metodoA() rodou duas vezes

        Passo 17 - Inserir outra chamada, agora do metodoB no main:
            metodoB();

        Passo 18 - Rodar o programa. O que você conclui observando o resultado apresentado até aqui?
            metodoB() rodou duas vezes, mas a variavel ficou 10 vezes maior que na primeira vez

        Passo 19 - Criar o metodoB com passagem de atributo de variável local do método main:
            public static void metodoB(int x){
                System.out.println("Variável x ao entrar no metodoB é "+ x + " global.");
                x = x*10;
                System.out.println("Variável x antes de sair do metodoB é "+x);
            }

        Passo 20 - Rodar o programa. O que você conclui observando o resultado apresentado até aqui?
            Rodou da mesma forma que o passo 18

        Passo 21 - Inserir chamada no main do metodoB com passagem de parâmetro (do main para o metodoB):
            metodoB(x);

        Passo 22 - Rodar o programa. O que você conclui observando o resultado apresentado até aqui?
            A saida da terceira chamada do metodoB() foi diferente, porque usou a variável do main
            pra fazer a operação

            tentei ver o valor da variável x no main depois de ter chamado os métodos mas não saiu 50
            como saiu na última chamada do metodoB()

            aparentemente se eu retornar x do metodoB a variável X do método main não muda, mas se eu
            associar uma variável à saida do método main essa variável adquire o valor da saída
        */

        //5
        int x = 5;

        System.out.println("x in the start of the main() is " + x);

        //8
        methodA();
        //13
        methodB();
        //15
        methodA();
        //17
        methodB();
        //extra
        int y = methodB(x);

        //extra
        System.out.println(y);
    }

    //6
    public static void methodA() {

        int x = 25;

        System.out.println("Local variable x entering the methodA() is " + x);

        x = x+1;

        System.out.println("Local variable x before leaving the methodA() is " + x);

    }

    //11
    public static void methodB() {

        System.out.println("x variable entering the methodB() is global " + x);

        x = x*10;

        System.out.println("x variable before leaving the methodB is " + x);

    }

    //19
    public static int methodB(int x) {
//it was void but I put int to return x
        System.out.println("x variable entering the methodB() is global " + x);

        x = x*10;

        System.out.println("x variable before leaving the methodB is " + x);
        //extra
        return x;
    }
}
