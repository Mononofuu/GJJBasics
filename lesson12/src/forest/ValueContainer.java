package forest;

import java.util.List;

/**
 * Represents vertex of a AVL Tree
 */
public interface ValueContainer {

    Integer getValue();

    void setValue(Integer value);

    ValueContainer getParent();

    void setParent(ValueContainer parent);

    ValueContainer getLeft();

    ValueContainer getRight();

    void setRight(ValueContainer container);

    /**
     * @return height of this vertex,
     * that is max of heights of left and right subtrees + 1
     */
    int getHeight();

    void setHeight(int height);

    int getLeftHeight();

    void setLeftHeight(int leftHeight);

    int getRightHeight();

    void setRightHeight(int rightHeight);

    /**
     * recursively updates all heights in both subtrees and height of this vertex.
     */
    void updateHeights();

    /**
     * @return if heights of left and right subtree difference is between [-1, 1]
     */
    boolean isBalanced();

    /**
     * @return if this vertex does not contain any value.
     */
    boolean isEmpty();

    /**
     * @return true if this vertex is the left child of it's parent.
     */
    boolean isLeft();

    void setLeft(ValueContainer container);

    /**
     * @return this subtree as a sorted list of ValueContainers
     */
    List<ValueContainer> asList();

}
