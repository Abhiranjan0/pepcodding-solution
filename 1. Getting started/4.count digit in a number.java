import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=0;
    while(n!=0)
    {     n=n/10;
      m++; }
      System.out.println(m);
    // write your code here  
   }
  }
