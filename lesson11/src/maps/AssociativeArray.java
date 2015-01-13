package maps;

import java.util.LinkedList;

public class AssociativeArray implements Mappable {
    LinkedList[] buckets;
    int arrayLength = 16;
    int threshhold = arrayLength / 8;
    int size = 0;


    public AssociativeArray() {
        this.buckets = new LinkedList[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            buckets[i] = new LinkedList();
        }
    }

    private void reindex() {
        LinkedList[] newBuckets = new LinkedList[arrayLength * 2];
        for (int i = 0; i < newBuckets.length; i++) {
            newBuckets[i] = new LinkedList();
        }
        arrayLength *= 2;
        for (LinkedList<Node> list : buckets) {
            for (Node node : list) {
                newBuckets[position(node.getKey())].add(node);
            }
        }
        buckets = newBuckets;

    }


    @Override
    public String add(String key, String val) {
        if (key == null) {
            return null;
        }
        LinkedList<Node> bucket = buckets[position(key)];

        for (Node node : bucket) {
            if (!node.getKey().equals(key)) {
                continue;
            }
            String existingValue = node.getValue();
            node.setValue(val);
            return existingValue;
        }
        bucket.add(new Node(key, val));
        size++;
        if (size > threshhold * arrayLength) {
            reindex();
        }
        return null;
    }

    private int position(String key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % arrayLength);
    }

    @Override
    public String containsKey(String key) {
        if (key == null) {
            return null;
        }
        LinkedList<Node> bucket = buckets[position(key)];
        for (Node node : bucket) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return null;
    }

    @Override
    public String remove(String key) {
        if (key == null) {
            return null;
        }
        LinkedList<Node> bucket = buckets[position(key)];
        for (Node node : bucket) {
            if (node.getKey().equals(key)) {
                String deletedValue = node.getValue();
                bucket.remove(node);
                size--;
                return deletedValue;
            }
        }
        return null;
    }

    class Node {
        private String key;
        private String value;

        public Node(String key, String value) {
            this.value = value;
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Node node = (Node) o;

            return key.equals(node.key) && !(value != null ? !value.equals(node.value) : node.value != null);

        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
