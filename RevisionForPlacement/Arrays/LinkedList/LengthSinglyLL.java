package RevisionForPlacement.Arrays.LinkedList;

public class LengthSinglyLL {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        Node node=convert(arr);
        System.out.println(length(node));

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
    private static int length(Node node){
        int count=0;
        Node temp=node;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
