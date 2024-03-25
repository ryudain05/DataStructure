package ch4_LinkedList;

public class ListNode {
    private String data;
    ListNode link;

    public ListNode() {
        this.data = null;
        this.link = null;
    }

    public ListNode(String data) {
        this.data = data;
        this.link = null;
    }

    public ListNode(String data, ListNode link) {
        this.data = data;
        this.link = link;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ListNode getLink() {
        return this.link;
    }

    public void setLink(ListNode link) {
        this.link = link;
    }
}
