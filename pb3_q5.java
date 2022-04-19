import java.util.*;
class pb3_q5
{
    public static void main(String str[])
    {
        //BUBBLE SORT
        Scanner s = new Scanner(System.in);
        System.out.println("NUMBER OF ELEMENTS : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;++i)
        {
            arr[i] = s.nextInt();
        }
        //sorting algorithm
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n-i-1;++j)
            {
                if(arr[j]> arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int k=0;k<n;++k)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }

    }
}
