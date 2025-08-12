package RevisionWork.Arrays.Sorting.Recursion;
import java.util.*;
public class PermutationWork {
    public static void main(String[] args) {

    }
    // generate all permutations
    static void check(int[] arr,List<List<Integer>> ans,List<Integer> res,boolean [] flag){
        if(res.size()==arr.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!flag[i]){
                flag[i]=true;
                res.add(arr[i]);
                check(arr,ans,res,flag);
                res.remove(res.size()-1);
                flag[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> res=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        check(nums,ans,res,freq);
        return ans;
    }

}
