package candidatura.questao10;

public class BrechaBinaria{
    public int numeroInteiro;

    BrechaBinaria(int numeroInt){
        numeroInteiro = numeroInt;
    }
    void numeroBinario(int valor){
        int valorInteiro = valor;
        int indice = 0;
        int maiorBrecha = 0;
        int auxBrecha = 0;
        int binario[]= new int[100];
        while(valor != 0){
            binario[indice] = valor%2;
            valor = valor/2;
            indice++;
        }
        System.out.println("Valor de " + valorInteiro+ " em binário é: ");
        for (int i = indice-1; i >=0; i--) {
            System.out.print(""+binario[i]);
        }
        System.out.println("");
        for (int indice2 = 0; indice2 < binario.length; indice2++) {
            if (binario[indice2]==0){
                auxBrecha++;
            }else if (auxBrecha > maiorBrecha){
                maiorBrecha = auxBrecha;
                auxBrecha=0;
            }else if(binario[binario.length-1] == 0){
                int segundaMaiorBrecha = 0;
                segundaMaiorBrecha = auxBrecha;
                maiorBrecha = segundaMaiorBrecha;
            }
        }
        if (maiorBrecha == 0){
            System.out.println("Não há brecha binária");
        }else{
            System.out.println("A maior brecha binária tem " + maiorBrecha+ " zeros");
        }
    }
}