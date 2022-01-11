package candidatura.questao3;

import java.util.Random;

public class Questao3 {
    public static void main(String[] args) throws Exception {
        Random Num_Aleatorio = new Random();
        int R = Num_Aleatorio.nextInt(9) + 1 ;
        int S = Num_Aleatorio.nextInt(999) + 1 ;
        int Soma = 0;
        System.out.println("Valor de S " + S);
        System.out.println("Valor de R " + R);
        for (int Contador = 1; Contador <= S; Contador++){
            float Resto = R % Contador;
            if(Resto == 0){
                Soma+=Contador;
                }
            if(Contador>R){
                break;
            }
        }
        System.out.println("Valor da soma: " +Soma);
    }
}