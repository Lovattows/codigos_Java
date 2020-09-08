import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class Puzzle {
    int dimension = 3;
    int[] row = {1, 0, -1, 0};
    int[] col = {0, -1, 0, 1};

    public int calculateCost(int[][] init, int[][] res) {
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

    public void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isSafe(int x, int y) {
        return (x >= 0 && x < dimension && y >= 0 && y < dimension);
    }

    public void printPath(Node root) {
        if (root == null) {
            return;
        }
        printPath(root.getParent());
        printMatrix(root.matrix);
        System.out.println();
    }

    public void isSolvable(int[][] matrix) {
        int count = 0;
        List<Integer> array = new ArrayList<Integer>();

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix.length; j++) {
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

    public void solve(int[][] init, int[][] res, int x, int y) {
        PriorityQueue<Node> pq = new PriorityQueue<Node>(1000, (a, b) -> (a.cost + a.level) - (b.cost + b.level));
        Node root = new Node(init, x, y, x, y, 0, null);
        root.cost = calculateCost(init, res);
        pq.add(root);

        while (!pq.isEmpty()) {
            Node min = pq.poll();
            if (min.cost == 0) {
                printPath(min);
                return;
            }

            for (int i = 0; i < 4; i++) {
                if (isSafe(min.x + row[i], min.y + col[i])) {
                    Node child = new Node(min.matrix, min.x, min.y, min.x + row[i], min.y + col[i], min.level + 1, min);
                    child.cost = calculateCost(child.matrix, res);
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
        puzzle.isSolvable(init);
        puzzle.solve(init, res, x, y);
    }
}
