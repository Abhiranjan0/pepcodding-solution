import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int b=n;
     int count =0;
     while(b!=0) {
       b=b/10;
       count++;
     }
     while(n!=0)
     {
       int a=n%10;
       System.out.println(a);
       n=n/10;
       

     }
     // write your code here  
    }
   }
