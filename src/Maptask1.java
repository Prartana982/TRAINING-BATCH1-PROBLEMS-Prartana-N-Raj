import java.util.*;

public class Maptask1 {
    public static void main(String[] args)
    {
    Map<Integer,Integer> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int n= sc.nextInt();
    for(int i=0;i<n;i++)
    {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        map.put(id,marks);
    }
    for(int num: map.keySet())
    {
        System.out.print(num+" -> "+map.get(num)+"\n");
    }
    System.out.print("Enter id and marks of one more student: \n");
    System.out.print("Enter student ID: ");
    int id1 = sc.nextInt();
    System.out.print("Enter marks: ");
    int marks1=sc.nextInt();
    map.put(id1,marks1);
    System.out.print("New added record: \n");
    System.out.print(id1+" -> "+map.get(id1)+"\n");
    System.out.print("Enter roll no. to search marks: ");
    int h= sc.nextInt();
    System.out.print(h+" -> "+map.getOrDefault(h,0)+"\n");
    System.out.print("enter roll no and mark to be replaced: \n");
    System.out.print("Enter roll no:");
    int m=sc.nextInt();
    System.out.print("Enter marks: ");
    int s = sc.nextInt();
    map.replace(m,map.get(m),s);
    System.out.print("Updated details: "+m+" -> "+s+"\n");
    int maxval=0;
    int sum1=0;
    for(int num:map.values())
    {
        sum1+=num;
        maxval=Math.max(maxval,num);
    }
    System.out.print("Highest marks: "+maxval+"\n");
    for(int num: map.keySet())
    {
        if(map.get(num)>75)
        {
            System.out.print(num+" -> "+map.get(num)+"\n");
        }
    }
    System.out.print("Average marks: "+sum1/map.size()+"\n");
    System.out.print(map.containsKey(111));



} }
