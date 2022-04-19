import java.util.*;
class pb3_q9
{
    public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int n = s.nextInt();
        if(n == (Math.pow(n,2))%10 )
        {
            System.out.println("AUTOMORPHIC NUMBER");
        }
        else
        {
            System.out.println("NOT AN AUTOMORPHIC NUMBER");
        }
    }
}