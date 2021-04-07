import java.util.*;
public class VowToCap {
	   public static void main(String[] args) {
		       Scanner sc=new Scanner(System.in);
                 String str=sc.nextLine();
                 int n=str.length();
             String temp="";
             char ch[]=str.toCharArray();
             for(int i=0;i<n;i++) {
             if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' ||ch[i]=='u')
     	   {
     		char s=Character.toUpperCase(ch[i]);
     		temp+=s;
     	   }
     	   else 
     	   {
     		temp+=ch[i];
     	   }
          }
          System.out.print(temp);
     
	 }

   
}
