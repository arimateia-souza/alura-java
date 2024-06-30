import java.util.Scanner;

/**
 * Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch
 * para capturar a exceção SenhaInvalidaException, uma classe de exceção
 * personalizada que deve ser lançada caso a senha não atenda a critérios
 * específicos (por exemplo, ter pelo menos 8 caracteres).
 */

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        String senha = teclado.nextLine();
        try {
            if (senha.length() < 8) {
                throw new SenhaInvalidaException("senha invalida");
            }
            System.out.println("Senha ok");
        }catch (SenhaInvalidaException e){
            System.out.println("Erro:" + e.getMessage());

        }
    }
}
