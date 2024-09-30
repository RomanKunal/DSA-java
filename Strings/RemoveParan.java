package Strings;

public class RemoveParan {
    public static void main(String[] args) {
        String input = "(()())(())";
        String output = check(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
    static String check(String s){
        StringBuilder res=new StringBuilder();
        int open=0;   // track the open counter
        for(char c:s.toCharArray()){
            if(c == '('){

                if(open>0){
                    res.append(c);
                }
                open++;
            } else if (c==')') {
                open--;
                if(open>0){
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}
