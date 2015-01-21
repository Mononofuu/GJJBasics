package lists;

public interface SimpleList {
    int add(int value);
    void add(int index, int element);
    int get(int index);
    int remove(int index);
    int removeElement(int element);
    int size();
    int indexOf(int value);
    boolean contains(int value);
    int set(int i, int e);
}
