import java.util.*;
public class SumNonDiagona {
	
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            int iR=sc.nextInt();
            int iC=sc.nextInt();
            int a[][]=new int[iR][iC];
            
            for(int i=0;i<iR;i++)
                for(int j=0;j<iC;j++){
                   
                    a[i][j]=sc.nextInt();
                }
            
                int s1=0,s2=0,s3=0,s4=0;
                for(int i=0;i<iR;i++)
                    for(int j=0;j<iC;j++)
                        if(i<j && i+j<iR-1)
                            s1+=a[i][j];
                for(int i=0;i<iR;i++)
                    for(int j=0;j<iC;j++)
                        if(i<j && i+j>iR-1)
                            s2+=a[i][j];
                for(int i=0;i<iR;i++)
                    for(int j=0;j<iC;j++)
                        if(i>j && i+j>iR-1)
                            s3+=a[i][j];
                for(int i=0;i<iR;i++)
                    for(int j=0;j<iC;j++)
                        if(i>j && i+j<iR-1)
                            s4+=a[i][j];
                System.out.println("s1:"+s1);
                System.out.println("s2:"+s2);
                System.out.println("s3:"+s3);
                System.out.println("s4:"+s4);
            }
        
    

}
