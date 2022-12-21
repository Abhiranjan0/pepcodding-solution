package xyz;
import java.io.*;
import java.util.*;

public class printEncoding {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	      String input=s.next();
	      printEncod(0,input,"");

	    }

	    public static void printEncod(int idx,String input,String output) {
	        if(idx==input.length()) {
	          System.out.println(output);
	          return ;
	        }
	        int ch1=input.charAt(idx)-'0';
	        if(ch1>=1&&ch1<=9) {
	        	printEncod(idx+1,input,output+(char)('a'+ch1-1));
	        }
	        if(idx+1<input.length()) {
	          int ch2=(input.charAt(idx)-'0')*10+(input.charAt(idx+1)-'0');
	          if(ch2>=10&&ch2<=26) {
	        	  printEncod(idx+2,input,output+(char)('a'+ch2-1));
	          }
	        }
	    }

	}
