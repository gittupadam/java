import java.util.*;
//MAGIC SQUARE MATRIX OR NOT
class pb3_q3
{
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print(" MATRIX SIZE : ");
        int n = s.nextInt();
        int[][]arr = new int[n][n];
        System.out.println("ENTER THE MATRIX ELEMENTS : ");
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                arr[i][j] = s.nextInt();
            }
        }

        // main diagonal
        int sum1=0,sum2=0,temp1=0,temp2=0;
        for(int i=0;i<n;++i)
        {
            sum1+=arr[i][i];
            sum2+=arr[i][n-1-i];
        }
        if(sum1 != sum2)
        {
            System.out.println("NOT A MAGIC SQUARE");
        }
        else
        {
            int ch=0;
            for(int i=0;i<n;++i)
            {
                for(int j=0;j<n;++j)
                {
                    temp1+=arr[i][j];
                    temp2+=arr[j][i];
                }
                if(temp1 != sum1 || temp2 !=sum1)
                {
                    ch = 1;
                    break;
                }
                temp1=0;
                temp2=0;
            }
            if(ch == 1)
                System.out.println("NOT A MAGIC SQUARE");
            else
            {
                System.out.println("MAGIC SQUARE");
                System.out.println("Sum is "+sum1+" < "+"n(n^2+1)/2 = "+n*(n*n + 1)/2 );
            }
        }


    }
}