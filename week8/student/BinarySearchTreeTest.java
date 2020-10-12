import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testLeaf() {
        Integer[] values = {1};

        Node<Integer> expected = new Node<>();
        expected.value = 1;

        BinarySearchTree<Integer> binarySearchTree = BinarySearchTree.fromSortedArray(values);
        Node actual = binarySearchTree.root;
        assertEquals(expected, actual);
    }

    @Test
    public void testOdd() {
        Integer[] values = {1, 2, 3, 4, 5};

        Node<Integer> left = new Node<>(2, new Node(1), null);
        Node<Integer> right = new Node<>(4, new Node(5), null);
        Node<Integer> expected = new Node(3, left, right);

        BinarySearchTree<Integer> binarySearchTree = BinarySearchTree.fromSortedArray(values);
        Node actual = binarySearchTree.root;
        assertEquals(expected, actual);
    }

    @Test
    public void testEven() {
        Integer[] values = {1, 2, 3, 4, 5, 6};

        Node<Integer> left = new Node<>(2, new Node(1), null);
        Node<Integer> right = new Node<>(5, new Node(4), new Node(6));
        Node<Integer> expected = new Node(3, left, right);

        BinarySearchTree<Integer> binarySearchTree = BinarySearchTree.fromSortedArray(values);
        Node actual = binarySearchTree.root;
        assertEquals(expected, actual);
    }
}
