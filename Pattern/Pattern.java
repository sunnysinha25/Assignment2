import java.util.Scanner;

public class Pattern 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,sp;    
        System.out.print("ENTER THE NUMBER OF ROWS: ");
        n=in.nextInt();
        for(i=n;i>=1;i--)
        {
            for(sp=0;sp<n-i;sp++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
