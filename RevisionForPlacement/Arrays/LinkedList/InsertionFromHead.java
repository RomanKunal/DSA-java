package RevisionForPlacement.Arrays.LinkedList;

public class InsertionFromHead {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        Node node=convert(arr);
        System.out.println(node.data);
        Node afterdel=deletefromgead(node);
        System.out.println(afterdel.data);

    }
    private static Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for (int i = 1; i <arr.length ; i++) {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static Node deletefromgead(Node node){
        Node temp=node;
        node=temp.next;
        return node;
    }

}
