import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*****Buscar user no github*****");
        System.out.print("Digite o nome de usuário: ");
        String usuario = teclado.nextLine();
        String endereco = "https://api.github.com/users/" + usuario;

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado.");
            }
            System.out.println("Usuario " + usuario + " encontrado com sucesso!");

        } catch (IOException | InterruptedException e) {
            System.out.println("Erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        }catch (ErroConsultaGitHubException  e){
            System.out.println(e.getMessage());
        }

    }
}
