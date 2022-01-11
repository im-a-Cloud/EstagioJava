package candidatura.questao6;

public class Questao6{

    static int valorParaTodas;

    static final int constante = 10;

    public void meExtenda(){
        System.out.println("Funcionou");
    }

    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.meExtenda();
    }
}

class Teste extends Questao6{

}
