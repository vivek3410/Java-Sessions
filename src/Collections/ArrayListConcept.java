package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(10);

        arrayList.add("vivek");
        arrayList.add("10");
        arrayList.add("10.000");

        System.out.println(arrayList);

        // for(int i = 0;i<arrayList.size();i++){
        //     System.out.print(arrayList.get(i) + " ");
        // }
// 
        // for(Object elements:arrayList){
        //     System.out.print(elements + " ");
        // }

        Iterator it = arrayList.iterator();


        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        // System.out.println(arrayList.get(0));

        // Array -> fixed size, homogenius, contigous memory allocation
        // LinkedList -> dynamic size, heterogenuous

        // Array List -> contiguous memory, dynamic size, heterogenus ( homogenus)


        // int size = 10
        // int arr = new int[size];
        // 11
        // size = size * 2


        // Input:
        // arr = {2,7,11,15}
        // target = 9

        // output:
        // [2,7]

    }
}
