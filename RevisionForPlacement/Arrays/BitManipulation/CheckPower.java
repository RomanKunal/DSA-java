package RevisionForPlacement.Arrays.BitManipulation;

public class CheckPower {
    public static void main(String[] args) {
        int num=13;
        int res=num&(num-1);
        if(res==0){
            System.out.println("Yes it is power");
        }else{
            System.out.println("No it is not in power");
        }
    }
}
