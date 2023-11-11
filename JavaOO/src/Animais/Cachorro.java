package Animais;
//atributos
public class Cachorro extends Animal {
   static int numeroDeCachorros;

    //Construtores

    //construtor padrao nao recebe argumeto
    public Cachorro(String nome, String cor, double peso){

        super(nome, cor, peso);

        numeroDeCachorros ++;   //vai contanto o numero de cachorros;

    }



  //encapsulamento

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome(){
      return this.nome;
  }

  public void setNome(String nome){
      this.nome = nome;
  }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoEspirito() {
        return estadoEspirito;
    }

    public void setEstadoEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }

    //metodos

   //público com retorno
   public String pegar(){
       return "Bolinha";

   }
   public String interagir(String acao){

       switch (acao){
           case "carinho" : this.estadoEspirito = "feliz"; break;
           case "vai dormir" : this.estadoEspirito = "bravo"; break;
           case "pisar na patinha" : this.estadoEspirito = "triste"; break;
           default: this.estadoEspirito = "neutro";
       }

       return this.estadoEspirito;

   }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("au au");;
    }
}

