package RevisionWork.Arrays.Sorting;
import java.util.*;
public class Ques6_8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        DoublyNode head = convert(arr);
        ArrayList<ArrayList<Integer>> res = pairSum(head, target);
        // Print the pairs
        for (ArrayList<Integer> pair : res) {
            System.out.println("(" + pair.get(0) + ", " + pair.get(1) + ")");
        }
    }
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
    // Find pairs with having sum==k
    static ArrayList<ArrayList<Integer>> pairSum(DoublyNode head,int target){
        if(head==null) return null;
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        DoublyNode start=head;
        DoublyNode end=head;
        while (end.next!=null){
            end=end.next;
        }
        boolean found=false;
        while (start!=null && end!=null && start!=end && end.next!=start){
            int sum=start.data+end.data;
            if (sum==target){
                ArrayList<Integer> ans=new ArrayList<>();
                ans.add(start.data,end.data);
                found=true;
                start=start.next;
                end=end.prev;
                res.add(ans);
            } else if (sum<target) {
                start=start.next;
            }else{
                end=end.prev;
            }
        }
        return res;
    }

}
