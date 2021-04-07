import java.util.*;
public class Roman {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String n=sc.next();
             int res=0;
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(c=='x')
                if(n.charAt(i)=='i')
                    res+=9;
                else
                res+=10;
            if(c=='v')
                if(n.charAt(i)=='i')
                    res+=4;
                else
                res+=5;
            if(c=='i')
                res+=1;
        }
        for(int i=0;i<n.length()-1;i++){
            if(n.charAt(i)=='i')
                if(n.charAt(i+1)=='x')
                    res-=2;
                if(n.charAt(i+1)=='v')
                    res-=2;
        }
        System.out.println(res);
    } 
}