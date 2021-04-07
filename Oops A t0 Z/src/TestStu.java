 
class Student
{
	int id;
	String name;

void insertRec(int r,String n)
{
	id=r;
	name=n;
}
void displayRec()
{
	System.out.println(id+" "+name);
}

}
 class TestStu{
	 public static void main(String args[]){


	//Student s1=new Student();
	Student s2=new Student();
	//s1.insert(12,"Manisha");
	s2.insertRec(31,"Ram" );
	//s1.display();
	s2.displayRec();
}
 	 
}

