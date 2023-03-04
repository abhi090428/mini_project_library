package library;

import java.util.Scanner;
 
public class book {
	
	public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;
 
    Scanner ob = new Scanner(System.in);

    public book()
    {
        System.out.println("Enter Serial No of Book:");
        this.sNo = ob.nextInt();

        System.out.println("Enter Book Name:");
        this.bookName = ob.next();
 
        System.out.println("Enter Author Name:");
        this.authorName = ob.next();
 
        System.out.println("Enter Quantity of Books:");
        this.bookQty = ob.nextInt();
        bookQtyCopy = this.bookQty;

    }
}

