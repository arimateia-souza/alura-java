import java.io.FileWriter;
import java.io.IOException;

/**
 * rie um programa em Java que escreva a seguinte mensagem em um arquivo chamado
 * "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes
 * do pacote java.io.
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        FileWriter escrita = new FileWriter("arquivo.txt");
        var frase = "Conteúdo a ser gravado no arquivo.";
        escrita.write(frase);
        escrita.close();
    }
}
