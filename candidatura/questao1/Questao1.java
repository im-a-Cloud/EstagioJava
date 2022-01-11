package candidatura.questao1;
import java.util.Random;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Random Num_Aleatorio = new Random();
        int R = Num_Aleatorio.nextInt(99) + 1 ;
        System.out.println("Valor de R " + R);
        for (int Contador = 1; Contador <= R; Contador++){
            if(Contador%2 == 0 && Contador%5 !=0){
            System.out.println(Contador);
                }
            }
        }
    }
