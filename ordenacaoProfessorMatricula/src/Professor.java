
import java.util.Objects;

public class Professor implements Comparable<Professor> {

    String nome;
    int matricula;

    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Professor) {
            Professor p = (Professor) o;
            return this.matricula == p.matricula && this.nome.equals(p.nome);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ("" + this.matricula + this.nome).hashCode();
    }

    @Override
    public int compareTo(Professor p) {

        if (this.matricula < p.matricula) {
            return -1;
        }
        return 1;
    }

    /*
    @Override
    public int compareTo(Professor p) {
        return this.nome.compareToIgnoreCase(p.nome);
    }
     */
    @Override
    public String toString() {
        return "" + this.nome + " - " + this.matricula;
    }

}
