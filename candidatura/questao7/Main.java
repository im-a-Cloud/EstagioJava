package candidatura.questao7;
import java.util.Scanner;

class ClasseA {
    public void meImplemente(){
        System.out.println("Classe A implementada");
    }
}
class ClasseB {
    public void meImplemente(){
        System.out.println("Classe B implementada");
    }
}

class ClasseC extends ClasseB {
        @Override
        public void meImplemente() {
            System.out.println("Classe C implementada");
        }
    };

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String letra;
        System.out.println("Entre com uma letra A,B ou C");
        letra = scan.nextLine();
        if (!(letra == null)){
            executar(letra);
        }
    }

    public static void executar(String letra) {
        switch (letra) {
            case "A", "a":
                ClasseA classeA = new ClasseA();
                classeA.meImplemente();
                break;
            case "B", "b":
                ClasseB classeB = new ClasseB();
                classeB.meImplemente();
                break;
            case "C", "c":
                ClasseC classeC = new ClasseC();
                classeC.meImplemente();
                break;
            default:
                System.out.println("Entrada inválida");
                break;
        }
    }
}

