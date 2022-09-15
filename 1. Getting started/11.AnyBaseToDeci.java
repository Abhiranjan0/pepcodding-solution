import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int re=0;
      int p=1;
      int count=0;
      while(n!=0)
      {
          int c=n%10;
          n=n/10;
          re=re+c*(int)Math.pow(b,count);
          count++;
      }
      return re;
   }
  }
