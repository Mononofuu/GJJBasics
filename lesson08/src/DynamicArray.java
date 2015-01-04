public class DynamicArray {
    int[] array;

    private int size;

    public int getSize() {
        return size;
    }

    public DynamicArray() {
        array = new int[10];
    }

    public DynamicArray(int size) {
        array = new int[size];
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public int get(int index) {
        return array[index];
    }

    public int add(int value) {
        if (size == array.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
            array[size] = value;
            size++;
        } else {
            array[size] = value;
            size++;
        }
        return size - 1;
    }

    public void add(int index, int value) {
        if (size == array.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = value;
            size++;
        } else {
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = value;
            size++;
        }
    }

    public int remove(int index) {
        int deletedValue = get(index);
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        if (size < array.length / 2) {
            int[] temp = new int[array.length / 2];
            System.arraycopy(array, 0, temp, 0, size);
            array = temp;
        }
        return deletedValue;
    }


    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    public int removeElement(int value) {
        int index = indexOf(value);
        remove(index);
        return index;
    }

    public boolean contains(int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
