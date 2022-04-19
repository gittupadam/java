import java.util.*;
class pb3_q4{
    public static void main(String str[]) {
        int[] arr = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int numb = s.nextInt();
        for (int i = 0; i < 10; ++i)
        {
            arr[i] = (i+1)*numb;
        }
        for(int i=0;i<10;++i)
        {
            System.out.println(i+1 + " * "+numb+" = "+arr[i]);
        }
    }
}