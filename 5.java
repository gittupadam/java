import java.util.Scanner;

class Rectangle extends Shape
{
    public double area()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("LENGTH OF THE RECTANGLE : ");
        Double l = s.nextDouble();
        System.out.println("BREADTH OF THE RECTANGLE : ");
        Double b = s.nextDouble();
        return(l*b);
    }
}