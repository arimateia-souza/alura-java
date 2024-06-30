import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

/**
 * Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse
 * para fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um livro,
 * e exiba as informações disponíveis sobre o livro retornado pela API.
 */

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*****Buscar um Livro*****");
        System.out.println("Substitua o espaço por -. Ex: O-caçador-de-pipas");
        System.out.println("Digite o nome de um livro para buscar:");
        var busca = teclado.nextLine();
        var chave = "&key=AIzaSyBR0fSgYRQyDm6_mkMuP4t6jXUZstb1y34";

        var endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }


}
