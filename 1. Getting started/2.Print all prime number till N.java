import java.util.*;

public class Main{
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int low=s.nextInt();
            int high=s.nextInt();
            for(int i=low;i<=high;i++)
            {
                int count=0;
                 for(int n=2;n*n<=i;n++) {
                   if(i%n==0){
                      count++;
                      break;
                 }
                 }
                    if(count==0)
                    System.out.println(i);
            }
        // write your code here
    }
}
