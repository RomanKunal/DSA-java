package RevisionWork.Arrays.Sorting;
class Node {
    int data;
    Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Ques4_8 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        Node head = convert(arr);
//        Node headafterDel=deleteFromHead(head);
//        Node headafterDel=deleteNodeVal(head,4);
//        Node headafterDel=deleteAnyNode(head,3);
        int element=10;
        Node headafterInsert=insertBeforeElement(head,element,4);
        printLinkedList(headafterInsert);
    }
    // Convert array to linked list
    static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }
        return head;
    }
    // Print linked list
    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Deletion From the head position
    static Node deleteFromHead(Node head){
        if(head==null) return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        return head;
    }
    // Delete Node From the tail
    static Node deleteFromTail(Node head){
        if(head == null) return null;
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    // Delete Value  2-3-4-5-6 delete 4
    static Node deleteNodeVal(Node head, int target){
        if(head==null) return null;
        Node temp=head;
        Node prev=null;
        while (temp.next!=null){
            if(temp.data== target){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    // Delete any node
    static Node deleteAnyNode(Node head, int k){
        if(head==null){
            return null;
        }
        Node temp=head;
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
        return head;
    }
    // Insertion At Head
    static Node insertAtHead(Node head, int element){
        Node temp=new Node(element,head);
        return temp;
    }
    //Insertion At Tail
    static Node insertAtTail(Node head, int element){
        Node newNode = new Node(element);
        if (head == null) return newNode;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    // Insert At Kth position
    static Node insertAtKth(Node head, int element, int k) {
        Node newNode = new Node(element);
        if (k == 1) {
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        int count = 1;
        // Traverse to the (k-1)-th node
        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }
        // If position is valid
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Position out of bounds");
        }
        return head;
    }
    // Insertion Before Specific element
    static Node insertBeforeElement(Node head, int element, int beforelement){
        Node temp=head;
        while (temp.next!=null){
            if(temp.next.data==beforelement){
                Node newnode=new Node(element,temp.next);
                temp.next=newnode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}
