/*Declare uma variável do tipo double valorEmDolares.
Atribua um valor em dólares a essa variável.
Considere que o valor de 1 dólar é equivalente a 4.94 reais.
Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
 */

public class Main {
    public static void main(String[] args) {
        double valorEmDolares = 2;
        double cotacao = 4.94;
        double reais = valorEmDolares * cotacao;
        System.out.printf("%f dolar custa %f reais",valorEmDolares,reais);

    }
}