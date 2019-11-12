package principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList();
        int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números?"));

        Ordenacao.popularLista(lista, qtd);
        //Ordenacao.bolha(lista);
        Ordenacao.insercao(lista);
       // Ordenacao.selecao(lista);
        Ordenacao.exibirLista(lista);

        System.exit(0);
    }

}
