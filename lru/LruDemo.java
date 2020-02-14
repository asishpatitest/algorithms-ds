package lru;

public class LruDemo {

    public static void main(String args[]) {
        LRU lru = new LRU(5);
        lru.refer(1);
        lru.refer(2);
        lru.refer(3);
        lru.refer(1);
        lru.refer(4);
        lru.refer(5);
        lru.display();
    }
}
