package controller;

/**Português
 * Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 200. Para
 * saber se o número é divisível por 4 será necessário verificar a lógica desta condição com o comando if.
 * Sendo divisível, mostre-o; não sendo, passe para o próximo passo. A variável que controla o contador
 * deve ser iniciada com valor 1.
 *
 * English
 * Create a code that shows all numbers between 1 and 200 that can be divided by 4 resulting in an integer.
 **/

public class Atividade7 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 200) {
            if (i % 4 == 0) {
                System.out.println("The number " + i + " can be divided by 4 and result in an integer.");
            }
            i++;
        }
    }
}
