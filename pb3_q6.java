import java.util.*;
class pb3_q6{
    public static void main(String str[])
    {
        //perfect numbers
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int num = s.nextInt();
        int sum = 0;
        for(int i=1;i<num;++i)
        {
            if(num%i == 0)
            {
                sum+=i;
            }
        }
        if(sum ==num)
        {
            System.out.println("PERFECT NUMBER");
        }
        else
            System.out.println("NOT A PERFECT NUMBER");
    }
}