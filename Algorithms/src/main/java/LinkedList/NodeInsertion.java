package LinkedList;

public class NodeInsertion {
    static class Node {
        int data;
        Node next;
        Node(int data) {
           this.data = data;
           this.next = null;
        }
    }

    public Node insertAtStart(Node list, Node toBeInserted) {
        toBeInserted.next = list;
        list = toBeInserted;
        return list;
    }

    public void insertInMiddle(Node list,Node prev, Node toBeInserted) {
        toBeInserted.next = prev.next;
        prev.next = toBeInserted;
        printList(list);
    }

    public Node insertAtEnd(Node list, Node toBeInserted) {
        while(list.next != null) {
            list = list.next;
        }
        list.next = toBeInserted;
        return list;
    }

    public void printList(Node head) {
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node list = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        list.next = first;
        first.next = second;
        second.next = null;

        Node toBeInserted = new Node(4);

        NodeInsertion nodeInsertion = new NodeInsertion();
        System.out.println("Inserting node at starting...");
        nodeInsertion.printList(nodeInsertion.insertAtStart(list, toBeInserted));
        System.out.println("Inserting node in middle...");
        nodeInsertion.insertInMiddle(list, first, toBeInserted);
        System.out.println("Inserting node in the end...");
        nodeInsertion.printList(nodeInsertion.insertAtStart(list, toBeInserted));
    }
}
