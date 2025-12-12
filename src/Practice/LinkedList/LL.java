package Practice.LinkedList;

public class LL {

    Node head;
    
    public void insert(int data){
        if(this.head == null){
            this.head = new Node(data);
            return;
        }
        Node temp = head;

        while(temp.link != null){
            temp = temp.link;
        }

        temp.link = new Node(data);
    }

    public void insertAtLast(int data){
        if(this.head == null){
            insert(data);
            return;
        }
        Node temp = head;

        while(temp.link != null){
            temp = temp.link;
        }

        temp.link = new Node(data);
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            if(temp != null){
                System.out.print(temp.data + " -> ");
            }
            temp = temp.link;
        }
        System.out.println();
    }

    public void print(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }

        System.out.println();
    }

    public Node reverse(){
        Node temp = head;
        Node next = null;
        Node prev = null;

        while(temp != null){
            next = temp.link;
            temp.link = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

}
