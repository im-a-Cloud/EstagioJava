package candidatura.questao9;

public class Pessoa implements Comparable<Pessoa> {
    int idade;
    int id;
    String nome;
    static int varId = 1;
    Pessoa(int idade, String nome){
        this.idade = idade;
        this.id = Pessoa.varId;
        this.nome = nome;
        Pessoa.varId++;
    }
    Pessoa(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }


    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Pessoa pessoa){
        return this.getNome().compareTo(pessoa.getNome());
    }

}
