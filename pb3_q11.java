import java.util.*;
class Complex
{
     int real,imaginary;
    public Complex(int r,int i)
    {
        real = r;
        imaginary = i;
    }
    public Complex()
    {
        real = 0;
        imaginary = 0;
    }
    public void setReal(int real)
    {
        this.real = real;
    }
    public void getReal()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Real part : ");
        real = s.nextInt();
    }
    public void setImaginary(int imaginary)
    {
        this.imaginary = imaginary;
    }
    public void getImaginary()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Imaginary part : ");
        imaginary = s.nextInt();
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
