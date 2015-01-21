package lists;

public class DoublyLinkedList implements SimpleList {
    private int size=0;
    private Element first;
    private Element last;

    public void printList() {
        Element current = getFirst();
        for (int i = 0; i < size; i++) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void addFirst(int value) {
        Element element = new Element(value);
        if (size == 0) {
            setFirst(element);
            setLast(element);
        } else {
            getFirst().setPrev(element);
            element.setNext(getFirst());
            setFirst(element);
        }
        size++;
    }

    public int add(int value) {
        Element element = new Element(value);
        if (size == 0) {
            setFirst(element);
            setLast(element);
            size++;
            return 0;
        } else {
            getLast().setNext(element);
            element.setPrev(getLast());
            setLast(element);
        }
        size++;
        return size-1;
    }

    public int set(int index, int value) {
        if (index<0 || index>size-2){
            throw new ArrayIndexOutOfBoundsException();
        }
        int deleted = getElement(index).getValue();
        getElement(index).setValue(value);
        return deleted;
    }

    public Element getElement(int index) {
        if (index<0 || index>size-2){
            throw new ArrayIndexOutOfBoundsException();
        }
        Element current = getFirst();
        if (index > size) {
            System.out.println("Index out of bounds");
        } else if (index == 0) {
            return getFirst();
        } else if (index == size) {
            return getLast();
        } else {
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
        }
        return current;
    }

    public void add(int index, int value) {
        if (index<0 || index>size-2){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index > size) {
            System.out.println("Index out of bounds");
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            add(value);
        } else {
            Element element = new Element(value);
            Element current = getFirst();
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            element.setPrev(current.getPrev());
            element.setNext(current);
            current.getPrev().setNext(element);
            current.setPrev(element);
            size++;
        }
    }

    @Override
    public int get(int index) {
        if (index<0 || index>size-2){
            throw new ArrayIndexOutOfBoundsException();
        }
        return getElement(index).getValue();
    }

    public int remove(int index) {
        if (index<0 || index>size-2){
            throw new ArrayIndexOutOfBoundsException();
        }
        Element current = getElement(index);
        if (current == getFirst()) {
            setFirst(current.getNext());
            current.getNext().setPrev(null);
        } else if (current == getLast()) {
            setLast(current.getPrev());
            current.getPrev().setNext(null);
        } else {
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
        size--;
        return current.getValue();
    }

    public int removeElement(int value) {
        int deletedIndex = indexOf(value);
        remove(deletedIndex);
        return deletedIndex;
    }


    public int indexOf(int value) {
        Element current = first;

        if (first.getValue() == value) {
            return 0;
        } else if (last.getValue() == value) {
            return size - 1;
        } else {
            current = current.getNext();
            for (int i = 1; i < size - 1; i++) {
                if (current.getValue() == value) return i;
                current = current.getNext();
            }
        }
        return -1;
    }

    public boolean contains(int value) {
        Element current = getFirst();
        for (int i = 0; i < size; i++) {
            if (current.getValue() == value) return true;
            current = current.getNext();
        }
        return false;
    }

    public Element getFirst() {

        return first;
    }

    private void setFirst(Element first) {
        this.first = first;
    }

    public int size() {
        return size;
    }

    public Element getLast() {
        return last;
    }

    private void setLast(Element last) {
        this.last = last;
    }

    private class Element {
        private Element next;
        private Element prev;

        private int value;

        public Element(int value) {
            this.value = value;

        }

        public Element getNext() {
            return next;
        }

        public void setNext(Element next) {
            this.next = next;
        }

        public Element getPrev() {
            return prev;
        }

        public void setPrev(Element prev) {
            this.prev = prev;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
