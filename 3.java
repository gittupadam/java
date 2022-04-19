import java.util.*;
class PurchaseItem
{
     double unitPrice;
     String Name;
    PurchaseItem()
    {
        Name = "";
        unitPrice = 0.0;
    }
    PurchaseItem(String n,double p)
    {
        Name = n;
        unitPrice = p;
    }
    double getPrice()
    {
        return unitPrice;
    }
    String retToString()
    {
        return (Name+" @ "+unitPrice);
    }
}

class WeighedItem extends PurchaseItem
{
    private double weight;
    WeighedItem(double wei)
    {
        weight = wei;
    }
    double getPrice()
    {
        return weight*unitPrice;
    }
    String RetToString()
    {
        return (weight+" Kg\t"+weight*unitPrice);
    }
}

class CountedItem extends PurchaseItem
{
    private int quantity;
    CountedItem(int q)
    {
        quantity = q;
    }
    double getPrice()
    {
        return quantity*unitPrice;
    }
    String RetToString()
    {
        return quantity+" units\t"+(quantity*unitPrice);
    }
}

class pb4_q5
{
    static public void main(String[] args)
    {
        PurchaseItem p = new PurchaseItem("Banana",3.0);
        WeighedItem w = new WeighedItem(1.47);
        CountedItem c = new CountedItem(10);
        System.out.println(p.getPrice());
        System.out.println(p.retToString());

    }
}