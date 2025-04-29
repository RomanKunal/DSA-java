package RevisionForPlacement.Arrays.LinkedList;
class Node1{
    int data;
    Node1 next;
    Node1(int data1,Node1 next1){
        this.data=data1;
        this.next=next1;
    }
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class ConvertArrayLL {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        Node1 node=convert(arr);
        System.out.println(node.next);

    }
    private static Node1 convert(int[] arr){
        Node1 head=new Node1(arr[0]);
        Node1 mover=head;
        for (int i = 1; i < arr.length; i++) {
            Node1 temp=new Node1(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;
    }
}
