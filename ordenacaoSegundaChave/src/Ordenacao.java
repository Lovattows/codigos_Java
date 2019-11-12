
import java.util.ArrayList;

public class Ordenacao {

    public static void bolha(ArrayList<Aluno> lista) {
        Aluno aux;
        boolean houveTroca;
        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).matricula > lista.get(i + 1).matricula) {
                    aux = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, aux);
                    houveTroca = true;
                }
            }
        } while (houveTroca);

        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).matricula == lista.get(i + 1).matricula && lista.get(i).ano > lista.get(i + 1).ano) {
                    aux = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, aux);
                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }

    public static void selecao(ArrayList<Aluno> lista) {
        int i, j, posMenor;
        Aluno aux;

        for (i = 0; i < lista.size() - 1; i++) {
            posMenor = i;
            for (j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).matricula < lista.get(posMenor).matricula) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                aux = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, aux);
            }
        }
        for (i = 0; i < lista.size() - 1; i++) {
            posMenor = i;
            for (j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).matricula == lista.get(i + 1).matricula && lista.get(j).ano < lista.get(posMenor).ano) {
                    posMenor = j;
                }
            }
            if (i != posMenor) {
                aux = lista.get(i);
                lista.set(i, lista.get(posMenor));
                lista.set(posMenor, aux);
            }
        }
    }

    public static void insercao(ArrayList<Aluno> lista) {
        int i, j;
        Aluno aux; //para as trocas

        for (i = 1; i < lista.size(); i++) {
            aux = lista.get(i);

            for (j = i - 1; j >= 0 && aux.ano < lista.get(j).ano; j--) {
                lista.set(j + 1, lista.get(j));
            }
            lista.set(j + 1, aux);
        }
        for (i = 1; i < lista.size(); i++) {
            aux = lista.get(i);

            for (j = i - 1; j >= 0 && aux.matricula < lista.get(j).matricula; j--) {
                lista.set(j + 1, lista.get(j));
            }
            lista.set(j + 1, aux);
        }
    }
}
