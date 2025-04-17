package RevisionForPlacement.Arrays;
import java.util.*;
public class MergedInterval {
    public static void main(String[] args) {

    }
    static List<List<Integer>> merge(int[][] arr){
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (a[0]-b[0]);
            }
        });
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int start=arr[i][0];
            int end=arr[i][1];
            if(!res.isEmpty() && end<=res.get(res.size()-1).get(1)){
                continue;
            }
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j][0]<=end){
                    end=Math.max(end,arr[j][1]);
                }else{
                    break;
                }
            }
            res.add(Arrays.asList(start,end));
        }
        return res;
    }
}
