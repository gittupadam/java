import java.util.*;

public class Driver{
    public static void main(String args[])
    {
        String x;
        double y, z;

        Scanner in = new Scanner(System.in);

        System.out.println("ITEM - 1:");
        System.out.print("Name: ");
        x = in.nextLine();
        System.out.print("Unit Price: ");
        y = in.nextDouble();
        System.out.print("Weight: ");
        z = in.nextDouble();

        PurchaseItem wi = new WeightItem(x, y, z);
        
        in.nextLine();
        
        System.out.println("\nITEM - 2:");
        System.out.print("Name: ");
        x = in.nextLine();
        System.out.print("Unit Price: ");
        y = in.nextDouble();
        System.out.print("Quantity: ");
        z = in.nextInt();

        PurchaseItem ci = new CountedItem(x, y, (int)z);

        System.out.println("\n" + wi);
        System.out.println(ci);
    }
}
class PurchaseItem{
    private String name;
    private double unitPrice;

    PurchaseItem(String x, double y)
    {
        name = x;
        unitPrice = y;
    }

    PurchaseItem()
    {
        this("no item", 0.0);
    }

    public double getPrice()
    {
        return unitPrice;
    }

    public void setPrice(double x)
    {
        unitPrice = x;
    }

    public void setName(String x)
    {
        name = x;
    }

    public String toString()
    {
        return name + "@" + unitPrice;
    }
}

class WeightItem extends PurchaseItem{
    private double weight;

    WeightItem(String x, double y, double z){
        super(x, y);
        weight = z;
    }

    public double getPrice()
    {
        return weight * super.getPrice();
    }

    public String toString()
    {
        return super.toString() + " " + weight + "kg " + this.getPrice() + "SR";
    }
}

class CountedItem extends PurchaseItem{
    private int quantity;

    CountedItem(String x, double y, int z){
        super(x, y);
        quantity = z;
    }

    public double getPrice()
    {
        return quantity * super.getPrice();
    }

    public String toString()
    {
        return super.toString() + " " + quantity + "units " + this.getPrice() + "SR";
    }
}