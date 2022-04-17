package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTreeTest {

    @Test
    void testSumOfTree() {
        SumOfTree st = new SumOfTree();
        SumOfTree.Node root = new SumOfTree.Node(1);
        root.left = new SumOfTree.Node(2);
        root.right = new SumOfTree.Node(3);
        root.left.left = new SumOfTree.Node(4);
        root.left.right = new SumOfTree.Node(5);
        root.right.left = new SumOfTree.Node(6);
        root.right.right = new SumOfTree.Node(7);
        assertEquals(28, st.sum(root));
    }

    @Test
    void testSumOfTree2() {
        SumOfTree st = new SumOfTree();
        SumOfTree.Node root = new SumOfTree.Node(1);
        assertEquals(1, st.sum(root));
    }

    @Test
    void testSumOfTree3() {
        SumOfTree st = new SumOfTree();
        SumOfTree.Node root = new SumOfTree.Node(1);
        root.left = new SumOfTree.Node(2);
        root.right = new SumOfTree.Node(3);
        assertEquals(6, st.sum(root));
    }

    @Test
    void testSumOfTree4() {
        SumOfTree st = new SumOfTree();
        SumOfTree.Node root = new SumOfTree.Node(12);
        root.left = new SumOfTree.Node(-12);
        assertEquals(0, st.sum(root));
    }

}