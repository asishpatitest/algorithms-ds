package map;

public class HashMap {

    private Node hashMap[];
    private int size = 0;

    public HashMap() {
        hashMap = new Node[16];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void put(String key, String value) {
        Node node = new Node(key, value, key.hashCode());
        int tableHash = hashCode(key);
        if(hashMap[tableHash] == null) {
            hashMap[tableHash] = node;
        } else {
            Node nodeAtTheIndex = hashMap[tableHash];
            Node tempNode = nodeAtTheIndex;
            Node lastNode = tempNode;
            while (tempNode != null) {
                if(tempNode.getKey().equals(key)) {
                    System.out.println("Key is already present, duplicate keys not allowed");
                    return;
                }
                lastNode = tempNode;
                tempNode = tempNode.getNext();
            }
            lastNode.setNext(node);
        }
        size++;
    }

    public String get(String key) {
        int tableHashOfKey = hashCode(key);
        int hashOfKey = key.hashCode();
        Node node = hashMap[tableHashOfKey];
        while (node != null) {
            if(node.getHash().equals(hashOfKey)) {
                return node.getValue();
            }
            node = node.getNext();
        }
        System.out.println("Key is not present");
        return null;
    }

    public void remove(String key) {
        int tableHashOfKey = hashCode(key);
        int hashOfKey = key.hashCode();
        Node node = hashMap[tableHashOfKey];
        Node lastNode = null;
        while (node != null) {
            if(node.getHash().equals(hashOfKey)) {
                if(lastNode == null) {
                    hashMap[tableHashOfKey] = node.getNext();
                } else {
                    lastNode.setNext(node.getNext());
                }
                size--;
                return;
            }
            lastNode = node;
            node = node.getNext();
        }
        System.out.println("Key is not present");
    }

    private int hashCode(String key) {
        return Math.abs(key.hashCode()) % 16;
    }
}
