package forest;


import java.util.List;

public interface Treeish {

    /**
     * Adds new Integer to the tree.
     *
     * @param value new value to add. Can be null.
     */
    void add(Integer value);

    /**
     * Removes specific Integer from the tree.
     *
     * @param value to delete. Can be null.
     */
    void remove(Integer value);

    /**
     * @param value to check.
     * @return true if tree has given value, false otherwise.
     */
    boolean contains(Integer value);

    //TEST METHODS

    /**
     * @return top vertex of the tree
     */
    ValueContainer getTop();

    /**
     * @return tree as a sorted list of ValueContainers
     */
    List<ValueContainer> asList();

    /**
     * recursively updates all heights of vertices to their actual heights
     */
    void updateAllHeights();
}


