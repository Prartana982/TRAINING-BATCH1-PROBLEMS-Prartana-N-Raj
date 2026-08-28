import java.util.*;
public class Supermarket {
    public static void main(String[] args)
    {
        Map<String, Double> cart = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter product name: ");
            String prod = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            cart.put(prod,price);
        }
        double sum1=0;
        double maxex=0;
        System.out.print("Items in cart: \n");

        for(String a: cart.keySet())
        {
            sum1+=cart.get(a);
            maxex = Math.max(cart.get(a),maxex);
            System.out.print(a+" -> "+cart.get(a)+"\n");

        }
        System.out.print("Enter product and price to be removed: \n");
        String name =sc.nextLine();
        double price = sc.nextDouble();
        sc.nextLine();
        cart.remove(name,price);
        System.out.print("Item removed\n");
        System.out.print("Enter product name whose price is to be updated: \n");
        System.out.print("Enter product name: ");
        String u=sc.nextLine();
        System.out.print("Enter new price: ");
        double k =sc.nextDouble();
        sc.nextLine();
        cart.replace(u,k);
        System.out.print("Total cart value: "+sum1+"\n");
        System.out.print("Most expensive item price: "+maxex+"\n");


    }
}
