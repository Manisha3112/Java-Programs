import java.util.*;
public class RevWithoutChangingDig {
	public static void main(String arf[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int k=ch.length-1;
		int temp=0;
		while(temp<k)
		{
		if(!Character.isAlphabetic(ch[temp]))
			temp++;
		else if(!Character.isAlphabetic(ch[k]))
			k++;
		else
		{
			char fl=ch[temp];
		    ch[temp]=ch[k];
		    ch[k]=fl;
		    temp++;k--;
			
				}
			}
   String val=new String(ch);
   System.out.println(val);
		
		
			
	}

}
