package RevisionForPlacement.Arrays.LinkedList;

public class InsertAtHead {
    public static void main(String[] args) {
        int[] arr={9,8,7,6};
        Node node=convert(arr);
        Node temp=insert(node,5);
        printList(temp);
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
    private static Node insert(Node node,int element){
        Node temp=new Node(element,node);
        return temp;
    }
}
