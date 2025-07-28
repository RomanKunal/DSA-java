package RevisionWork.Arrays.Sorting;
import java.lang.reflect.Array;
import java.util.*;
public class Ques28_7 {
    public static void main(String[] args) {
//        int[] arr={4,7,1,0};
//        ArrayList<Integer> res=leaderTwo(arr);
//        System.out.println(res);
//        int[] arr={100,200,1,2,3,4};
//        ArrayList<Integer> res=consecutiveSubarray(arr);
//        System.out.println(res);
//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
//        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
//
//        int n = matrix.size();
//        int m = matrix.get(0).size();
//
//        ArrayList<ArrayList<Integer>> ans = setMatrix(matrix, n, m);
//
//        System.out.println("The Final matrix is: ");
//        for (ArrayList<Integer> row : ans) {
//            for (Integer ele : row) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
//        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
//        int col=arr[0].length;
//        int row=arr.length;
//        int[][] res=rotate(arr,row,col);
//        System.out.println(Arrays.toString(res));
//        System.out.println("Transposed Matrix:");
//        for (int[] i : res) {
//            for (int val : i) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//        pascalTriangle(5);
        int[] arr={4,2,2,6,4};
        System.out.println(subArraysxor(arr,6));


    }
    // Leader in the array
    static ArrayList<Integer> leader(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                res.add(arr[i]);
            }
        }
        return res;
    }
    // 2nd approach for this ques
    static ArrayList<Integer> leaderTwo(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        int last=arr[arr.length-1];

        int max=last;
        res.add(max);
        for (int i = arr.length-2; i>=0 ; i--) {
            if(arr[i]>max){
                res.add(arr[i]);
                max=arr[i];
            }
        }

        Collections.reverse(res);
        return res;
    }
    // Consecutive subarray
    static ArrayList<Integer> consecutiveSubarray(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for (int i:arr) {
            set.add(i);
        }
        for (int num: arr) {
            if(!set.contains(num-1)){
                ArrayList<Integer> temp=new ArrayList<>();
                int current=num;
                while(set.contains(current)){
                    temp.add(current);
                    current++;
                }
                if(temp.size()>res.size()){
                    res=temp;
                }
            }
        }
        return res;
    }
    // Set Matrix zero
    static ArrayList<ArrayList<Integer>> setMatrix(ArrayList<ArrayList<Integer>> arr,int row,int col){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if(arr.get(i).get(j)==0){
                    markRow(arr,row,col,i);
                    markCol(arr,row,col,j);
                }
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if(arr.get(i).get(j)==-1){
                    arr.get(i).set(j,0);
                }
            }
        }
        return arr;
    }
    static void markRow(ArrayList<ArrayList<Integer>> arr,int row,int col,int i){
        for (int j = 0; j < row; j++) {
            if(arr.get(i).get(j)!=0){
                arr.get(i).set(j,-1);
            }
        }
    }
    static void markCol(ArrayList<ArrayList<Integer>> arr,int row,int col,int j){
        for (int i = 0; i <col ; i++) {
            if(arr.get(i).get(j)!=0){
                arr.get(i).set(j,-1);
            }
        }
    }
    // Rotate matrix by 90
    static int[][] rotate(int[][] arr,int row,int col){
        int[][] transpose=new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                transpose[j][i]=arr[i][j];
            }
        }
        // reverse row now
        for (int i = 0; i <col ; i++) {
            reverseRow(transpose[i]);
        }
        return transpose;

    }
    static void reverseRow(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    // Spiral Matrix
    static ArrayList<Integer> spiralMatrix(int[][] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int top = 0, left = 0;
        int right = col - 1, bottom = row - 1;

        while (left <= right && top <= bottom) {
            // Move left to right
            for (int i = left; i <= right; i++) {
                res.add(arr[top][i]);
            }
            top++; // move boundary inward

            // Move top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(arr[i][right]);
            }
            right--;

            // Move right to left (only if row remains)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }

            // Move bottom to top (only if column remains)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(arr[i][left]);
                }
                left++;
            }
        }

        return res;
    }
    // Pascal triangle
    static void pascalTriangle(int n) {
        long ans = 1;
        System.out.print(ans + " ");

        // Printing the rest of the part:
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    // majority of 3
    static ArrayList<Integer> majority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Add elements whose count > n/3 (only once)
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 3) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
    // Three Sum
    static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    res.add(temp);
                    j++;
                    k--;
                }
                while (j < k && arr[j] == arr[j - 1]) j++;
                while (j < k && arr[k] == arr[k + 1]) k--;
            }
        }
        return res;
    }
    // Largest subarray with sum of 0
    static int largestSubarray(int[] arr){
        int len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxi=0;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }else{
                if(map.get(sum)!=null){
                    maxi=Math.max(maxi,i-map.get(sum));
                }else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
    // Count the subarrays whose xor k
    static int subArraysxor(int[] arr, int k) {
        int xor = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            // If xor itself is equal to k, subarray from 0 to i is valid
            if (xor == k) {
                maxLen = i + 1;
            }
            // Check if xor ^ k exists in map
            if (map.containsKey(xor ^ k)) {
                maxLen = Math.max(maxLen, i - map.get(xor ^ k));
            }
            // Store the first occurrence of xor
            if (!map.containsKey(xor)) {
                map.put(xor, i);
            }
        }
        return maxLen;
    }
    //Merge Overlapping intervals
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort intervals based on starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);

        // Step 2: Traverse the intervals
        for (int[] interval : intervals) {
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) {
                // Overlapping intervals -> merge
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap -> add new interval
                current = interval;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    // return missing and repeating number from the array
    static ArrayList<Integer> missingAndRepeating(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int repeat = -1, missing = -1;
        int n = arr.length;

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Check from 1 to n
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            } else if (map.get(i) == 2) {
                repeat = i;
            }
        }
        res.add(repeat);
        res.add(missing);
        return res;
    }
}
