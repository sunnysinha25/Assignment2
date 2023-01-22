import java.util.*;

public class Rectangle 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        float length, breadth, area;
        System.out.print("ENTER LENGTH OF RECTANGLE: ");
        length=in.nextFloat();   
        System.out.print("ENTER BREADTH OF RECTANGLE: ");
        breadth=in.nextFloat();
        
        //Computing area of Rectangle
        area=length*breadth;
        System.out.println("AREA OF GIVEN RECTANGLE IS: "+area+" square units.");
    }    
}
