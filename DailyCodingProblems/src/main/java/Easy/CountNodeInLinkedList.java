package Easy;

public class CountNodeInLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public int countNodes(Node head){
       int counter = 1;
       while(head != null) {
           head = head.next;
           counter++;
       }
       return counter;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        System.out.println(new CountNodeInLinkedList().countNodes(node1));
    }
}
