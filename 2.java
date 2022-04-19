import java.util.*;
class Bank_account //Bank account class
{
    double balance;
   /* Bank_account(double b)
    {
        balance = b;
    }*/
    public void find_balance()
    {
        System.out.println("Bank Account Balance "+balance);
    }
}
/*class Saving_account
{

    public void find_balance()
    {
        System.out.println("Balance Savings Account "+ balance);
    }
}
class Current_account
{
    public void find_balance()
    {
        System.out.println("Balance Current Account "+balance);
    }
}
class Fixed_deposit
{
    public void find_balance()
    {
        System.out.println("Balance Fixed Deposit "+balance);
    }
}*/
class pb4_q1
{
    public static void main(String arg[])
    {
        Bank_account b1 = new Bank_account();
        /*Saving_account s1 = new Saving_account();
        Current_account c1 = new Current_account();
        Fixed_deposit f1 = new Fixed_deposit();*/
        b1.find_balance();
    }
}
