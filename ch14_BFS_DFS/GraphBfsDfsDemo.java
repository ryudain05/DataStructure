package ch14_BFS_DFS;

public class GraphBfsDfsDemo {
    public static void main(String[] args) {
        int size = 7;
        AdjListBfsDfs LG2 = new AdjListBfsDfs(size);

//        LG2.insertEdge(0, 2);
//        LG2.insertEdge(0, 1);
//        LG2.insertEdge(1, 0);
//        LG2.insertEdge(1, 4);
//        LG2.insertEdge(1, 3);
//        LG2.insertEdge(2, 4);
//        LG2.insertEdge(2, 0);
//        LG2.insertEdge(3, 6);
//        LG2.insertEdge(3, 1);
//        LG2.insertEdge(4, 6);
//        LG2.insertEdge(4, 2);
//        LG2.insertEdge(4, 1);
//        LG2.insertEdge(5, 6);
//        LG2.insertEdge(6, 5);
//        LG2.insertEdge(6, 4);
//        LG2.insertEdge(6, 3);
//
//

        LG2. insertEdge(0,1);
        LG2. insertEdge(0,2);
        LG2. insertEdge (1,0);
        LG2. insertEdge (2,0) ;
        LG2. insertEdge (2,4);
        LG2. insertEdge (2,5);
        LG2. insertEdge (3,4);
        LG2. insertEdge(4,2);
        LG2. insertEdge (4,3);
        LG2. insertEdge(4,5);
        LG2. insertEdge (5,2);
        LG2. insertEdge (5,4);

        System.out.printf("In 그래프 LG2의 인접리스트 : ");
        LG2.printAdjList();
        System.out.println();
        System.out.printf("\n 너비우선탐색 (시작노드: 0) >> ");
        LG2.BFS(0);
        System.out.printf("\n 너비우선탐색 (시작노드: 2) >> ");
        LG2.BFS(2);
        System.out.printf("\n 너비우선탐색 (시작노드: 4) >> ");
        LG2.BFS(4);
    }
}
