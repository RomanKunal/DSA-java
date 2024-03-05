package Recurssion;

public class Recur1{
   public static void main(String[] args) {
      call(5);

   }
   static void call(int num){
      if(num>=4){
         System.out.println("Error");
         return;

      }
      System.out.println(num);
      call(num+1);
   }
}