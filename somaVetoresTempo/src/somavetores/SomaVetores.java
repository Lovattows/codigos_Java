package somavetores;

import java.util.Random;
import java.util.Scanner;

public class SomaVetores {

    long tempoInicial = System.nanoTime();
    int[] vetA, vetB;
    int tamanho;

    public int[] somaVetores(int[] a, int[] b) {
        int[] res = new int[a.length];
        for (int x = 0; x < a.length; x++) {
            res[x] = a[x] + b[x];
        }

        return res;
    }

    public String imprimeVetor(int[] vetor) {
        String retorno = "";
        for (int x = 0; x < vetor.length; x++) {
            retorno = retorno + " "
                    + String.valueOf(vetor[x]);
        }
        return retorno;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o tamanho dos Vetores: ");
        SomaVetores sv = new SomaVetores();
        sv.tamanho = teclado.nextInt();
        sv.vetA = new int[sv.tamanho];
        sv.vetB = new int[sv.tamanho];
        Random random = new Random();
        for (int x = 0; x < sv.tamanho; x++) {
            sv.vetA[x] = random.nextInt(25);
            sv.vetB[x] = random.nextInt(25);
        }
        System.out.println("vetA: " + sv.imprimeVetor(sv.vetA)
                + "\nVetB: " + sv.imprimeVetor(sv.vetB)
                + "\nA + B: " + sv.imprimeVetor(sv.somaVetores(sv.vetA, sv.vetB)));
        long tempoFinal = System.nanoTime();
        long resultado = (tempoFinal - sv.tempoInicial) / 1000000;
        System.out.println(resultado + " ms");
    }
}
