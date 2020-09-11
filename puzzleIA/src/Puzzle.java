import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Puzzle {
    int dimension = 3;
    int[] row = {1, 0, -1, 0};
    int[] col = {0, -1, 0, 1};

    public int calcularCusto(int[][] init, int[][] res) {
        int count = 0;
        int n = init.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (init[i][j] != 0 && init[i][j] != res[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printarMatriz(int[][] matriz) {
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public boolean ehSeguro(int x, int y) {
        return (x >= 0 && x < dimension && y >= 0 && y < dimension);
    }

    public void printrarCaminho(Node raiz) {
        if (raiz == null) {
            return;
        }
        printrarCaminho(raiz.getParent());
        printarMatriz(raiz.matrix);
        System.out.println();
    }

    public void ehSolucionavel(int[][] matriz) {
        int count = 0;
        List<Integer> array = new ArrayList<Integer>();

        for (int[] ints : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                array.add(ints[j]);
            }
        }
        Integer[] anotherArray = new Integer[array.size()];
        array.toArray(anotherArray);

        for (int i = 0; i < anotherArray.length - 1; i++) {
            for (int j = i + 1; j < anotherArray.length; j++) {
                if (anotherArray[i] != 0 && anotherArray[j] != 0 && anotherArray[i] > anotherArray[j]) {
                    count++;
                }
            }
        }
    }

    public void resultado(int[][] init, int[][] res, int x, int y) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>(1000, (a, b) -> (a.cost + a.level) - (b.cost + b.level));
        Node root = new Node(init, x, y, x, y, 0, null);
        root.cost = calcularCusto(init, res);
        pq.add(root);

        while (!pq.isEmpty()) {
            Node min = pq.poll();
            if (min.cost == 0) {
                printrarCaminho(min);
                return;
            }

            for (int i = 0; i < 4; i++) {
                if (ehSeguro(min.x + row[i], min.y + col[i])) {
                    Node child = new Node(min.matrix, min.x, min.y, min.x + row[i], min.y + col[i], min.level + 1, min);
                    child.cost = calcularCusto(child.matrix, res);
                    pq.add(child);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] init = {{1, 8, 2}, {0, 4, 3}, {7, 6, 5}};
        int[][] res = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};

        int x = 1, y = 0;

        Puzzle puzzle = new Puzzle();
        puzzle.ehSolucionavel(init);
        puzzle.resultado(init, res, x, y);
    }
}
