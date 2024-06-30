package br.com.alura.minhasmusicas.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " Esta no TOP+");
        }else{
            System.out.println(audio.getTitulo() + " Otimo para ouvir");
        }
    }
}
