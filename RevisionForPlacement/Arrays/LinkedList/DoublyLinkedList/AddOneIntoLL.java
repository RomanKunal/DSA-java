package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class AddOneIntoLL {
    public static void main(String[] args) {
        int[] data={9,9,9,9};
        Node node=convert(data);
        printList(node);
        node=addOne(node);
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
    private static int helper(Node node){
        if(node==null){
            return 1;
        }
        int carry=helper(node.next);
        int sum=node.data+carry;
        node.data=sum%10;
        return sum/10;
    }
    private static Node addOne(Node node){
        int carry=helper(node);
        if(carry==1){
            Node newnode=new Node(1);
            newnode.next=node;
            return newnode;
        }
        return node;
    }

}
