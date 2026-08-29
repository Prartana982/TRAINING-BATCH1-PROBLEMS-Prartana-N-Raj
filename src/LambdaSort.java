import java.util.*;
class Product1
{
    String category;
    String prodname;
    int price;
    public Product1(String category, String prodname, int price)
    {
        this.category=category;
        this.prodname=prodname;
        this.price=price;
    }



}
public class LambdaSort {
    public static void main(String[] args)
    {
        List<Product1> ls = new ArrayList<>();
        Product1 p1 = new Product1("Electronics","Laptop",100000);
        Product1 p2 = new Product1("Furniture","Dining table set",120000);
        Product1 p3 = new Product1("Sports","Gear bike",75000);
        Product1 p4 = new Product1("Apparel","T-shirts",3000);
        Product1 p5 = new Product1("Electronics","PlayStation",200000);
        ls.add(p1);
        ls.add(p2);
        ls.add(p3);
        ls.add(p4);
        ls.add(p5);
        Collections.sort(ls, new Comparator<Product1>()  {
            @Override
            public int compare(Product1 o1, Product1 o2) {
                return o1.price - p2.price;
            }
        });
        for(Product1 p: ls)
        {
            System.out.print("Product category: "+ p.category+"\n");
            System.out.print("Product name: "+p.prodname+"\n");
            System.out.print("Product Price: "+p.price+"\n");
        }




    }
}
