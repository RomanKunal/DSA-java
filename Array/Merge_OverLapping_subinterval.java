package Array;
import java.util.*;
public class Merge_OverLapping_subinterval {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = brute(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
    static List<List<Integer>> brute(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans=new ArrayList<>();
        for (int i = 0; i <intervals.length ; i++) {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            for (int j = i+1; j <intervals.length ; j++) {
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }else {
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        return ans;
    }
}
