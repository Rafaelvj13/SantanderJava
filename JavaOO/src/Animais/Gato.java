package Animais;

public class Gato extends Animal{

    static int numeroDegatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);

        numeroDegatos ++;
    }

    public static int getNumeroDegatos() {
        return numeroDegatos;
    }

    public static void setNumeroDegatos(int numeroDegatos) {
        Gato.numeroDegatos = numeroDegatos;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("MIAU");
    }
}

