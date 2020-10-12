public class BinaryTree<T> {

    protected Node root;
    protected class Node {
        public T value;
        public Node left;
        public Node right;
    }

    /*
        Procedure that returns the height of a BinaryTree
        Runtime: Θ(N)
        @param node The node of a tree to calculate the height of
        @return height The height of the given tree
     */

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    /*
        Procedure that returns whether the BinaryTree is balanced
        Runtime: Θ(N) in the best case, Θ(NlogN) in the worst case.  This can also be read as Ω(N), O(NlogN) overall
        @param node The node of a tree
        @return boolean Whether the tree is balanced or not
     */

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        } else if (Math.abs(height(node.left) - height(node.right)) <= 1) {
            return isBalanced(node.left) && isBalanced(node.right);
        }
        return false;
    }
}
