import java.util.*;
class pb3_q8
{
    public static void main(String arg[])
    {
        int c =1;
        Scanner s= new Scanner(System.in);
        System.out.print("Number of lines : ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" 3"+ c);
            }
            System.out.println();
        }
    }
}