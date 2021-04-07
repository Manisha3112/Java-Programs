import java.util.*;
public class galSta {
	
	
	    public static void main(String arg[])
	    {
	        Scanner sc=new Scanner(System.in);
	        int iN,x1;
	        iN=sc.nextInt();
	        char x[][]=new char[3][iN];
	        for(int i=0;i<3;i++)
	            for(int j=0;j<iN;j++)
	                x[i][j]=sc.next().charAt(0);
	        for(int i=0;i<iN;i++){
	            if(x[0][i]=='#' && x[1][i]=='#' && x[2][i]=='#')
	                System.out.print('#');
	            else{
	                char f,s,c,a1,b1,c1,a2,b2,c2;
	                x1 = i;
	                f = x[0][x1];
	                s = x[0][x1+1];
	                c = x[0][x1+2];
	                a1 = x[1][x1];
	                b1 = x[1][x1+1];
	                c1 = x[1][x1+2];
	                a2 = x[2][x1];
	                b2 = x[2][x1+1];
	                c2 = x[2][x1+2];
	                if(f=='.' && s=='*' && c=='.' && a1=='*' && b1=='*' && c1=='*' && a2=='*' && b2=='.' && c2=='*'){  		
	                    System.out.print("A");
	                    i = i + 2;
	                }
	                if(f=='*' && s=='*' && c=='*' && a1=='*' && b1=='*' && c1=='*' && a2=='*' && b2=='*' && c2=='*'){  		
	                    System.out.print("E");
	                    i = i + 2;
	                }
	                if(f=='*' && s=='*' && c=='*' && a1=='.' && b1=='*' && c1=='.' && a2=='*' && b2=='*' && c2=='*'){  		
	                    System.out.print("I");
	                    i = i + 2;
	                }
	                if(f=='*' && s=='*' && c=='*' && a1=='*' && b1=='.' && c1=='*' && a2=='*' && b2=='*' && c2=='*'){  		
	                    System.out.print("O");
	                    i = i + 2;
	                }
	                if(f=='*' && s=='.' && c=='*' && a1=='*' && b1=='.' && c1=='*' && a2=='*' && b2=='*' && c2=='*'){  		
	                    System.out.print("U");
	                    i = i + 2;
	                }
	            }
	        }
	    }
	
}
