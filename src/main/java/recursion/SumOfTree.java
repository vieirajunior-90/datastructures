package recursion;

public class SumOfTree {

    public int sum(Node root){
        if (root == null) {
            return 0;
        }

        return root.getData() + sum(root.getLeft()) + sum(root.getRight());
    }
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(){

        }

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "" + getData();
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(4);
        Node n3 = new Node(6);
        Node n4 = new Node(7);
        Node n5 = new Node(9);
        Node n6 = new Node(1);

        // Set children
        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);


        // Composition of tree
        System.out.println("\n========== T R E E ==========\n");

        System.out.println("\t\t\t " + n1);
        System.out.println("\t\t   " + "/" + "  \t\\");
        System.out.println("\t\t " + n2 + "\t\t  " + n3);
        System.out.println("\t   " + "/" + "   \\" + "\t" + "/" );
        System.out.println("\t  " + n4 + "\t\t" + n5 + "  " + n6 + "\n");


        // Calling the method sum
        SumOfTree st = new SumOfTree();
        System.out.println("TREE SUM STARTING AT NODE N1(10): " + st.sum(n1));
    }
}

