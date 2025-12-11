package Collections;

import java.util.LinkedList;

public class LinkedListConcept {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("vivek");
        list.add("hello");

        for(String elt : list ){
            System.out.println(elt);
        }
    }
}
