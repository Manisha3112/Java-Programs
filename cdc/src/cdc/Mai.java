package cdc;
import java.util.*;
public class Mai {
     public static void main(String args[]) {
			int iSum=0;
			int iCount=0;
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)>'0'&& s1.charAt(i)<'9')
					iCount++;
				
			
			iSum+=Integer.parseInt(String.valueOf(s1.charAt(i)));
					
		}
			System.out.println(iSum);
		}}






