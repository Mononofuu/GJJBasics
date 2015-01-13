package maps;

import java.util.LinkedList;

public class AssociativeArray implements Mappable {
    LinkedList[] buckets;
    int size = 0;

    public AssociativeArray() {
        buckets = new LinkedList[16];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList();
        }
    }

    private void reindex() {
        LinkedList[] newBuckets = new LinkedList[buckets.length * 2];
        for (int i = 0; i < newBuckets.length; i++) {
            newBuckets[i] = new LinkedList();
        }
        LinkedList[] tempBuckets = buckets;
        buckets = newBuckets;
        for (LinkedList<Node> list : tempBuckets) {
            for (Node node : list) {
                buckets[position(node.getKey())].add(node);
            }
        }
    }

    @Override
    public String add(String key, String val) {
        if (key == null) {
            return null;
        }
        LinkedList<Node> bucket = buckets[position(key)];
        Node findedNode = findNode(bucket, key);
        if (findedNode != null) {
            String existingValue = findedNode.getValue();
            findedNode.setValue(val);
            return existingValue;
        }
        bucket.add(new Node(key, val));
        size++;
        if (size > buckets.length * 2) {
            reindex();
        }
        return null;
    }

    private int position(String key) {
        if (key == null) {
            return 0;
        }
        return Math.abs(key.hashCode() % buckets.length);
    }

    @Override
    public String containsKey(String key) {
        if (key == null) {
            return null;
        }
        LinkedList<Node> bucket = buckets[position(key)];
        Node findedNode = findNode(bucket, key);
        return findedNode == null ? null : findedNode.getValue();
    }

    private Node findNode(LinkedList<Node> bucket, String key) {
        if (bucket == null || key == null) {
            return null;
        }
        Node findedNode = null;
        for (Node node : bucket) {
            if (node.getKey().equals(key) && node.getKey() != null) {
                findedNode = node;
            }
        }
        return findedNode;
    }

    @Override
    public String remove(String key) {
        if (key == null) {
            return null;
        }
        LinkedList<Node> bucket = buckets[position(key)];
        String deletedValue = null;
        Node findedNode = findNode(bucket, key);
        if (findedNode != null) {
            deletedValue = findedNode.getValue();
            bucket.remove(findedNode);
            size--;
        }
        return deletedValue;
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
