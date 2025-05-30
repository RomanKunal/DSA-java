package RevisionForPlacement.Arrays.LinkedList;

public class DeleteAnyNode {
    public static void main(String[] args) {
        int[] arr={2,4,6,7};
        Node node=convert(arr);
        System.out.println(node.next);
        delete(node,2);
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
    private static Node delete(Node node,int k){
        Node temp=node;
        if(temp==null){
            return node;
        }
        Node prev=null;
        int count=0;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return temp;

    }
}
