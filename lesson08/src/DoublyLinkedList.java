public class DoublyLinkedList {
    private int size;
    private Element fisrt;
    private Element last;

    public void printList() {
        Element current = getFisrt();
        for (int i = 0; i < size; i++) {
            System.out.print(current.getValue());
            current = current.getNext();
        }
        System.out.println();
    }

    public void addFirst(int value) {
        Element element = new Element(value);
        if (size == 0) {
            setFisrt(element);
            setLast(element);
        } else {
            getFisrt().setPrev(element);
            element.setNext(getFisrt());
            setFisrt(element);
        }
        size++;
    }

    public void addLast(int value) {
        Element element = new Element(value);
        if (size == 0) {
            setFisrt(element);
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
        Element current = getFisrt();
        if (index > size) {
            System.out.println("Index out of bounds");
        } else if (index == 0) {
            return getFisrt();
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
            Element current = getFisrt();
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

    public int remove(int value) {
        Element current = getFisrt();
        while (current != null) {
            if (current.getValue() == value) {
                if (current == getFisrt()) {
                    setFisrt(current.getNext());
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
        return current.getValue();
    }

    private int indexOf(int value) {
        Element current = getFisrt();

        if (getFisrt().getValue() == value) {
            return 0;
        } else if (getLast().getValue() == value) {
            return size;
        } else {
            for (int i = 0; i < size; i++) {
                if (current.getValue() == value) return i;
                current = current.getNext();
            }
        }
        return -1;
    }

    public boolean contains(int value) {
        Element current = getFisrt();
        for (int i = 0; i < size; i++) {
            if (current.getValue() == value) return true;
            current = current.getNext();
        }
        return false;
    }

    public Element getFisrt() {

        return fisrt;
    }

    private void setFisrt(Element fisrt) {
        this.fisrt = fisrt;
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
