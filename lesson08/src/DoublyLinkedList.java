public class DoublyLinkedList {
    private int size;
    private Element first;
    private Element last;

    public void printList() {
        Element current = getFirst();
        for (int i = 0; i < size; i++) {
            System.out.print(current.getValue());
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

    public void addLast(int value) {
        Element element = new Element(value);
        if (size == 0) {
            setFirst(element);
            setLast(element);
        } else {
            getLast().setNext(element);
            element.setPrev(getLast());
            setLast(element);
        }
        size++;
    }

    public void set(int index, int value) {
        get(index).setValue(value);
    }

    public Element get(int index) {
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
        if (index > size) {
            System.out.println("Index out of bounds");
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
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

    public Element remove(int value) {
        Element current = getFirst();
        while (current != null) {
            if (current.getValue() == value) {
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
                break;
            } else {
                current = current.getNext();
            }
        }
        return current;
    }

    public int indexOf(int value) {
        Element current = getFirst();

        if (getFirst().getValue() == value) {
            return 0;
        } else if (getLast().getValue() == value) {
            return size - 1;
        } else {
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

    public int getSize() {
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
