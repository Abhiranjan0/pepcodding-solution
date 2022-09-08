package xyz;
import java.util.Scanner;

public class Arr2D {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
       int a[][]=new int[3][4];
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<a.length;j++)
    	   {
    		   System.out.println( "Enter marks of class "+ i +"Student"+ j);
    		   a[i][j]=scan.nextInt();
    		   	
    	   }
       }
       System.out.println("The marks of student are as follows" );
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<a[i].length;j++)
    	   { System.out.print(a[i][j]+" " );
       }
    	   System.out.println();
       
	}

}
	
}
