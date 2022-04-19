import java.util.*;
class pb3_q7
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER A YEAR : ");
        int year = s.nextInt();
        if(year%400 ==0)
        {
            System.out.println("IT IS A LEAP YEAR");
        }
        else if(year%4 == 0)
        {
            System.out.println("IT IS A LEAP YEAR");
        }
        else
        {
            System.out.println("NOT A LEAP YEAR");
        }
    }
}
