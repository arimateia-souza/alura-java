/*Declare uma variável do tipo double e uma variável do tipo int.
Faça o casting da variável double para int e imprima o resultado.
 */

public class Main {
    public static void main(String[] args) {
        double d = 3;
        int inteira = (int) d;
        System.out.printf("Variavel sem casting: %f %nVariavel com casting: %d",d,inteira);

    }
}