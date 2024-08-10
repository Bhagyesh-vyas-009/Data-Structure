import java.util.*;
import java.math.*;
class Area
{

    public static void main(String[] args)
    {

        float r;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius : ");
        r=sc.nextFloat();

        System.out.print("Area of circle = "+(Math.PI)*r*r);

    }
}