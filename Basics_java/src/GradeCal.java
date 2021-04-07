import java.util.*;
public class GradeCal {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int iN=sc.nextInt();
		if(iN>=90 && iN<=100)
		{
			System.out.println("A grade");
		}
		else if(iN>=80 && iN<=89)
		{
			System.out.println("B grade");
		}
		else if(iN>=70 && iN<=79)
		{
			System.out.println("C grade");
		}
		else if(iN>=60 && iN<=69)
		{
			System.out.println("D grade");
		}
		else if(iN>=50 && iN<=59)
		{
			System.out.println("E grade");
		}
		else
		{
			System.out.println("F grade");
		}
	}

}
