public class BinarySearchTree <T extends Comparable<T>> {

    protected Node root;

    /*
        Note: Passing in an int[] will not work in this case because we are working with generics
        For the following functions to compile and execute as expected, values must be an Integer[]
        so it is a valid object.
     */
    public static BinarySearchTree<Integer> fromSortedArray(Integer[] values) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.root = bst.fromSortedArray(values, 0, values.length - 1); // setting a new root
        return bst;
    }

    private Node fromSortedArray(T[] values, int lower, int upper) {
        if (lower > upper) {
            return null;
        }
        int middle = lower + ((upper - lower) / 2); // middle index of the array
        Node mid = new Node();
        mid.value = values[middle];
        mid.left = fromSortedArray(values, lower, middle - 1);
        mid.right = fromSortedArray(values, middle + 1, upper);
        return mid;
    }

}
