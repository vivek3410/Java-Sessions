package LinkedList;

public class MergeTwoSortedLL {
    
    public static Node merge(Node l1,Node l2){
        Node dummy = new Node(-1);
        Node curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                curr.link = l1;
                l1 = l1.link;
            }else{
                curr.link = l2;
                l2 = l2.link;
            }
            curr = curr.link;
        }

        if(l1 != null) curr.link = l1;
        else if(l2 != null) curr.link = l2;

        return dummy.link;
    }
}
