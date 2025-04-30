package RevisionForPlacement.Arrays.LinkedList;

public class InsertAtK {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        Node node=convert(arr);
        insert(node,10,2);
        printList(node);

    }
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static Node insert(Node node,int element,int k) {
        int count=0;
        if(node==null){
            Node node1=new Node(element);
            return node1;
        }
        if(k==1){
            Node temp=new Node(element,node);
            return temp;
        }
        Node temp=node;
        while (node!=null){
            count++;
            if (count==k-1){
                Node newnode=new Node(element);
                newnode.next=temp.next;
                temp.next=newnode;
                break;
            }
            temp=temp.next;
        }
        return node;
    }
}
