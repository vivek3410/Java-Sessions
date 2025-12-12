package Practice.LinkedList;

public class Main {
    
    public static void main(String[] args) {
        LL list = new LL();

        list.insert(10);
        list.insert(20);
        list.insert(30);



        list.print();

        Node reversed = list.reverse();

        list.print(reversed);


    }
}
