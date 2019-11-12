
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {
        Professor p = new Professor("Zamber", 123456);

        System.out.println(p);
        HashSet<Professor> listaProfessores = new HashSet<>();

        System.out.println("LISTA DESORDENADA");
        listaProfessores.add(new Professor("Alexandre", 100));
        listaProfessores.add(new Professor("Ana Paula", 95));
        listaProfessores.add(new Professor("Alessandro", 120));
        listaProfessores.add(new Professor("Alexandre", 100));
        listaProfessores.add(new Professor("Silvio", 132));
        listaProfessores.add(new Professor("Guilherme", 102));
        //System.out.println(listaProfessores);

        LinkedList<Professor> lista = new LinkedList<>();
        lista.addAll(listaProfessores);
        Collections.sort(lista);
        System.out.println(lista);
        
        /*
        for (Iterator<Professor> iterator = listaProfessores.iterator(); iterator.hasNext();) {
            Professor professor = iterator.next();
            System.out.println(professor);
        }
         */
        //System.out.println("LISTA ORDENADA");
        //Collections.sort(listaProfessores);
        //System.out.println(listaProfessores);
    }
}
