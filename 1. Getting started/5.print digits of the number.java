import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int b=n;
      int m=0;
      while(b!=0)
      {
        b=b/10;
        m++;
      }
      int div=(int)Math.pow(10,m-1);
      while(div!=0)
      {
        int a=n/div;
        System.out.println(a);
        n=n%div;
        div=div/10;
      }
       
     }
    }
