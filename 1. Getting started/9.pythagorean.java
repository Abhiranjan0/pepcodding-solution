import java.util.*;
  
  public class Main {
  
  	  public static void main(String[] args) {
  	  	Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		//System.out.println(max);
		if(a==max)
		{
			boolean m=((a*a)==(b*b+c*c));
			System.out.println(m);
		}
		else if(b==max)
		{
			boolean m =((b*b)==(a*a+c*c));
		    	System.out.println(m);
		    	    	}
		else
		{
			boolean m=((c*c)==(a*a+b*b));
				System.out.println(m);
		}
  	  }
  }
