package ch4_LinkedList;

public class ListMain {
    public static void main(String[] args) {
        //방법1 - 노드를 먼저 생성 후 연결 리스트를 구성함
        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();
        ListNode n3 = new ListNode();

        n1.setData("희진1");
        n1.setLink(n2);
        n2.setData("삼식1");
        n2.setLink(n3);
        n3.setData("삼순1");
        n3.setLink(null);

        ListNode temp = n1;
        System.out.printf("First L = (");
        while (temp != null) {
            System.out.printf(temp.getData());
            temp = temp.link;
            if (temp != null) {
                System.out.printf(", ");
            }
        }
        System.out.println(")");
        System.out.println("");

        //방법2 - 연결 리스트에 연결하면서 노드를 생성함
        ListNode node3 = new ListNode("삼순2");
        ListNode node2 = new ListNode("삼식2", node3);
        ListNode node1 = new ListNode("희진2", node2);

//		ListNode temp = node1;
        temp = node1;
        System.out.printf("Second L = (");
        while (temp != null) {
            System.out.printf(temp.getData());
            temp = temp.link;
            if (temp != null) {
                System.out.printf(", ");
            }
        }
        System.out.println(")");
        System.out.println("");

        //방법3 - 연결리스트 헤더 주소만 유지함
        ListNode list = new ListNode("삼순3");
        list = new ListNode("삼식3", list);
        list = new ListNode("희진3", list);

//		ListNode temp = list;
        temp = list;
        System.out.printf("Third L = (");
        while (temp != null) {
            System.out.printf(temp.getData());
            temp = temp.link;
            if (temp != null) {
                System.out.printf(", ");
            }
        }
        System.out.println(")");
        System.out.println();

//
//   L = (빨강, 주황, 노랑, 초록, 파랑, 남색, 보라)를 연결리스트로 만들고 출력하기
//


        ListNode nodelist = new ListNode("빨강");
        nodelist = new ListNode("주황", nodelist);
        nodelist = new ListNode("노랑", nodelist);
        nodelist = new ListNode("초록", nodelist);
        nodelist = new ListNode("파랑", nodelist);
        nodelist = new ListNode("남색", nodelist);
        nodelist = new ListNode("보라", nodelist);

        temp = nodelist;

        System.out.printf("Color L : (");
        while (temp != null) {
            System.out.printf(temp.getData());
            temp = temp.link;
            if(temp!=null) {
                System.out.printf(", ");
            }
        }
        System.out.println(")");
    }
}
