import java.util.*;
public class RemovePunct {
	public static void main(String at[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				temp+=str.charAt(i);
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				temp+=str.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
