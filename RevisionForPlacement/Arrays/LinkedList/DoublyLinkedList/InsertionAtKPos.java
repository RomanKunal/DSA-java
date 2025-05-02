package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class InsertionAtKPos {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        Node node=convert(arr);
        printList(node);
        node=insertatk(node,10,2);
        printList(node);

    }
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // for newline after list
    }

    private static Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i],prev,null);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    private static Node insertatk(Node head, int data,int k) {
        if (head == null || head.next == null) {
            // Can't insert before tail if there's only one node or none
            return head;
        }
        if (k == 0) {
            // Insert at head
            Node newNode = new Node(data, null, head);
            head.prev = newNode;
            return newNode;
        }
        Node temp=head;
        int count=0;
        while (temp.next!=null){

            if(count==k){
                Node prev=temp.prev;
                Node Front=temp;
                Node newnode=new Node(data,prev,temp);
                prev.next=newnode;
                Front.prev=newnode;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }
}
