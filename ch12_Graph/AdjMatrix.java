package ch12_Graph;

public class AdjMatrix {
    private int[][] matrix;
    private int totalV = 0;

    public AdjMatrix(int n) {
        this.matrix = new int[n][n];
        this.totalV = n;
    }

    public void insertEdge(int v1, int v2) {
        if (v1 >= totalV || v2 >= totalV) {
            System.out.println("그래프에 없는 정점입니다!!");
        } else {
            matrix[v1][v2] = 1;
        }
    }

    public void printMatrix() {
        for (int i = 0; i < totalV; i++) {
            System.out.printf("\n\t");
            for (int j = 0; j < totalV; j++) {
                System.out.printf(" %2d", matrix[i][j]);
            }
        }
    }
}
