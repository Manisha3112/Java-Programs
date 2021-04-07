import java.util.*;
class Stu{
	String name;
	int roll;
	String dept;
	double cgpa;
	Stu(String n,int r,String d,double c)
	{
	 name=n;
	 roll=r;
	 dept=d;
	 cgpa=c;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(roll);
		System.out.println(dept);
		System.out.println(cgpa);
		
	}
}
class StudentInfo {
	public static void main(String arf[])
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String d=sc.nextLine();
		int r=sc.nextInt();
		double c=sc.nextDouble();
		Stu s1=new Stu(n,r,d,c);
		s1.display();
		
	}

}
