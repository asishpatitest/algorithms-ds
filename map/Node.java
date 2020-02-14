package map;

public class Node {
    private String key;
    private String value;
    private Integer hash;
    private Node next;

    public Node(String key, String value, Integer hashcode) {
        this.key = key;
        this.value = value;
        this.hash = hashcode;
        next = null;
    }

    public String getKey() {
        return key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public Integer getHash() {
        return hash;
    }
}
