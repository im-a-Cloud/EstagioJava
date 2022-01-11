package candidatura.questao8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class Questao8 extends Exception {


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Parte 8.1");
        System.out.println("Entre com a sua idade");
        int idade;
        idade = scan.nextInt();
        try {
            checadaException(idade);
        }
        catch (Exception exception){
            System.out.println("O seguinte erro aconteceu: " +exception);
        }


        class Excecao{
            public void lancaChecada() throws Exception{
                try {
                    Date date = new Date();
                    int diaHoje;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    diaHoje = calendar.get(Calendar.DAY_OF_MONTH);
                    if (diaHoje % 2 != 0) {
                        checadaException(idade);
                        }
                    }
                    catch(Exception erro) {
                        System.out.println("O dia de hoje é par");
                    }
                }
            public void propagadaChecada() throws Exception{
                    lancaChecada();
                }
            }
        Excecao excecao = new Excecao();
        excecao.lancaChecada();
        excecao.propagadaChecada();
        naoChecadaException();
    }
    static void checadaException(int idade) throws Questao8{
        if (idade < 18){
            System.out.println("Você tem menos de 18");
        }else{
            System.out.println("Você tem mais de 18");
        }
    }
    static void naoChecadaException(){
        try {
            FileReader arquivo = new FileReader("arquixo.xml");
            arquivo = null;
            arquivo.read();
        }
        catch (Exception e){
            System.out.println("Não há arquivo com esse nome/formato");
        }
    }
}
