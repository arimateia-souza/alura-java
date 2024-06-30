import java.util.Scanner;

/**
 * Crie um programa simples que solicita dois números ao usuário e
 * realiza a divisão do primeiro pelo segundo. Utilize o bloco try/catch
 * para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
 */

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int  numeros []= new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = teclado.nextInt();
        }
        try {
            int resultado = numeros[0]/numeros[1];
            System.out.println("Resulto é: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro: Divisor não poder ser 0");
        }
    }
}
