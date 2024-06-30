import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 * Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse
 * para fazer uma consulta à API CoinGecko e exiba a cotação atual de uma criptomoeda
 * escolhida pelo usuário.
 */

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*****Buscar um moeda*****");
        System.out.println("Ex: euro");
        System.out.println("Digite o nome de uma moeda:");
        var moeda = teclado.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + moeda + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}
