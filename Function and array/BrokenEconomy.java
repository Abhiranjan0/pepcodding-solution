import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   ;Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int []a=new int[n];
   for(int i=0;i<a.length;i++) {
       a[i]=s.nextInt();

   }
   int d=s.nextInt();
   for(int j=0;j<a.length-1;j++) {
    if(a[j]<d)
    {
        if(d<a[j+1]) {
            System.out.println(a[j+1]+"\n"+a[j]);
        }
    }
     
   }
   
 }

}
