package RevisionWork.Arrays.Sorting;

public class Ques31_8 {
    public static void main(String[] args) {
        int[] arr={4,2,1,5,6,7};
        System.out.println(maxElement(arr));
    }
    // maximum element
    static int maxElement(int[] arr){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    // print ascii value
    static void printascii(String str){
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            int ascii=ch;
            System.out.println("The ascii value of "+ch+" is: "+ascii);
        }
    }
    // find the difference between number of con and vowels
    static int diffvowelcon(String str){
        int vowel=0;
        int con=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel++;
            }else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                con++;
            }
        }
        return Math.abs(vowel-con);
    }
    // count the number of words in string
    static int countwords(String str){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        return count+1;
    }
    // find the maximum and minimum occurence of character in string
    static void maxminoccurence(String str){
        int[] freq=new int[256];
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            freq[ch]++;
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        char maxchar=' ';
        char minchar=' ';
        for (int i = 0; i <freq.length ; i++) {
            if(freq[i]>max){
                max=freq[i];
                maxchar=(char)i;
            }
            if(freq[i]<min && freq[i]>0){
                min=freq[i];
                minchar=(char)i;
            }
        }
        System.out.println("The maximum occurence of character is: "+maxchar+" with frequency: "+max);
        System.out.println("The minimum occurence of character is: "+minchar+" with frequency: "+min);
    }
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;               // for evens
        int right = nums.length - 1; // for odds

        for (int num : nums) {
            if (num % 2 == 0) {
                res[left++] = num;   // put evens at start
            } else {
                res[right--] = num;  // put odds at end
            }
        }
        return res;
    }
}
