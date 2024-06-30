/*Crie um programa que simula um jogo de adivinhação, que deve gerar um número
aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
A cada tentativa, o programa deve informar se o número digitado pelo usuário é
maior ou menor do que o número gerado.
 */

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 5;
        int chute = 0;
        System.out.println(numeroAleatorio);

        while (tentativas >= 1 && chute != numeroAleatorio){
            String palavraTentativa = tentativas > 1?"tentativas":"tentativa";

            System.out.printf("Adivinhe o numero de 1 a 100! Você tem %d %s: " , tentativas,palavraTentativa);
            chute = teclado.nextInt();
            if (chute != numeroAleatorio) {
                System.out.println("Errou, tente novamente!");
                tentativas--;
                if (numeroAleatorio > chute){
                    System.out.printf("Número secreto maior que %d\n", chute);
                }else {
                    System.out.printf("Número secreto menor que %d\n", chute);
                }
            }else {
                System.out.println("Parabéns você acertou!");
                break;
            }
            if (tentativas == 0){
                System.out.printf("Poxa! Não foi dessa vez, o numero sorteado era: %d", numeroAleatorio);
            }
        }

    }
}