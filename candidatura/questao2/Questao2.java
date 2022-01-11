package candidatura.questao2;

import java.util.Random;

public class Questao2 {
    public static void main(String[] args) throws Exception {
        Random Num_Aleatorio = new Random();
        int R = Num_Aleatorio.nextInt(9) + 1 ;
        int S = Num_Aleatorio.nextInt(99) + 1 ;
        System.out.println("Valor de S " + S);
        System.out.println("Valor de R " + R);
        for (int Contador = 1; Contador <= S; Contador++){
            if(Contador%2 == 0){
            System.out.println(Contador);
                if(Contador%2 == 0 && Contador%(R*2)==0){
                    System.out.println("Múltiplo do dobro de R encontrado");
                    break;
                    }
                }
            }
        }
    }