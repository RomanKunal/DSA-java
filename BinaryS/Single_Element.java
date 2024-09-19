package BinaryS;

public class Single_Element {
    public static void main(String[] args) {
        int[] arr={3,3,7,7,10,11,11};
        System.out.println(optimal(arr));
    }
//    static int search(int[] arr){
//        int ans=0;
//        for (int i = 0; i <arr.length ; i++) {
//            ans=ans^arr[i];
//        }
//        return ans;
//    }
static int optimal(int[] nums) {
    int low = 0;
    int high = nums.length - 1;

    // Edge case for single element array
    if (nums.length == 1) {
        return nums[0];
    }

    // Check if the first or last element is the unique one
    if (nums[0] != nums[1]) {
        return nums[0];
    }
    if (nums[nums.length - 1] != nums[nums.length - 2]) {
        return nums[nums.length - 1];
    }

    // Binary search for the unique element
    while (low <= high) {
        int mid = (low + high) / 2;

        // Ensure mid is not at the boundary
        if (mid > 0 && mid < nums.length - 1) {
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // Adjust the search range based on the pattern
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } else {
            break;
        }
    }

    return -1; // Should never reach here if input is valid
}

}
