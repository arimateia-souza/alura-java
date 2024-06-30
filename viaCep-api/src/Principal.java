import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        ConsultaCep cep = new ConsultaCep();
        String busca = "";
        System.out.print("Digite o CEP da busca:");
        busca = teclado.nextLine();

        try {
            Endereco endereco = cep.buscar(busca);
            System.out.println(endereco);
            Arquivo arquivo = new Arquivo();
            arquivo.gerar(endereco);
    }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
