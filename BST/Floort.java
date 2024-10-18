package BST;

public class Floort {
    public static void main(String[] args) {

    }
    static int call(TreeNode root,int key){
        int floor=-1;
        while(root!=null){
            if(root.data==key){
                floor=root.data;
                return floor;
            }
            if(root.data>key){
                root=root.left;
            }else{
                floor= root.data;
                root=root.right;
            }
        }
        return floor;
    }
}
