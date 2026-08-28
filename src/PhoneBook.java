import java.util.*;
public class PhoneBook {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<String, String> contacts = new HashMap<>();
        System.out.print("Enter number of contacts: ");
        int n =sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter name: ");
            String s = sc.nextLine();
            System.out.print("Phone number: ");
            String ph = sc.nextLine();
            contacts.put(s,ph);
        }
        System.out.print("Contacts in phonebook\n");
        for(String a : contacts.keySet())
        {
            System.out.print(a+" -> "+contacts.get(a)+"\n");
        }
        System.out.print("Enter contact to be searched: ");
        String g=sc.nextLine();
        System.out.print(g+" -> "+contacts.get(g)+"\n");
        System.out.print("Enter name whose phone number is to be updated: ");
        String y = sc.nextLine();
        System.out.print("Enter new phone number to be added: ");
        String ph= sc.nextLine();
        contacts.put(y,ph);
        System.out.print("Contact updated\n");
        System.out.print("Enter name to check:");
        String r = sc.nextLine();
        System.out.print(contacts.containsKey(r)+"\n");
        System.out.print("Enter phone number to check:");
        String f = sc.nextLine();
        System.out.print(contacts.containsValue(f));

    }
}
