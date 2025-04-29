package RevisionForPlacement.Arrays.LinkedList;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Representation {
    public static void main(String[] args) {
        int [] arr={2,4,6,8};
        Node y=new Node(arr[0]);
        System.out.println(y.next);
    }

}
