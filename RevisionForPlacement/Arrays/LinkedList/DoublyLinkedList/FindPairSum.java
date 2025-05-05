package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

import java.util.ArrayList;

public class FindPairSum {
    public static void main(String[] args) {

    }
    private static Node findtail(Node node){
        Node tail=node;
        while (tail!=null){
            tail=tail.next;
        }
        return tail;
    }
    private static ArrayList<Integer> pair(Node node,int target){
        ArrayList<Integer> ans=new ArrayList<>();
        Node left=node;
        Node right=findtail(node);
        while (left.data<right.data){
            if(left.data+right.data==target){
                ans.add(left.data,right.data);
                left=left.next;
                right=right.prev;
            } else if (left.data+right.data<target) {
                left=left.next;
            }else{
                right=right.prev;
            }
        }
        return ans;
    }
}
