import java.util.*;
public class RepUpp {
	public static void main(String arf[])
	{
		Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
		char cAr[]=str.toCharArray();
		char ch2[]=new char[cAr.length];
		for(int i=0;i<cAr.length;i++)
		{
			int count=0;
			for(int k=0;k<cAr.length;k++)
			{
				if(cAr[i]==cAr[k])
				{
					count++;
				}
				if(count>=2)
				{
					ch2[i]=Character.toUpperCase(cAr[i]);
				}
				else	
					ch2[i]=cAr[i];
				
			}
			
		}
		String sb=new String(ch2);
		System.out.println(ch2);
	}

}
