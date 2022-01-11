package candidatura.questao10;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroInteiro;
        System.out.println("Entre com um número inteiro positivo");
        numeroInteiro = scan.nextInt();
        if (numeroInteiro>=1 && numeroInteiro<=2147483647){
            BrechaBinaria brechaBinaria = new BrechaBinaria(numeroInteiro);
            brechaBinaria.numeroBinario(numeroInteiro);

        }
        else {
            System.out.println("Valor inválido, tente com um valor entre 1 e 2147483647 ");
        }
    }
}
