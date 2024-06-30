package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelo.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelo.Musica;
import br.com.alura.minhasmusicas.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Musica qualquer");
        for (int i = 0; i < 5000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i < 500; i++) {
            minhaMusica.curtir();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podcast famoso");
        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduzir();
        }
        for (int i = 0; i < 100; i++) {
            minhaMusica.curtir();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);

    }
}
