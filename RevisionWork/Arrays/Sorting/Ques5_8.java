package RevisionWork.Arrays.Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class Ques5_8 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        Node head=convert(arr);
        printLinkedList(head);
        ArrayList<Integer> res=reversal(head);
        for (int i:res) {
            System.out.print(i+" -> ");
        }
        System.out.println("null");


    }
    // Reversal of Single linkedlist
    static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }
        return head;
    }
    //Reversal of linkedlist using stack
    static ArrayList<Integer> reversal(Node head){
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        Node temp=head;
        while (temp!=null){
            st.add(temp.data);
            temp=temp.next;
        }
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        return res;
    }
    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Reversal using without Stack
    static DoublyNode reverseDoublyLinkedList(DoublyNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        DoublyNode current = head;
        DoublyNode temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        return temp.prev;
    }
    // Middle Node
    static Node middleNode(Node head) {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // Detect a cycle
    public boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false; // no cycle
    }
    // Detect a cycle and return the point where the cycle started
    static Node detectCycle2(Node head){
        if(head==null) return null;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }

        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    // Length of the loop
    static int findLength(Node slow, Node fast){
        int cnt = 1;
        fast = fast.next;
        while(slow!=fast){
            cnt++;
            fast = fast.next;
        }
        return cnt;
    }
    static int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return findLength(slow, fast);
            }
        }
        return 0;
    }

    // Palindromic LinkedList
    static boolean isPalindrome(Node head){
        Node temp=head;
        if(temp==null) return false;
        Stack<Integer> st=new Stack<>();
        while (temp!=null){
            st.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null){
            if(temp.data!=st.pop()){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
    // Odd Even Segration
    static Node oddEvenSeg(Node head){
        Node odd=head;
        Node even=head.next;
        ArrayList<Integer> res=new ArrayList<>();
        while(odd!=null){
            res.add(odd.data);
            if(odd.next!=null){
                odd=odd.next.next;
            }else{
                break;
            }
        }
        while(even!=null){
            res.add(even.data);
            if(even.next!=null){
                even=even.next.next;
            }else{
                break;
            }
        }
        Node temp=head;
        int index=0;
        while (temp!=null && index<=res.size()){
            temp.data=res.get(index);
            index++;
            temp=temp.next;
        }
        return head;
    }
    // Remove the nth node from the end
    static Node removeNthPosition(Node head, int n) {
        int length = lengthOfALL(head);

        // Edge case: if we want to remove the head
        if (n == length) {
            return head.next;
        }
        int pos = length - n;
        Node temp = head;
        Node prev = null;
        for (int i = 0; i < pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        // Delete temp node
        prev.next = temp.next;

        return head;
    }

    static int lengthOfALL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    //2nd Way fr apporaching this problem
    static Node removeFromNthPosition(Node head,int n){
        Node dummy=new Node(0);
        dummy.next=head;
        Node slow=dummy;
        Node fast=dummy;
        for (int i = 0; i <n ; i++) {
            fast=fast.next;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
    // Delete the middle Node
    static Node deleteMiddleNode(Node head){
        if (head == null || head.next == null) return null;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while (fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
    // Sort the linkedlist
    public Node sortList(Node head) {
        if (head == null) return null;
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(arr);
        Node sort_head = new Node(arr.get(0));
        Node temp1 = sort_head;
        for (int i = 1; i < arr.size(); i++) {
            temp1.next = new Node(arr.get(i));
            temp1 = temp1.next;
        }
        return sort_head;
    }
    // Intersection of the linkedlist
    static Node intersection(Node headA,Node headB){
        if(headA==null || headB==null){
            return null;
        }
        Node pointerA=headA;
        Node pointerB=headB;
        while(pointerA!=pointerB){
            if(pointerA==null){
                pointerA=headB;
            }else{
                pointerA=pointerA.next;
            }
            if(pointerB==null){
                pointerB=headA;
            }else{
                pointerB=pointerB.next;
            }
        }
        return pointerA;
    }
    // Adding 1 to linkedlist
    static Node addingLL(Node head){
        Node temp=reverse(head);
        Node curr=temp;
        int carry=1;
        while (curr!=null){
            int sum=curr.data+carry;
            curr.data=sum%10;
            carry=sum/10;
            if (carry==0) break;
            if (curr.next==null && carry>0){
                curr.next=new Node(0);
            }
            curr=curr.next;
        }
        return reverse(temp);
    }
    static Node reverse(Node head){
        Node prev=null;
        Node temp=head;
        while (temp!=null){
            Node next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    // Adding two list
    static Node addingTwoNumber(Node list1,Node list2){
        Node temp1=list1;
        Node temp2=list2;
        int sum=0;
        int carry=0;
        Node dummy=new Node(-1);
        Node current=dummy;
        while (temp1!=null || temp2!=null){
            sum=carry;
            if (temp1!=null){
                sum+=temp1.data;
                temp1= temp1.next;
            }
            if (temp2!=null){
                sum+=temp2.data;
                temp2=temp2.next;
            }
            Node ans=new Node(sum%10);
            carry=sum/10;
            current.next=ans;
            current=current.next;
            if (carry>0) current.next=new Node(carry);
        }
        return dummy.next;
    }
    // Delete all occurence of doubly linkedlist
    static DoublyNode deleteAllOccurence(DoublyNode head,int element){
        DoublyNode temp=head;
        while(temp!=null){
            if(temp.data==element){
                head=temp.next;
                if(head!=null) head.prev=null;
            }
            else{
                temp.prev.next=temp.next;
                if(temp.next!=null){
                    temp.next.prev=temp.prev;
                }
            }
            temp=temp.next;
        }
        return head;
    }

}
