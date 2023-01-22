import java.util.*;

public class Sum 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.print("ENTER SIZE OF ARRAY: ");
        n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        //Enhanced for loop
        int sum=0;
        for(int nu: arr)
        {
            sum+=nu;
        }
        System.out.println("SUM OF ARRAY ELEMENTS: "+sum);
    }    
}
