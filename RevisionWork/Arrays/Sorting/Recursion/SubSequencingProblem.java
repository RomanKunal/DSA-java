package RevisionWork.Arrays.Sorting.Recursion;
import java.util.*;
public class SubSequencingProblem {
    public static void main(String[] args) {
//        int[] arr={1,1,2};
//        ArrayList<Integer> curr=new ArrayList<>();
//        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
////        allSubsequences(0,arr,curr,res);
////        printList(res);
//        printsumK(0,arr,curr,res,0,2);
//        printList(res);
//        int[] arr={2,3,1,4,3,5,7,9};
//        mergeSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        ArrayList<Integer>  arr=new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        ArrayList<Integer> res=SubSetWork(arr);
        for (int i:res) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    // Print all subsequences
    static void allSubsequences(int index, int[] arr, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> ans) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(current)); // Add copy of current
            return;
        }

        // Include current element
        current.add(arr[index]);
        allSubsequences(index + 1, arr, current, ans);

        // Exclude current element
        current.remove(current.size() - 1);
        allSubsequences(index + 1, arr, current, ans);
    }
    static void printList(ArrayList<ArrayList<Integer>> res){
        for (ArrayList<Integer> i:res) {
            System.out.println(i);
        }
    }
    // Print subsequence whose sum==k
    static void printsumK(int index, int[] arr, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> res, int sum, int k) {
        int n = arr.length;
        if (index == n) {
            if (sum == k) {
                res.add(new ArrayList<>(curr));
            }
            return;
        }

        // Include current element
        curr.add(arr[index]);
        printsumK(index + 1, arr, curr, res, sum + arr[index], k);
        // Exclude current element
        curr.remove(curr.size() - 1);
        printsumK(index + 1, arr, curr, res, sum, k);
    }

    // Merge Sort
    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] res = new int[high - low + 1];
        int index = 0;
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                res[index++] = arr[left++];
            } else {
                res[index++] = arr[right++];
            }
        }

        while (left <= mid) {
            res[index++] = arr[left++];
        }
        while (right <= high) {
            res[index++] = arr[right++];
        }
        for (int i = 0; i < res.length; i++) {
            arr[low + i] = res[i];
        }
    }
    // Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p);
            quickSort(arr, p + 1, high);
        }
    }


    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (true) {
            // Move i right
            while (arr[i] < pivot) {
                i++;
            }
            // Move j left
            while (arr[j] > pivot) {
                j--;
            }

            // If pointers cross, return
            if (i >= j) {
                return j;
            }

            // Swap elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Move inward after swap
            i++;
            j--;
        }
    }
    // Combinational Sum
    static void find(int index,int[] arr,int target,List<List<Integer>> ans,List<Integer> res){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(res));
            }
            return;
        }
        if(arr[index]<=target){
            res.add(arr[index]);
            find(index,arr,target-arr[index],ans,res);
            res.remove(res.size()-1);
        }
        find(index+1,arr,target,ans,res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        find(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    // SubsetSum
    static void subSetSum(int index,int sum,ArrayList<Integer> arr,ArrayList<Integer> subset){
        if (index==arr.size()){
            subset.add(sum);
            return;
        }
        subSetSum(index+1,sum+arr.get(index),arr,subset);
        subSetSum(index+1,sum,arr,subset);
    }
    static ArrayList<Integer> SubSetWork(ArrayList<Integer> arr){
        ArrayList<Integer> sumsubset=new ArrayList<>();
        subSetSum(0,0,arr,sumsubset);
        Collections.sort(sumsubset);
        return sumsubset;
    }
}
