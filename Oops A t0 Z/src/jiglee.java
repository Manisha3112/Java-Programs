import java.util.Scanner;
class dog{
	String name;
	int age;
	dog(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

 static void old(dog[] d1)
{
	for(int i=0;i<d1.length;i++)
	{
		for(int j=i+1;j<d1.length;j++)
		{
			for(int k=j+1;k<d1.length;k++)
				{
				if(d1[i].age>d1[j].age && d1[i].age>d1[k].age)
				
					System.out.println(d1[i].age);
				
				else if(d1[j].age>d1[i].age && d1[j].age>d1[k].age)
					
					System.out.println(d1[j].age);
				else
					System.out.println(d1[k].age);
				}
				
				
		}
	}
}
class jiglee {
	 public void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		dog Scooby=new dog(s.next(),s.nextInt());
		dog jerry=new dog(s.next(),s.nextInt());
		dog jii=new dog(s.next(),s.nextInt());
		dog d1[]= {Scooby,jerry,jii};
	    dog.old(d1);
	}
}
}

