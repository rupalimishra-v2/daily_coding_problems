package Searching;

public class SublistSearch {
   static class Node {
        int data;
        Node next;
        Node(int data) {
           this.data = data;
        }

    }
    public boolean subLinkedListSearch(Node a, Node b) {
       return false;
    }

    public boolean subLinearListSearch(int[] list1, int[] list2) {
       //check if list1 is contained in list2
        int l1Length = list1.length;
        int l2Length = list2.length;
        if(l2Length < l1Length) return false;
        //{1,2,3,4,5,6} and {3,4,5,1,2,3,4,5,6,7,8,9}
        return false;
    }

    public static void main(String[] args) {
        SublistSearch object = new SublistSearch();
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);

        Node b = new Node(1);
        b.next = new Node(2);
        b.next.next = new Node(1);
        b.next.next.next = new Node(2);
        b.next.next.next.next = new Node(3);
        b.next.next.next.next.next = new Node(4);
        System.out.println(object.subLinkedListSearch(a, b));
    }
}
