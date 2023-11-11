import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Cachorro cachorro1 =  new Cachorro("Toby", "branco", 25);

        Gato gato1 = new Gato( "Felix","preto", 1.8);
        Gato gato2 = new Gato("Tiger", "vermelho", 5.5);

        Passaro passaro1 =  new Passaro( "Piu", "amarelo", 1.89);


        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        cachorro1.interagir("carinho");

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoEspirito());

        petshop.darBanho(gato1);
        System.out.println("Meu gato está " + gato1.getEstadoEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoEspirito());

        System.out.println("quantidade de cachorros: " + Cachorro.getNumeroDeCachorros());
        System.out.println("quantidade de gatos: " + Gato.getNumeroDegatos());

        System.out.println(gato2.nome);






    }
}