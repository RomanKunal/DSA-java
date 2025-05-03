package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortThree {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,2,1,0};
        Node node=convert(arr);
        printList(node);
        node=sortt(node);
        printList(node);
        node=sorting(node);
        printList(node);

    }
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // for newline after list
    }

    private static Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i],prev,null);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    static Node sortt(Node node){
        Node temp=node;
        ArrayList<Integer> res=new ArrayList<>();
        while (temp!=null){
            res.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(res);
        temp=node;
        int index=0;
        while (temp!=null){
            temp.data=res.get(index);
            index++;
            temp=temp.next;
        }
        return node;
    }
    static Node sorting(Node node) {
        // Dummy heads
        Node zeroD = new Node(-1);
        Node oneD = new Node(-1);
        Node twoD = new Node(-1);

        // Tails to build new lists
        Node zero = zeroD;
        Node one = oneD;
        Node two = twoD;

        Node temp = node;

        // Separate nodes into three lists
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else if (temp.data == 2) {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        // Connect three lists
        zero.next = oneD.next != null ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null; // end of final list

        // Head of the new sorted list
        return zeroD.next;
    }

}
