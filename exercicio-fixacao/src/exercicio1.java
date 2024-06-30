import java.util.ArrayList;
import java.util.Collections;

public class exercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros= new ArrayList<>();

        numeros.add(4);
        numeros.add(8);
        numeros.add(0);
        numeros.add(2);
        System.out.println("Antes de ordenar");
        System.out.println(numeros);

        Collections.sort(numeros);
        System.out.println("Depois de ordenar");
        System.out.println(numeros);



    }
}
