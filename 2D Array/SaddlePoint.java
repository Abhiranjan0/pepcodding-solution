import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++) {
            int svj=0;
            for(int j=1;j<n;j++) {
                if(a[i][j]<a[i][svj]) {
                    svj=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<n;k++) {
                if(a[k][svj]>a[i][svj]) {
                    flag=false;
                    break;
                }
            }
            if(flag==true) {
                System.out.print(a[i][svj]);
                return;
            }
        }
        System.out.print("Invalid input"); 

    }

}
