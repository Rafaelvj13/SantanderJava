import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 4, 13, 15};
        String[] nomes = {"Rafael", "Jose", "Gabriel"};

        System.out.println(numeros[1]);
        System.out.println(nomes[1]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println(Arrays.toString(nomes));
    }
}
