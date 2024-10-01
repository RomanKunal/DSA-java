package Strings;

public class MaximmumNesting {
    public static void main(String[] args) {
        String str= "(1+(2*3)+((8)/4))+1";
        System.out.println(depth(str));
    }
    static int depth(String str){
        int count=0;
        char[] res=str.toCharArray();
        int max=0;
        for (int i = 0; i <res.length ; i++) {
            if(res[i]=='('){
                count++;
                if(count>max){
                    max=count;
                }
            } else if (res[i]==')') {
                count--;
                if(count<0){
                    return -1;
                }
            }
        }
        if(count!=0){
            return -1;
        }
        return max;
    }
}
