import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int op=1;
  int rev=0;
  while(n!=0)
  {
    int od=n%10;
    int ip=od;
    int id=op;
    rev = rev+id*(int)Math.pow(10,ip-1);
    n=n/10;
    op++;
  }
  System.out.println(rev);
  }
}
