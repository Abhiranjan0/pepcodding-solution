import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    int m1=s.nextInt();
    int [][]a=new int[n1][m1];
    for(int i=0;i<n1;i++) {
        for(int j=0;j<m1;j++) {
            a[i][j]=s.nextInt();
        }
    }
    int n2=s.nextInt();
    int m2=s.nextInt();
    int [][]b=new int[n2][m2];
    for(int i=0;i<n2;i++) {
        for(int j=0;j<m2;j++) {
            b[i][j]=s.nextInt();
        }
    }
    if(m1!=n2) {
        System.out.println("Invalid input");
        return;
    } 
    
    int c[][]=new int[n1][m2];
    for(int i=0;i<n1;i++) {
        for(int j=0;j<m2;j++) {
            c[i][j]=0;
            for(int k=0;k<m1;k++) {
              c[i][j]+=(a[i][k]*b[k][j]);  
            }
        }
    }
    for(int i=0;i<n1;i++) {
        for(int j=0;j<m2;j++) {
            System.out.print(c[i][j]+" ");
 }
 System.out.println();

}
    
}
}
