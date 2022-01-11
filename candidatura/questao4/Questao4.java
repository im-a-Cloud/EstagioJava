package candidatura.questao4;

import java.util.Random;

public class Questao4 {
    public static void main(String[] args) throws Exception{

        qualDiaMes();
    }

private static void diasMes(int M){
    switch (M){
        case 1,3,5,7,8,10,12:
            System.out.println("Mês com 31 dias");
            break;
        case 2:
            System.out.println("Mês com menos de 30 dias");
            break;
        case 4,6,9,11:
            System.out.println("Mês com 30 dias");
            break;
        default:
            System.out.println("Entrada inválida");
        }
    }
final static void qualDiaMes(){
    Random Num_Aleatorio = new Random();
    int Mes = Num_Aleatorio.nextInt(11) + 1 ;
    diasMes(Mes);
    }
}