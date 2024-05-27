package ch14_BFS_DFS;

import ch13_Graph.GraphNode;
import ch7_LikedQueue.LinkedQueue;

public class AdjListBfsDfs {

    private GraphNode[] head;
    private int totalV = 0;


    public AdjListBfsDfs(int n) {
        this.head = new GraphNode[n];
        this.totalV = n;
    }

    public void insertEdge(int v1, int v2) {
        if (v1 >= totalV || v2 >= totalV) {
            System.out.println("그래프에 없는 정점입니다!!");
        } else {
            GraphNode gNode = new GraphNode();
            gNode.vertex = v2;
            gNode.link = head[v1];
            head[v1] = gNode;
        }
    }

    public void printAdjList() {
        GraphNode gNode = new GraphNode();
        for (int i = 0; i < totalV; i++) {
            System.out.printf("\n\t 정점%c의 인접리스트 ", i + 65);
            gNode = head[1];
            while (gNode != null) {
                System.out.printf("=> %c", gNode.vertex + 65);
                gNode = gNode.link;
            }
        }
    }

    // BFS 순회 함수
    public void BFS(int v) {
        GraphNode w = new GraphNode();
        LinkedQueue<Integer> Q = new LinkedQueue<>();
        boolean visited[] = new boolean[totalV];
        for (int i = 0; i < totalV; i++) {
            visited[i] = false;
        }

        visited[v] = true;
        System.out.printf(" %c", v + 65);
        Q.enqueue(v);
        while (!Q.isEmpty()) {
            v = Q.dequeue();
            for (w = head[v]; w != null; w = w.link) {
                if (visited[w.vertex] == false) {
                    visited[w.vertex] = true;
                    System.out.printf(" %c", w.vertex + 65);
                    Q.enqueue(w.vertex);
                }
            }
        }
    }

}
