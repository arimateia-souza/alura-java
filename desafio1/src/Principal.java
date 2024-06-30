import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeProduto;
        double valorDoPrduto;
        int menu=0;

        System.out.print("Digite o limite do seu cartão:");
        double limite = teclado.nextDouble();
        teclado.nextLine(); //limpar buffer
        CartaoDeCredito cartao = new CartaoDeCredito(limite);
        System.out.println("Seu limite atual é R$ " + limite);
        System.out.println("O que você vai comprar?");
        nomeProduto = teclado.nextLine();
        System.out.println("Quanto custa?");
        valorDoPrduto = teclado.nextDouble();
        Compra compra = new Compra(nomeProduto, valorDoPrduto);
        if (cartao.lancaCompra(compra)){
            System.out.println("Compra realizada com sucesso!");
            System.out.println("Deseja comprar mais? 1 - Sim, 0 - Não");
            menu = teclado.nextInt();
        }else{
            System.out.println("Sem saldo, ");
        }
        System.out.println(cartao.lancaCompra(compra));
        System.out.println( cartao.getSaldo());

    }
}
