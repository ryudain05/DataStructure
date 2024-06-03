package ch12_Graph;

public class AdjList {
    private GraphNode[] head;
    private int totalV = 0;

    public AdjList(int n) {
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
                System.out.printf("-> %c", gNode.vertex + 65);
                gNode = gNode.link;
            }
        }
    }
}


