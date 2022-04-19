import java.util.*;
class Polynomial
{
    int a,b,c;
    public Polynomial(int x,int y,int z)
    {
        a =x;
        b =y;
        c =z;
    }
    public Polynomial()
    {
        a =0;
        b = 0;
        c = 0;
    }

    public void setA()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("a : ");
        a = s.nextInt();
    }

    Complex add(Complex c)
    {
        Complex r = new Complex();
        r.real = real + c.real;
        r.imaginary=imaginary+c.imaginary;
        return r;
    }
    Complex subtract(Complex c)
    {
        Complex r = new Complex();
        r.real = real - c.real;
        r.imaginary= imaginary- c.imaginary;
        return r;
    }

}
class pb3_q11
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Complex c1 = new Complex();
        System.out.println("COMPLEX NUMBER 1 : ");
        c1.getReal();
        c1.getImaginary();
        Complex c2 = new Complex();
        System.out.println("COMPLEX NUMBER 2 : ");
        c2.getReal();
        c2.getImaginary();
        Complex r = c1.add(c2);
        System.out.println("ADDITION OF COMPLEX NUMBER : ");
        System.out.println(r.real+" + "+"i"+r.imaginary);
        System.out.println("SUBTRACTION OF COMPLEX NUMBER : ");
        Complex rr = c1.subtract(c2);
        System.out.println(rr.real+" + "+"i"+rr.imaginary);
    }
}


