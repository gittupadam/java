import java.util.Scanner;

class Cylinder extends Shape
{
    public double area()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("RADIUS OF CYLINDER : ");
        Double r = s.nextDouble();
        System.out.println("HEIGHT OF CYLNDER : ");
        Double h = s.nextDouble();
        return(3.14*r*r*h);
    }
}