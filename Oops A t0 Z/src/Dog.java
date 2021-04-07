import java.util.*;
class dg{
	String name;
	int age;
	dg(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

 static void old(dg arr[])
{
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			for(int k=j+1;k<arr.length;k++)
				{
				if(arr[i].age>arr[j].age && arr[i].age>arr[k].age)
				
					System.out.println(arr[i].age);
				
				else if(arr[j].age>arr[i].age && arr[j].age>arr[k].age)
					
					System.out.println(arr[j].age);
				else
					System.out.println(arr[k].age);
				}
				
				
		}
	}
}
class Dog {
	 void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		dg Scooby=new dg(s.next(),s.nextInt());
		dg jerry=new dg(s.next(),s.nextInt());
		dg jii=new dg(s.next(),s.nextInt());
		dg d1[]= {Scooby,jerry,jii};
	
		dg.old(d1);
	}
}
}