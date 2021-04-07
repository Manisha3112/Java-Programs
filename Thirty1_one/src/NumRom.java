import java.util.*;
public class NumRom {
	  static void numToRom(int n){
	        String s="";
	        while(n>0){
	            if(n>=10){
	                s+="x";
	                n-=10;
	            }
	            else if(n>=9){
	                s+="ix";
	                n-=9;
	            }
	            else if(n>=5){
	                s+="v";
	                n-=5;
	            }
	            else if(n>=4){
	                s+="iv";
	                n-=4;
	            }
	            else{
	                s+="i";
	                n-=1;
	            }
	        }
	        System.out.println(s);
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        sc.close();
	        numToRom(n);
	    }
	
}
