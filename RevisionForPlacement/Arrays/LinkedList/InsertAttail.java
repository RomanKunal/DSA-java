package RevisionForPlacement.Arrays.LinkedList;

public class InsertAttail {
    public static void main(String[] args) {
        int[] arr={2,4,6,7};
        Node node=convert(arr);
        Node after=insert(node,9);
        printList(after);

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
    private static Node insert(Node node,int element) {
        Node temp=node;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(element);
        return node;
    }
}
