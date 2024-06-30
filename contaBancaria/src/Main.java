import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        double valor;
        String nomeDoCliente = "Augusto";
        String tipoConta = "corrente";
        double saldo = 100;


        System.out.println("******************************************");
        System.out.println("|   Nome do Cliente: " + nomeDoCliente + "             |");
        System.out.println("|   Tipo de Conta: " + tipoConta + "              |");
        System.out.println("|   Saldo: R$ " + saldo + "                      |");
        System.out.println("******************************************");

        while (menu !=4){
            //System.out.println("***************************************");
            System.out.println("|   1- Saldo: " + "                           |");
            System.out.println("|   2- Depósito " + "                         |");
            System.out.println("|   3- Transferencia " + "                    |");
            System.out.println("|   4- Sair " + "                             |");
            System.out.print("Digite a opção desejada: ");
            menu = teclado.nextInt();
            System.out.println("******************************************");

            if (menu ==1){
                System.out.println("|    Saldo atual é: R$" + saldo + "              |");
                System.out.println("******************************************");
            } else if(menu ==2) {
                System.out.print("Qual o valor do depósito? ");
                saldo += teclado.nextDouble();
                System.out.println("******************************************");
                System.out.println("|   Deposito realizado com sucesso!" + "      |");
                System.out.println("|   Novo saldo: R$" + saldo + "                  |");
                System.out.println("******************************************");
            }else if(menu ==3) {
                System.out.print("Qual o valor da transferencia? ");
                valor = teclado.nextDouble();
                if (valor >saldo){
                    System.out.println("******************************************");
                    System.out.println("|   Saldo insuficiente!                  |");
                    System.out.println("******************************************");
                }else{
                    saldo -= valor;
                    System.out.println("******************************************");
                    System.out.println("|   Transferencia realizada com sucesso!" + " |");
                    System.out.println("|   Novo saldo: R$" + saldo + "                   |");
                    System.out.println("******************************************");
                }

            } else if (menu !=4) {
                System.out.println("|   Opção invalida!                      |");
                System.out.println("******************************************");


            }
        }


    }
}