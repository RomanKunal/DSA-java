package RevisionWork.Arrays.Sorting;
import java.util.*;
public class Ques7_8 {
    public static void main(String[] args) {

    }
    static Node convert(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            current.next = temp;
            current = temp;
        }
        return head;
    }

    // reverse node in k group
    static Node getK(Node head, int k) {
        Node temp = head;
        int count = 1;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        return temp; // returns the k-th node
    }

    static Node reverse(Node head, Node tail) {
        Node prev = null;
        Node curr = head;
        Node stop = tail.next; // end limit

        while (curr != stop) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; // new head after reversal
    }

    static Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node groupPrev = dummy;

        while (true) {
            Node kth = getK(groupPrev.next, k);
            if (kth == null) break;
            Node groupNext = kth.next;
            // Reverse group
            Node newHead = reverse(groupPrev.next, kth);

            Node groupTail = groupPrev.next;
            groupTail.next = groupNext;
            groupPrev.next = newHead;

            groupPrev = groupTail;
        }

        return dummy.next;
    }

}
