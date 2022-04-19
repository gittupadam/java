import java.util.Scanner;

class Sphere extends Shape
{
    public double area()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("RADIUS OF THE SPHERE : ");
        Double r = s.nextDouble();
        return(4*3.14*r*r);
    }
}