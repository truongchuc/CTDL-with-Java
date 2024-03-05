package DoThi;

import java.util.Iterator;

public class DoThi {
    static int[] vs;
    static int[] q;
    static int[][] matrix;

    public static void add_edge(int i, int j) {
        // Thêm cạnh từ đỉnh i đến đỉnh j bằng cách gán matrix[i][j] = 1
        matrix[i][j] = 1;
    }

    public static void init() {
        // Khởi tạo các mảng và ma trận kề
        for (int i = 0; i < 10; i++) {
            vs[i] = 0;
            q[i] = 0;
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public static void sau(int i) {
        // In ra các đỉnh kề với đỉnh i
        for (int j = 1; j < 9; j++) {
            if (matrix[i][j] == 1) {
                System.out.println(j + "-->");
            }
        }
    }

    public static void hthi() {
        // In ma trận kề
        System.out.println("Ma trận kề:");
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rong(int dinh) {
        // Xử lý rong (BFS) từ đỉnh dinh
        int x, i, j, s;
        vs[dinh] = 1;
        i = 1;
        q[i] = dinh;
        s = 1;
        while (s >= i) {
            dinh = q[i];
            i++;
            for (j = 1; j < 9; j++) {
                if ((matrix[dinh][j] == 1) && (vs[j] == 0)) {
                    System.out.println(j + " -->");
                    s++;
                    q[s] = j;
                    vs[j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        matrix = new int[10][10];
        vs = new int[10];
        q = new int[10];

        init();
        add_edge(1, 2);
        add_edge(1, 6);
        add_edge(2, 3);
        add_edge(2, 4);
        add_edge(2, 6);
        add_edge(2, 8);
        add_edge(6, 7);
        add_edge(7, 5);
        add_edge(7, 8);

        hthi();
        sau(1);

        // Reset vs
        for (int i = 1; i < 9; i++) {
            vs[i] = 0;
        }
    }
}
