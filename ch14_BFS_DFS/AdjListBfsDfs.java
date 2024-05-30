package ch14_BFS_DFS;

import ch13_Graph.GraphNode;
import ch5_CirucularDoublyLinkedList.LinkedStack;
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
            gNode = head[i];
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

    //DFS 순회 함수
    public void DFS(int v) {
        GraphNode w = new GraphNode();
        LinkedStack<Integer> S = new LinkedStack<>();
        boolean visited[] = new boolean[10];

        S.push(v);
        visited[v] = true;
        System.out.printf(" %c", v + 65);
        while (!S.isEmpty()) {
            w = head[v];
            while (w != null) { //v의 모든 인접 노드 w에 대해 방문 가능성을 고려함
                if (visited[w.vertex] == false) { //w가 미방문 노드면 방문함
                    S.push(v);
                    visited[w.vertex] = true;
                    System.out.printf(" %c", w.vertex + 65);
                    v = w.vertex;
                    w = head[v];
                } else //W가 방문 노드이면 다른 인접 노드를 고려함
                {
                    w = w.link;
                }
            }
            v = S.pop(); //더 이상 방문을 고려할 인접 노드 W가 없으면 되돌아감
        }
    }
}
