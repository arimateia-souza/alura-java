import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public void gerar(Endereco endereco) throws IOException {
        Gson geson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(endereco.cep() + ".json");
        escrita.write(geson.toJson(endereco));
        escrita.close();
    }
}
