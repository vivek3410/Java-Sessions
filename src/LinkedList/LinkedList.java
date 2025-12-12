package LinkedList;
public class LinkedList {

    Node head;


    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;

        while(curr.link != null){
            curr = curr.link;
        }
        curr.link = newNode;
    }

    public Node reverse(){
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.link;
            curr.link = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public int findMiddle(){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.link != null){
            slow = slow.link;
            fast = fast.link.link;
        }

        return slow.data;
    }

    public int length(){
        int length = 0;

        Node curr = head;

        while(curr != null){
            length++;
            curr = curr.link;
        }

        return length;
    }

    public int sumOfLL(){
        Node curr = head;
        int sum = 0;
        while(curr != null){
            sum = sum + curr.data;
            curr = curr.link;
        }

        return sum;
    }

    public void sumOfEvenAndOdd(){
        // Logic
        Node curr = head;
        int evenSum = 0;
        int oddSum = 0;

        while(curr != null){
            if(curr.data % 2 == 0){
                evenSum += curr.data;
            }else{
                oddSum += curr.data;
            }
            curr = curr.link;
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("odd Sum: " + oddSum);
    }

    // Deletion of a node

    public void delete(int key){
        if(head.data == key){
            head = head.link;
            return;
        }

        Node curr = head;
        Node prev = null;

        while(curr != null && curr.data != key){
            prev = curr;
            curr = curr.link;
        }

        if(curr == null){
            System.out.println("Key dosent exist");
            return;
        }

        prev.link = curr.link;
    }

    public void print(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.link;
        }

        System.out.print("null");

        System.out.println();
    }



    public void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.link;
        }
        System.out.println("null");
    }   
}