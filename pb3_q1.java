import java.util.*;
import java.lang.*;
class pb3_q1
{
    public static void main(String ar[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("NUMBER OF ELEMENTS : ");
        n = s.nextInt();
        System.out.print("ENTER THE ELEMENTS : ");
        int arr[] = new int[n];
        for(int i=0;i<n;++i)
        {
            arr[i]=s.nextInt();
        }
        int min = 10000;
        int index = -1;
        for(int i=0;i<n-1;++i)
        {
            if(Math.abs(arr[i+1]-arr[i]) < min)
            {
                min = Math.abs(arr[i+1]-arr[i]);
                index = i;
            }
        }
        System.out.println("MINIMUM DISTANCE IS "+min+" AT INDEX "+index);
    }
}