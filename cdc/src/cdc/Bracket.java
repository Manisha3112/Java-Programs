package cdc;
import java.util.*;
public class Bracket {
	static boolean find(String str)
	{
		char[] iAr=str.toCharArray();
		for(int i=0;i<iAr.length;i++)
		{
		
			if(iAr[i]!='{'||iAr[i]!='}'||iAr[i]!=']'||iAr[i]!=')'||iAr[i]!='('||iAr[i]!=')') {
				return false;
			}
		}
		Stack<Character>at=new Stack<Character>();
		
		
		for(int i=0;i<iAr.length;i++)
		{
		
			if(iAr[i]=='['||iAr[i]=='('||iAr[i]=='{')
			at.push(iAr[i]);
			else if(iAr[i]==']'||iAr[i]==')'||iAr[i]=='}')
			{
				if(at.peek()=='['&& iAr[i]==']')
					at.pop();
				else if(at.peek()=='('&& iAr[i]==')')
					at.pop();
				else if(at.peek()=='{'&& iAr[i]=='}') 
					at.pop();
			}
		}
		return str.isEmpty();
			
		}
		
	
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(find(str));
	}
	}