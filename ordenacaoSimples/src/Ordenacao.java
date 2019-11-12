
public class Ordenacao {

    public int[] bolha(int[] valores, int tam) {
        int i, j;
        int[] valores_bolha;
        valores_bolha = valores;
        int auxBolha;
        int tamBolha = valores_bolha.length;
        for (i = 0; i < tamBolha - 1; i++) {
            for (j = 0; j < tamBolha - 1 - i; j++) {
                if (valores_bolha[j] > valores_bolha[j + 1]) {
                    auxBolha = valores_bolha[j];
                    valores_bolha[j] = valores_bolha[j + 1];
                    valores_bolha[j + 1] = auxBolha;
                }
            }
        }
        return valores_bolha;
    }

    public int[] insercao(int[] valores, int tam) {
        int i, j;
        int[] valores_insercao;
        valores_insercao = valores;
        int auxInsercao;
        int tamInsercao = valores_insercao.length;
        for (j = 1; j < tamInsercao; j++) {
            auxInsercao = valores_insercao[j];
            for (i = j - 1; (i >= 0) && (valores_insercao[i] > auxInsercao); i--) {
                valores_insercao[i + 1] = valores_insercao[i];
            }
            valores_insercao[i + 1] = auxInsercao;
        }
        return valores_insercao;
    }

    public int[] selecao(int[] valores, int tam) {
        int i, j;
        int[] valores_selecao;
        valores_selecao = valores;
        int auxSelecao;
        int tamSelecao = valores_selecao.length;
        int temp;
        for (i = 0; i < tamSelecao - 1; i++) {
            auxSelecao = i;
            for (j = auxSelecao + 1; j < tamSelecao; j++) {
                if (valores_selecao[j] < valores_selecao[i]) {
                    auxSelecao = j;
                }
            }
            if (auxSelecao != i) {
                temp = valores_selecao[i];
                valores_selecao[i] = valores_selecao[auxSelecao];
                valores_selecao[auxSelecao] = temp;
            }
        }
        return valores_selecao;
    }
}
