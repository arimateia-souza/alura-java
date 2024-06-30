/*Declare uma variável do tipo double precoProduto e uma variável do
tipo int (quantidade). Calcule o valor total multiplicando o preço do
produto pela quantidade e apresente o resultado em uma mensagem.
 */

public class Main {
    public static void main(String[] args) {
        double precoProduto = 2.50;
        int quantidade = 2;
        System.out.println("Preço do produto: " + precoProduto + "\nQuantidade: " + quantidade);
        System.out.println("Valor total: " + precoProduto*quantidade);
    }
}