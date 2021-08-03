package Easy;

public class HeightOfTree {
    private class Node {
        int data;
        Node left, right;
        Node(int key) {
            data = key;
            left = right = null;
        }
    }

    public Node createTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        return root;
    }

    public int findMax(int a, int b){
        return Math.max(a, b);
    }
//    public int heightOfTree(Node root) {
//        if(root == null) return 0;
//        return findMax(heightOfTree(root.left), heightOfTree(root.right));
//    }

    public int heightOfTree(Node root) {

        if (root == null)
            return 0;
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1 ;
    }

    public static void main(String[] args) {
        Node input = new HeightOfTree().createTree();
        System.out.println(new HeightOfTree().heightOfTree(input));
    }

}
