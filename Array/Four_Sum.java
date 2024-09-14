package Array;
import java.util.*;


public class Four_Sum {
    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = optimal(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

    }
//    static List<List<Integer>> brute(int[] arr,int target){
//        Set<List<Integer>> st=new HashSet<>();
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                for (int k = j+1; k <arr.length ; k++) {
//                    for (int l = k+1; l <arr.length ; l++) {
//                        long sum=(long)arr[i]+arr[j];
//                        sum+=arr[k];
//                        sum+=arr[l];
//                        if(sum==target){
//                            List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
//                            Collections.sort(temp);
//                            st.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        List<List<Integer>> ans=new ArrayList<>(st);
//        return ans;
//    }

    static List<List<Integer>> optimal(int[]arr,int tagret){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for (int j = i+1; j <arr.length ; j++) {
                if(j>0 && arr[j]==arr[j-1]){
                    continue;
                }
                int k=j+1;
                int l=arr.length-1;
                while(k<l){
                    long sum=arr[i];
                    sum+=arr[j]+arr[k]+arr[l];
                    if(sum==tagret){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1]){
                            k++;
                        }
                        while(k<l && arr[l]==arr[l+1]){
                            l--;
                        }
                    } else if (sum>tagret) {
                        l--;
                    }else{
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}
