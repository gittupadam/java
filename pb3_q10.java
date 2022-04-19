import java.util.*;
class pb3_q10
{
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        int choice;
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int[][] set = {{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31},
         {2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31},
         {4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31},
         {8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31},
         {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}};
        for(int i=0;i<5;++i)
        {
            for(int j=0;j<16;++j)
            {
                System.out.print(set[i][j]+" ");
            }
            System.out.println();
            System.out.print("Is your birthday in this set ?(0-No, 1-Yes) ");
            choice = s.nextInt();
            if(choice == 1)
            {
                if(result.size()==0 )
                {
                    for(int k=0;k<16;++k)
                    {
                        result.add(set[i][k]);
                    }
                }
                else
                {
                    for(int k=0;k<16;++k)
                    {
                        if(result.contains(set[i][k]))
                        {
                            temp.add(set[i][k]);
                        }
                    }
                    result = temp;
                }
            }
            System.out.println("YOUR BIRTHDAY MIGHT BE IN: ");
           for(int l=0;l<result.size();++l)
           {
               System.out.print(result.get(l));
           }
        }
    }
}