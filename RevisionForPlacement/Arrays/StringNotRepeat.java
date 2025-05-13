package RevisionForPlacement.Arrays;
import java.util.*;
public class StringNotRepeat {
    public static void main(String[] args) {

    }
    static int checklen(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int maxlen=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>=1){
                l=map.get(ch)+1;
            }
            map.put(ch,i);
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}
