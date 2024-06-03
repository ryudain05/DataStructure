package ch12_Graph;

public class GraphDemo {
    public static void main(String[] args) {
        int size = 4;

        AdjMatrix MG1 = new AdjMatrix(size);

        MG1.insertEdge(0, 1);
        MG1.insertEdge(0, 2);
        MG1.insertEdge(1, 3);
        MG1.insertEdge(1, 2);
        MG1.insertEdge(1, 0);
        MG1.insertEdge(2, 3);
        MG1.insertEdge(2, 1);
        MG1.insertEdge(3, 2);
        MG1.insertEdge(3, 1);
        MG1.insertEdge(3, 0);
        System.out.println("\n 그래프 MG1의 인접 행렬 : ");
        MG1.printMatrix();
        System.out.println();

        //인접 리스트로 구현한 그래프 실습
        AdjList LG1 = new AdjList(size);
        LG1.insertEdge(0, 3);
        LG1.insertEdge(0, 1);
        LG1.insertEdge(1, 3);
        LG1.insertEdge(1, 2);
        LG1.insertEdge(1, 0);
        LG1.insertEdge(2, 3);
        LG1.insertEdge(2, 1);
        LG1.insertEdge(3, 2);
        LG1.insertEdge(3, 1);
        LG1.insertEdge(3, 0);
        System.out.printf("\n 그래프 LG1의 인접 리스트 : ");
        LG1.printAdjList();
        System.out.println();
        System.out.println();

        //-------------------------------------------------------------------------------------------//

        size = 7;
        AdjMatrix MG2 = new AdjMatrix(size);

        MG2.insertEdge(0, 1);
        MG2.insertEdge(0, 2);
        MG2.insertEdge(1, 0);
        MG2.insertEdge(1, 3);
        MG2.insertEdge(1, 4);
        MG2.insertEdge(2, 0);
        MG2.insertEdge(2, 4);
        MG2.insertEdge(3, 1);
        MG2.insertEdge(3, 6);
        MG2.insertEdge(4, 1);
        MG2.insertEdge(4, 2);
        MG2.insertEdge(4, 6);
        MG2.insertEdge(5, 6);
        MG2.insertEdge(6, 3);
        MG2.insertEdge(6, 4);
        MG2.insertEdge(6, 5);
        System.out.println("\n 그래프 MG2의 인접 행렬 : ");
        MG2.printMatrix();
        System.out.println();
        System.out.println();

        //인접 리스트로 구현한 그래프 실습
        AdjList LG2 = new AdjList(size);
        LG2.insertEdge(0, 1);
        LG2.insertEdge(0, 2);
        LG2.insertEdge(1, 0);
        LG2.insertEdge(1, 3);
        LG2.insertEdge(1, 4);
        LG2.insertEdge(2, 0);
        LG2.insertEdge(2, 4);
        LG2.insertEdge(3, 1);
        LG2.insertEdge(3, 6);
        LG2.insertEdge(4, 1);
        LG2.insertEdge(4, 2);
        LG2.insertEdge(4, 6);
        LG2.insertEdge(5, 6);
        LG2.insertEdge(6, 3);
        LG2.insertEdge(6, 4);
        LG2.insertEdge(6, 5);
        System.out.printf("\n 그래프 LG2의 인접 리스트 : ");
        LG2.printAdjList();


    }
}
