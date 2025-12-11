package LinkedList;

class Node {
    int value;
    Node link;
    
    Node(int value){
        this.value = value;
        this.link = null;
    }
}

public class Example {

    public static void main(String[] args) {
        Node n1 = new Node(10);
        n1.link = new Node(20);
        n1.link.link = new Node(30);

        while(n1 != null){
            System.out.print(n1.value + " ");
            n1 = n1.link;
        }


    }
}
