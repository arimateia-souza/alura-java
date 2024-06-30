/*Declare uma variável do tipo double precoOriginal.
Atribua um valor em reais a essa variável, representando o preço original de um produto.
Em seguida, declare uma variável do tipo double percentualDesconto
e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
Calcule o valor do desconto em reais, aplique-o ao preço original e
imprima o novo preço com desconto.
 */

public class Main {
    public static void main(String[] args) {
        double precoOriginal = 25.00;
        double percentualDesconto = 1;
        double desconto = (percentualDesconto / 100.0) * precoOriginal;
        double precoNovo = precoOriginal - desconto;

        System.out.printf("""
                        Valor original: R$%f %nDesconto de R$%f %nCom desconto: R$%f
                        """,precoOriginal,desconto,precoNovo);

    }
}