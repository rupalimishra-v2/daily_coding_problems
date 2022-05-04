package Easy;

public class MiddleOfLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int middleOfList(Node root) {
        if(root.next == null) return root.data;
        Node pointer1 = root;
        Node pointer2 = root;
        int mid = root.data;
        while(pointer2.next != null) {
            mid = pointer1.data;
            pointer1 = root.next;
            pointer2 = root.next.next;
        }
        return mid;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        a.next.next.next.next = new Node(5);
        a.next.next.next.next.next = new Node(6);
        MiddleOfLinkedList object = new MiddleOfLinkedList();
        System.out.println(object.middleOfList(a));
    }
}
