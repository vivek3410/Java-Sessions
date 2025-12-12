package LinkedList;

import java.util.LinkedList;

public class LinkedListCollection {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);

        System.out.println(list.getFirst());

        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i) + " -> ");
        }

        System.out.println("null");
    }
}
