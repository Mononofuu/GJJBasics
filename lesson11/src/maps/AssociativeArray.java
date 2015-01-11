package maps;

import java.util.LinkedList;

public class AssociativeArray implements Mappable {
    LinkedList[] buckets;
    //    int threshold = 20;
    int arrayLength = 10;
    int size = 0;


    public AssociativeArray() {
        this.buckets = new LinkedList[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            buckets[i] = new LinkedList();
        }
    }


    @Override
    public String add(String key, String val) {
        LinkedList<Node> bucket = buckets[hashCode(key)];
        if (this.containsKey(key) == null) {
            bucket.add(new Node(key, val));
            size++;
        } else {
            for (Node node : bucket) {
                if (node.getKey().equals(key)) {
                    String existingValue = node.getValue();
                    node.setValue(val);
                    return existingValue;
                }
            }
        }


        return null;
    }

    int hashCode(String key) {
        return key.hashCode() % arrayLength;
    }

    @Override
    public String containsKey(String key) {
        LinkedList<Node> bucket = buckets[hashCode(key)];
        for (Node node : bucket) {
            if (node.getKey().equals(key)) return node.getValue();
        }
        return null;
    }

    @Override
    public String remove(String key) {
        LinkedList<Node> bucket = buckets[hashCode(key)];
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (!key.equals(node.key)) return false;
        if (value != null ? !value.equals(node.value) : node.value != null) return false;

        return true;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
