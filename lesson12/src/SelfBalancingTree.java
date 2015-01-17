public class SelfBalancingTree {
    Node root;

    public static void printTree(Node root) {
        System.out.println(root);

    }

    public String add(int key, String value) {
        Node addNode = new Node(key, value);
        if (root == null) {
            root = addNode;
        } else {
            Node parent = getParent(addNode, root);
            if (parent.getKey() > key) {
                parent.setLeft(addNode);
            } else {
                parent.setRight(addNode);
            }
        }

        return null;
    }

    private Node getParent(Node node, Node root) {
        if (root.getLeft() == null & root.getRight() == null) {
            return root;
        }
        if (root.getRight() == null) {
            return getParent(node, root.getLeft());
        }
        if (root.getLeft() == null) {
            return getParent(node, root.getRight());
        }
        if (root.getKey() > node.getKey()) {
            return getParent(node, root.getLeft());
        }
        if (root.getKey() < node.getKey()) {
            return getParent(node, root.getRight());
        }
        return null;

    }

    public String remove(String key) {
        return null;
    }

    public String find(int key) {
        return null;
    }


    private class Node {
        private int key;
        private String value;
        private Node left, right;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
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
    }
}
