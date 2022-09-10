import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int div=2;div*div<n;div++)
      {
    	  while(n%div==0)
    	  {
    		  n=n/div;
    		  System.out.print(div+" ");
    	  }
      }
      if(n!=0);
      System.out.println(n);
 }
}
