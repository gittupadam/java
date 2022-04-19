import java.util.*;

class pb3_q2
{
    public static void main(String arg[])
    {
        int n,m;
        Scanner s = new Scanner(System.in);
        System.out.println("NUMBER OF ELEMENTS IN ARRAY1 : ");
        n = s.nextInt();
        int[] arr1 = new int[n];
        System.out.println("ENTER THE ARRAY1 ELEMENTS : ");
        for(int i=0;i<n;++i)
        {
            arr1[i] = s.nextInt();
        }

        System.out.println("NUMBER OF ELEMENTS IN ARRAY2 : ");
        m = s.nextInt();
        int[] arr2 = new int[m];
        System.out.println("ENTER THE ARRAY2 ELEMENTS : ");
        for(int i=0;i<m;++i)
        {
            arr2[i] = s.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("COMMON ELEMENTS  :");
        //FIND THE COMMON ELEMENTS BETWEEN TWO ARRAYS
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                if(arr2[j]>arr1[i])
                    break;
                else if(arr2[j] == arr1[i])
                {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
