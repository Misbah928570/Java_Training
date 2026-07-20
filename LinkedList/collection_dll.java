package LinkedList;

import java.util.LinkedList;

public class collection_dll {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.addFirst(10);
        l.addLast(20);
        l.addFirst(40);
        l.add(3,30);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
    }
}
