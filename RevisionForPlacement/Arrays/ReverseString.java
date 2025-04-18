package RevisionForPlacement.Arrays;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        String s="This is decent";
        String str="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                st.push(str);
                str="";
            }
            else{
                str+=s.charAt(i);
            }
        }
        st.push(str);
        String ans="";
        while(st.size()!=1){
            ans+=st.peek()+" ";
            st.pop();
        }
        ans+=st.peek();
        System.out.println(ans);
    }
}
