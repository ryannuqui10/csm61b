import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void testHeightLeaf()  {
        /** Test:
         * 61
         */

        Node<Integer> root = new Node<>(61);

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.root = root;

        int expected = 0;
        int actual = binaryTree.height();
        assertEquals(expected, actual);
    }

    @Test
    public void testHeightOneChild() {
        /** Test:
                 61
                /
               70
         */

        Node<Integer> root = new Node<>();
        Node<Integer> child = new Node<>();

        root.value = 61;
        child.value = 70;

        root.left = child;


        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.root = root;

        int expected = 1;
        int actual = binaryTree.height();
        assertEquals(expected, actual);

        /** Test:
                 61
                    \
                    70
         */

        root.right = root.left;
        root.left = null;

        expected = 1;
        actual = binaryTree.height();
        assertEquals(expected, actual);
    }

    @Test
    public void testHeightComplete() {
        /** Test:
                            61
                        /         |
                       70         88
                     /   |      /   |
                   161   162   168  169
         */

        //Grandchildren
        Node<Integer> grandChild1 = new Node<>(161);
        Node<Integer> grandChild2 = new Node<>(162);
        Node<Integer> grandChild3 = new Node<>(168);
        Node<Integer> grandChild4 = new Node<>(169);

        //Children
        Node<Integer> leftChild = new Node<>(70, grandChild1, grandChild2);
        Node<Integer> rightChild = new Node<>(88, grandChild3, grandChild4);

        //Root
        Node<Integer> root = new Node<>(61, leftChild, rightChild);

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.root = root;

        int expected = 2;
        int actual = binaryTree.height();
        assertEquals(expected, actual);
    }
}
