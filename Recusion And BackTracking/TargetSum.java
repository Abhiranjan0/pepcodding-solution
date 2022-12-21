package xyz;
import java.util.*;

public class Targetsum {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the size of Array:> ");
	  int n=s.nextInt();
	  int[] m=new int[n];
	  for(int i=0;i<n;i++) {
		  m[i]=s.nextInt();
	  }
	  System.out.println("Enter the target:> ");
	  int target=s.nextInt();
	  printTargetsum(m,0,"",target);
	  
	}
	public static void printTargetsum(int[] m,int idx,String set,int remTarget) {
		
		if(idx==m.length) {
			if(remTarget==0) {				
				System.out.println(set +".");
			}
			return;
		}
		
		if(remTarget<0) {
			return ;
			// pruning step
		}
		
		printTargetsum(m,idx+1,set+m[idx]+",",remTarget-m[idx]);//yes
	
		printTargetsum(m,idx+1,set,remTarget);//No
		
	}

}
