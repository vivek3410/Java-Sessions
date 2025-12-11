package Collections;

import java.util.HashSet;

public class HashsetConcept {
    

    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();

        set.add("vivek");
        set.add("vivek1");

        for(String elt : set){
            System.out.print(elt + " ");
        }

    }
}
