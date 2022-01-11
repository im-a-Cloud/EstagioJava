package candidatura.questao9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Pessoa pessoaTemp;
        List<Pessoa> listaPessoas = new ArrayList<>();
        List<Pessoa> listaPessoasPesquisadas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        Pessoa joao = new Pessoa(10, "João");
        Pessoa alice = new Pessoa(5, "Alice");
        Pessoa fernando = new Pessoa(27, "Fernando");
        Pessoa priscilla = new Pessoa(31, "Priscilla");

        listaPessoas.add(joao);
        listaPessoas.add(alice);
        listaPessoas.add(fernando);
        listaPessoas.add(priscilla);

        System.out.println("Parte 9.1");

        System.out.println("");

        for (int indice1 = 0; indice1 < listaPessoas.size(); indice1++)
            for (int indice2 = indice1 + 1; indice2 < listaPessoas.size(); indice2++) {
                if (listaPessoas.get(indice1).getIdade() > listaPessoas.get(indice2).getIdade()) {
                    pessoaTemp = listaPessoas.get(indice1);
                    listaPessoas.set(indice1, listaPessoas.get(indice2));
                    listaPessoas.set(indice2, pessoaTemp);
                }

            }

        for (int indice3 = 0; indice3 < listaPessoas.size(); indice3++) {
            System.out.println(listaPessoas.get(indice3).getNome());
        }
        System.out.println("");

        System.out.println("Parte 9.2");

        System.out.println("");

        for (int indice4 = 0; indice4 < listaPessoas.size(); indice4++) {
            if (listaPessoas.get(indice4).getIdade() == 27) {
                int IndiceParaRemover = indice4;
                listaPessoas.remove(IndiceParaRemover);
            }
            System.out.println(listaPessoas.get(indice4).getNome());
        }

        class CachePessoa {
            public void retornaPessoa(int idPessoa) {
                for (int indice5 = 0; indice5 < listaPessoasPesquisadas.size(); indice5++) {
                    if (idPessoa == listaPessoasPesquisadas.get(indice5).getId()){
                        System.out.println(listaPessoasPesquisadas.get(indice5).getNome());
                        System.out.println(listaPessoasPesquisadas.get(indice5).getIdade());
                        System.out.println("");
                        return;
                    }
                }
                for (int indice6 = 0; indice6 < listaPessoas.size(); indice6++) {
                    if (idPessoa == listaPessoas.get(indice6).getId()){
                        System.out.println(listaPessoas.get(indice6).getNome());
                        System.out.println(listaPessoas.get(indice6).getIdade());
                        listaPessoasPesquisadas.add(listaPessoas.get(indice6));
                        System.out.println("");
                        return;
                    }
                }
                System.out.println("Não achamos nenhuma pessoa com esse ID no nosso banco de dados");
            }
        }
        System.out.println("Parte 9.4");
        System.out.println("");
        int buscaId,quantidadeBuscas;
        System.out.println("Digite quantas buscas deseja fazer");
        quantidadeBuscas = scan.nextInt();
        for (int indice7 = 0; indice7 < quantidadeBuscas; indice7++) {
            System.out.println("Digite o id da pessoa a ser pesquisada");
            buscaId = scan.nextInt();
            CachePessoa buscarPessoa = new CachePessoa();
            buscarPessoa.retornaPessoa(buscaId);
        }
    }
}

