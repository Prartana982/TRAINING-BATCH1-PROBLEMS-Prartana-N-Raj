import java.util.*;
public class Frequency {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string in lowercase: ");
        String k=sc.nextLine();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<k.length();i++)
        {
            char ki = k.charAt(i);
            char p =Character.toLowerCase(ki);
            map.put(p,map.getOrDefault(p,0)+1);
        }
        for(char l:map.keySet())
        {
            System.out.print(l+" -> "+map.get(l)+"\n");
        }

    }
}
