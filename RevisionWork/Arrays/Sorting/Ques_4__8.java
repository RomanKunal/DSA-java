package RevisionWork.Arrays.Sorting;

class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode(int data, DoublyNode next, DoublyNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Ques_4__8 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        DoublyNode head = convert(arr);
//        DoublyNode nodeafterdel=deleteAtKth(head,2);
        DoublyNode nodeafterinsert=insertAtkth(head,2,15);
        printList(nodeafterinsert);
    }

    // Convert array into doubly linked list
    static DoublyNode convert(int[] arr) {
        DoublyNode head = new DoublyNode(arr[0]);
        DoublyNode prev = head;

        for (int i = 1; i < arr.length; i++) {
            DoublyNode temp = new DoublyNode(arr[i]);
            prev.next = temp;
            temp.prev = prev; // set prev pointer
            prev = temp;
        }

        return head;
    }

    // Print doubly linked list
    static void printList(DoublyNode head) {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" <-> ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Delete at head
    static DoublyNode deleteAtHead(DoublyNode head){
        if(head==null) return null;
        DoublyNode temp=head.next;
        if(temp!=null){
            temp.prev=null;
        }
        return temp;
    }
    // Delete At Tail
    static DoublyNode deleteAtTail(DoublyNode head) {
        if (head == null) return null;
        if (head.next == null) return null;
        DoublyNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
        return head;
    }
    // Delete At Kth position
    static DoublyNode deleteAtKth(DoublyNode head,int k){
        if(head==null) return null;
        if(k==1){
            DoublyNode next=head.next;
            if(next!=null){
                next.prev=null;
            }
            head.next=null;
            return next;
        }
        int count=0;
        DoublyNode temp=head;
        while (temp.next!=null){
            if(count==k){
                DoublyNode prev=temp.prev;
                prev.next=temp.next;
                if(temp.next!=null){
                    temp.next.prev=prev;
                }
                temp.prev=null;
                temp.next=null;
                break;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }
    // Delete any Value
    static DoublyNode deleteAnyNode(DoublyNode head, int element) {
        if (head == null) return null;
        DoublyNode temp = head;
        if (temp.data == element) {
            DoublyNode next = temp.next;
            if (next != null) {
                next.prev = null;
            }
            temp.next = null;
            return next;
        }
        while (temp != null) {
            if (temp.data == element) {
                DoublyNode prev = temp.prev;
                DoublyNode next = temp.next;
                if (next == null) {
                    // Case 2: Element is at the tail
                    prev.next = null;
                } else {
                    // Case 3: Element is in the middle
                    prev.next = next;
                    next.prev = prev;
                }
                // Disconnect current node
                temp.next = null;
                temp.prev = null;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    // Insertion At Head
    static DoublyNode insertAtHead(DoublyNode head,int k){
        DoublyNode temp=head;
        DoublyNode newnode=new DoublyNode(k,temp,null);
        if(temp.next!=null) head.prev=newnode;
        return newnode;
    }
    // Insertion At Tail
    static DoublyNode insertAtTail(DoublyNode head,int k){
        DoublyNode newnode=new DoublyNode(k);
        if(head==null) return null;
        DoublyNode temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        return head;
    }
    //Insert before Tail
    static DoublyNode insertBeforeTail(DoublyNode head,int k){
        DoublyNode tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        DoublyNode beforetail=tail.prev;
        DoublyNode newnode=new DoublyNode(k);
        newnode.next=tail;
        newnode.prev=beforetail;
        beforetail.next=newnode;
        tail.prev=newnode;
        return head;
    }
    //Insert At Kth position
    static DoublyNode insertAtkth(DoublyNode head,int k,int element){
        DoublyNode temp=head;
        int count=1;
        while (temp.next!=null){
            count++;
            temp=temp.next;
            if (count==k){
                DoublyNode prev=temp.prev;
                DoublyNode front=temp;
                DoublyNode newnode=new DoublyNode(element,temp,prev);
                prev.next=newnode;
                front.prev=newnode;
            }
        }
        return head;
    }
}
