
public class Aluno {

    int matricula;
    String nome;
    int ano;

    public Aluno(int matricula, String nome, int ano) {
        this.matricula = matricula;
        this.nome = nome;
        this.ano = ano;
    }

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return this.matricula + " - " + this.nome + " - " + this.ano;
    }

}
