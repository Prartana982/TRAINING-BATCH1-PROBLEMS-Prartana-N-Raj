package training;

import java.util.*;

interface Borrowable
{
	public void borrowItem();
	public void returnItem();
}
abstract class LibraryItem 
{
	String title;
	int itemId;
	boolean isAvailable;
	String type;
	LibraryItem(String title, int itemId, boolean isAvailable,String type)
	{
		this.title=title;
		this.itemId=itemId;
		this.isAvailable=isAvailable;
		this.type=type;
	}
	abstract void getLoanPeriod();
	
	
}
class Book extends LibraryItem implements Borrowable
{
	Book(String title,int itemId,boolean isAvailable)
	{
		super(title,itemId,isAvailable,"Book");
	}
	@Override
	public void getLoanPeriod()
	{
		System.out.print("Loan Period for Book: 4 weeks\n");
	}
	@Override
	public void borrowItem()
	{
	    if(isAvailable)
	    {
	        isAvailable = false;
	        System.out.println("Borrowed book: " + title);
	    }
	    else
	    {
	        System.out.println("Book is already borrowed.");
	    }
	}
	public void returnItem()
	{
		isAvailable=true;
		System.out.print("Book returned\n");
	}
	
}
class Magazine extends LibraryItem
{
	Magazine(String title, int itemId,boolean isAvailable)
	{
		super(title,itemId,isAvailable,"Magazine");
	}
	
	
	public void getLoanPeriod()
	{
		System.out.print("Magazine cannot be loaned");
	}
}
class DVD extends LibraryItem implements Borrowable
{
	DVD(String title, int itemId, boolean isAvailable)
	{
		super(title,itemId,isAvailable,"DVD");
	}
	
	public void getLoanPeriod()
	{
		System.out.print("Loan Period : 1 week\n" );
	}
	public void borrowItem()
	{
		if(isAvailable)
        {
            isAvailable = false;
            System.out.println("Borrowed DVD: " + title);
        }
        else
        {
            System.out.println("DVD is already borrowed.");
        }
	}
	public void returnItem()
	{
		isAvailable=true;
		System.out.print("Returned DVD\n");
	}
}
class Librarian
{
	List<LibraryItem> list = new ArrayList<>();
	void add(LibraryItem item)
	{
		list.add(item);
	}
	void display()
	{
		for(LibraryItem item:list)
		{
			System.out.print("Title: "+item.title+"\n");
			System.out.print("ItemId: "+item.itemId+"\n");
			System.out.print("Availability Status: "+item.isAvailable+"\n");
			System.out.print("Type: "+item.isAvailable+"\n");
			item.getLoanPeriod();
			
		}
	}
	
}
public class Task1Tuesday {

	public static void main(String[] args) {
		Book b=new Book("Introduction to Python",121,true);
		Magazine m= new Magazine("The daily bugle",131,true);
		DVD d=new DVD("The Matrix",432,true);
		Librarian librarian=new Librarian();
		librarian.add(b);
		librarian.add(m);
		librarian.add(d);
		System.out.print("Library items:\n");
		librarian.display();
			
		librarian.add(b);
		librarian.add(m);
		librarian.add(d);
		b.borrowItem();
		d.borrowItem();
		b.returnItem();
		d.returnItem();
		
	}

}
