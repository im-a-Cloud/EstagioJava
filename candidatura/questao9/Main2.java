package candidatura.questao9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Parte 9.3");
        System.out.println("");
        List<Pessoa> listaPessoas2 = new ArrayList<>();

        Pessoa paulo =  new Pessoa(8,"Paulo");
        Pessoa silas = new Pessoa(19,"Silas");
        Pessoa paulo2 = new Pessoa(18,"Paulo");
        Pessoa pedro = new Pessoa(25,"Pedro");
        Pessoa paulo3 = new Pessoa(50,"Paulo");

        listaPessoas2.add(paulo);
        listaPessoas2.add(silas);
        listaPessoas2.add(paulo2);
        listaPessoas2.add(pedro);
        listaPessoas2.add(paulo3);

        Collections.sort(listaPessoas2);

        for (int indice = 0; indice < listaPessoas2.size()-1; indice++) {
            if(listaPessoas2.get(indice).getNome()!=listaPessoas2.get(indice+1).getNome())
                System.out.println(listaPessoas2.get(indice).getNome());
        }
        System.out.println(listaPessoas2.get(listaPessoas2.size()-1).getNome());
    }
}
