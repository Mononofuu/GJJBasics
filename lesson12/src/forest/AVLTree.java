package forest;

import java.util.LinkedList;
import java.util.List;

public class AVLTree implements Treeish {
    Node root;

    public void scan() {
        if (root != null) {
            root.scan();
            root.scan();
        }
    }

    /**
     * Adds new Integer to the tree.
     *
     * @param value new value to add. Can be null.
     */
    @Override
    public void add(Integer value) {
        if (value != null) {
            Node parent = root;
            if (parent == null) {
                root = new Node(value);
                return;
            }
            while (true) {
                if (parent.getValue() > value) {
                    if (parent.getLeft() == null) {
                        parent.setLeft(new Node(value));
                        parent.getLeft().setParent(parent);
                        break;
                    } else {
                        parent = (Node) parent.getLeft();
                    }


                } else {
                    if (parent.getRight() == null) {
                        parent.setRight(new Node(value));
                        parent.getRight().setParent(parent);
                        break;
                    } else {
                        parent = (Node) parent.getRight();

                    }
                }
            }
            updateAllHeights();
            scan();
        }
    }

    /**
     * Removes specific Integer from the tree.
     *
     * @param value to delete. Can be null.
     */
    @Override
    public void remove(Integer value) {
        ValueContainer toDel = findValue(value, getTop());
        if (toDel == null) {
            return;
        }
        ValueContainer newNode = findMin(toDel);

        if (newNode == toDel & toDel == root) {
            if (toDel.getLeft() == null && toDel.getRight() == null) {
                root = null;
            } else {
                root = toDel.getRight() == null ? null : (Node) toDel.getRight();
                if (root!=null){
                    root.setParent(null);
                }
                toDel.setRight(null);
            }
        } else if (newNode == toDel & toDel != root) {
            if (toDel.isLeft()) {
                if (toDel.getRight() == null) {
                    toDel.getParent().setLeft(null);
                } else {
                    toDel.getParent().setLeft(toDel.getRight());
                    toDel.getParent().getLeft().setParent(toDel.getParent());
                }
                toDel.setParent(null);
                toDel.setRight(null);
            } else {
                toDel.getParent().setRight(toDel.getRight() == null ? null : toDel.getRight());
                if (toDel.getParent().getRight() != null) {
                    toDel.getParent().getRight().setParent(toDel.getParent());
                }
                toDel.setParent(null);
                toDel.setRight(null);
            }
        } else if (toDel == root) {
            root = (Node) toDel.getLeft();
            root.setRight(toDel.getRight());
            toDel.getRight().setParent(root);
            root.setParent(null);
            toDel.setLeft(null);
            toDel.setRight(null);
        } else {
            if (toDel.isLeft()) {
                toDel.getParent().setLeft(newNode);
                newNode.setParent(toDel.getParent());
            } else {
                toDel.getParent().setRight(newNode);
                newNode.setParent(toDel.getParent());
            }
        }
        updateAllHeights();
        scan();
        updateAllHeights();
    }


    /**
     * @param value to check.
     * @return true if tree has given value, false otherwise.
     */
    @Override
    public boolean contains(Integer value) {
        ValueContainer findedNode = findValue(value, root);

        return findedNode != null && value == findedNode.getValue();
    }

    /**
     * @return top vertex of the tree
     */
    @Override
    public ValueContainer getTop() {
        return root;
    }

    /**
     * @return tree as a sorted list of ValueContainers
     */
    @Override
    public List<ValueContainer> asList() {
        if (root != null) {
            return getTop().asList();
        } else {
            return new LinkedList<>();
        }
    }

    /**
     * recursively updates all heights of vertices to their actual heights
     */
    @Override
    public void updateAllHeights() {
        if (this.root != null) {
            getTop().updateHeights();
        }
    }

    public ValueContainer findValue(Integer value, ValueContainer node) {
        if (node == null) {
            return null;
        }
        if (node.getValue() == value) {
            return node;
        } else if (root.getValue() > value) {
            return findValue(value, node.getLeft());
        } else if (root.getValue() < value) {
            return findValue(value, node.getRight());
        }
        return null;
    }

    public ValueContainer findMin(ValueContainer node) {
        if (node.getLeft() != null) {
            return findMin(node.getLeft());
        } else return node;
    }


    class Node implements ValueContainer {
        Integer value;
        int height;
        Node parent, left, right;


        public Node(int value) {
            this.value = value;
            height = 1;
            parent = left = right = null;
        }

        @Override
        public Integer getValue() {
            return value;
        }

        @Override
        public void setValue(Integer value) {
            this.value = value;
        }

        @Override
        public ValueContainer getParent() {
            return parent;
        }

        @Override
        public void setParent(ValueContainer parent) {
            this.parent = (Node) parent;
        }

        @Override
        public ValueContainer getLeft() {
            return left;
        }

        @Override
        public ValueContainer getRight() {
            return right;
        }

        @Override
        public void setRight(ValueContainer container) {
            this.right = (Node) container;
        }


        /**
         * @return height of this vertex,
         * that is max of heights of left and right subtrees + 1
         */
        @Override
        public int getHeight() {
            if (left == right) {
                return 1;
            }
            if (left == null) {
                return right.getHeight() + 1;
            }
            if (right == null) {
                return left.getHeight() + 1;
            }
            return Math.max(left.getHeight(), right.getHeight()) + 1;
        }


        @Override
        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int getLeftHeight() {
            return left == null ? 0 : left.height;
        }

        @Override
        public void setLeftHeight(int leftHeight) {
            left.setHeight(leftHeight);
        }

        @Override
        public int getRightHeight() {
            return right == null ? 0 : right.height;
        }

        @Override
        public void setRightHeight(int rightHeight) {
            right.setHeight(rightHeight);
        }

        /**
         * recursively updates all heights in both subtrees and height of this vertex.
         */
        @Override
        public void updateHeights() {
            if (getLeft() != null) {
                left.updateHeights();
            }
            this.setHeight(getHeight());
            if (getRight() != null) {
                right.updateHeights();
            }
        }

        public void scan() {
            if ((getLeftHeight() - getRightHeight()) > 1) {
                if ((this.getLeft().getLeftHeight() - this.getLeft().getRightHeight()) > 1) {
                    rotateRight(this);
                    updateHeights();
                } else if ((this.getLeft().getLeftHeight() - this.getLeft().getRightHeight()) == -1) {
                    rotateLeft((Node) this.getLeft());
                    rotateRight(this);
                    updateHeights();
                } else {
                    rotateRight(this);
                    updateHeights();
                }
                updateHeights();
            } else if ((getLeftHeight() - getRightHeight()) < -1) {
                if ((this.getRight().getRightHeight() - this.getRight().getLeftHeight()) > 1) {
                    rotateLeft(this);
                    updateHeights();
                } else if ((this.getRight().getRightHeight() - this.getRight().getLeftHeight()) == -1) {
                    rotateRight((Node) this.getRight());
                    rotateLeft(this);
                    updateHeights();
                } else {
                    rotateLeft(this);
                    updateHeights();
                }
                updateHeights();
            }
            updateHeights();
            if (getLeft() != null) {
                left.scan();
            }

            if (getRight() != null) {
                right.scan();
            }
        }


        public void rotateLeft(Node A) {
            Node B = (Node) A.getRight();
            if (A == root) {
                root = B;
                B.setParent(null);
            } else {
                if (A.isLeft()) {
                    A.getParent().setLeft(B);
                    B.setParent(A.getParent());
                } else {
                    A.getParent().setRight(B);
                    B.setParent(A.getParent());
                }
            }
            if (B.getLeft() != null) {
                A.setRight(B.getLeft());
                A.getRight().setParent(A);
            } else {
                A.setRight(null);
            }
            B.setLeft(A);
            A.setParent(B);
        }

        public void rotateRight(Node A) {
            Node B = (Node) A.getLeft();
            if (A == root) {
                root = B;
                B.setParent(null);
            } else {
                if (A.isLeft()) {
                    A.getParent().setLeft(B);
                    B.setParent(A.getParent());
                } else {
                    A.getParent().setRight(B);
                    B.setParent(A.getParent());
                }
            }
            if (B.getRight() != null) {
                A.setLeft(B.getRight());
                A.getLeft().setParent(A);
            } else {
                A.setLeft(null);
            }
            B.setRight(A);
            A.setParent(B);
        }

//        public void bigRotate(Node p) {
//            Node A = (Node) p.getLeft();
//            Node q = (Node) p.getRight();
//
//            if (A.height - q.height == 2) {
//                if (q.getLeftHeight() < q.getRightHeight()) {
//                    rotateRight((Node) p.getRight());
//                }
//                rotateLeft(p);
//            }
//            if (A.height - q.height == -2) {
//                if (q.getRightHeight() > q.getLeftHeight()) {
//                    rotateLeft((Node) p.getLeft());
//                }
//                rotateRight(p);
//            }
//        }


        /**
         * @return if heights of left and right subtree difference is between [-1, 1]
         */
        @Override
        public boolean isBalanced() {
            int heightDiff = Math.abs(getLeftHeight() - getRightHeight());
            return heightDiff <= 1;
        }

        /**
         * @return if this vertex does not contain any value.
         */
        @Override
        public boolean isEmpty() {

            return this.equals(null);
        }

        /**
         * @return true if this vertex is the left child of it's parent.
         */
        @Override
        public boolean isLeft() {
            return this == parent.getLeft();
        }

        @Override
        public void setLeft(ValueContainer container) {
            this.left = (Node) container;
        }

        /**
         * @return this subtree as a sorted list of ValueContainers
         */
        @Override
        public List<ValueContainer> asList() {
            LinkedList<ValueContainer> list = new LinkedList<>();
            if (getLeft() != null) {
                list.addAll(getLeft().asList());
            }
            list.add(this);
            if (getRight() != null) {
                list.addAll(getRight().asList());
            }
            return list;
        }

    }
}
