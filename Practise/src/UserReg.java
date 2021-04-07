
import java.util.*;
class InvalidException extends Exception
{
    InvalidException(String s)
    {
        super (s);
    }
}
public class UserReg
{
    void regUser(String username,int userage)
    {
        try {
            if(userage>=18 && userage<60)
        {
            System.out.println("ok");
        }
        else
        {
            throw new InvalidException("Not possible");
        }
            
        } catch(InvalidException e) {
            System.out.println(e.getMessage());
        }
        
    }

	public static void main(String[] args) {
	    {
	        Scanner sc=new Scanner(System.in);
	        String username=sc.nextLine();
	        int userage=sc.nextInt();
	        UserReg u=new UserReg();
	        u.regUser(username,userage);
	    }
		
	}
}
