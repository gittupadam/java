import java.util.*;

abstract class Shape
{
    String shapeName;
    abstract double area();
    String retName()
    {
        return(shapeName);
    }
}

class pb4_q6
{
    public static void main(String arg[])
    {
        Sphere sp = new Sphere();
        sp.shapeName = "Sphere";
        System.out.print(sp.retName());
        System.out.println("AREA IS "+sp.area());

        Rectangle re = new Rectangle();
        re.shapeName = "Rectangle";
        System.out.print(re.retName());
        System.out.println("AREA IS "+re.area());

        Cylinder c = new Cylinder();
        c.shapeName = "Cylinder";
        System.out.print(c.retName());
        System.out.println("AREA IS "+c.area());

    }
}