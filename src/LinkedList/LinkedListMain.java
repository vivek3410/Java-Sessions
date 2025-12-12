package LinkedList;



public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // list.print();

//         int midValue = list.findMiddle();
// 
//         System.out.println("Middle Value is: " + midValue);
// 
//         int length = list.length();
// 
//         System.out.println("Length: " + length);
// 
//         int sum = list.sumOfLL();
// 
//         System.out.println("Sum: " + sum);
// 
//         // Node reversed = list.reverse();
// 
//         // System.out.println("Reversed Linked List");
//         // list.print(reversed);
// 
//         list.sumOfEvenAndOdd();

        LinkedList list1 = new LinkedList();
        list1.insert(5);
        list1.insert(2);
        list1.insert(1);
    
        list1.print();

        LinkedList list2 = new LinkedList();

        list2.insert(4);
        list2.insert(6);
        list2.insert(3);

        list2.print();

        Node mergedNode = MergeTwoSortedLL.merge(list1.head, list2.head);

        list2.print(mergedNode);
    }
}
