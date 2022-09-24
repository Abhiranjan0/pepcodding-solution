import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
     int limit=(int)Math.pow(2,arr.length);
     
     for(int i=0;i<limit;i++) {
        int temp=i;
        String set= "";
        for(int j=arr.length-1;j>=0;j--) {
           int r=temp%2;
           temp=temp/2;
           if(r==0)
           {
              set="-\t"+set;
           } else 
             set=arr[j]+"\t"+set;
           

        }
        System.out.println(set);
     }
    
 }

}
