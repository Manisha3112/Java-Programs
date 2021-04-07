import java.util.*;
public class RemChar {
	public static void main(String af[])
	{
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char[] cs1=s1.toCharArray();
		char[] cs2=s2.toCharArray();
     Set<Character>s1s=new TreeSet<>();
     Set<Character>s2s=new TreeSet<>();
     for(char c:cs1)
     {
    	 s1s.add(c);
     }
     for(char c:cs2)
     {
    	 s2s.add(c);
     }
     s1s.retainAll(s2s);
     
		
				System.out.print(s2s);
		

	}

}
