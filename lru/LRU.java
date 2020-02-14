package lru;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class LRU {

    private Deque<Integer> lru;
    private int cacheSize;
    private HashSet<Integer> pagePresent;

    public LRU(int cacheSize) {
        this.lru = new LinkedList<Integer>();
        this.pagePresent = new HashSet<>();
        this.cacheSize = cacheSize;
    }

    public void refer(int pageNumber) {
        if(!pagePresent.contains(pageNumber)) {
            System.out.println("It's a cache miss, will add this page to the cache");
            if (lru.size() == cacheSize) {
                Integer removedElement = lru.remove();
                pagePresent.remove(removedElement);
            }
        } else {
            System.out.println("It's a cache hit");
            lru.remove(pageNumber);
        }
        pagePresent.add(pageNumber);
        lru.add(pageNumber);
    }

    public void display() {
        lru.forEach(System.out::println);
    }
}
