import java.util.*;
import java.io.*;
public class AddBooks extends Store {

    
    public static void addBooks() throws Exception
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\t------ ADD BOOKS ------\n");
    
        Book b = new Book();
        System.out.println("Enter Book id");
        b.book_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book name");
        b.book_name=sc.nextLine();
        System.out.println("Enter Book price");
        b.book_price=sc.nextInt();
        System.out.println("Enter quantity");
        b.book_quantity=sc.nextInt();
        books.add(b);

        // FileWriter writer = new FileWriter("All Books.txt"); 
        // writer.write(String.valueOf(b.book_id) + "\t" + b.book_name + "\t" + String.valueOf(b.book_price) + "\t" + String.valueOf(b.book_quantity) + "\n");
        // writer.close();

        System.out.println();

    }
    
}
