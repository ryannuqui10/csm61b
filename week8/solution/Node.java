public class Node<T> {
    public T value;
    public Node left;
    public Node right;

    public Node() {
        return;
    }

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Node)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean equalHelper(Node node1, Node node2){
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else {
            return node1.value.equals(node2.value)
                    && equalHelper(node1.left, node2.left)
                    && equalHelper(node2.right, node2.right);
        }
    }

}
