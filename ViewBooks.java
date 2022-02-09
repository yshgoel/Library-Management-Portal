import java.util.*;
import java.io.*;
public class ViewBooks extends Store
{
    static void viewBooks()
    {
        System.out.println("\t------ VIEW BOOKS ------\n");
        for(int i=0;i<books.size();i++)
        System.out.println(books.get(i).book_name + "\t" + books.get(i).book_price + "\t" + books.get(i).book_quantity + "\t" + books.get(i).book_id);
        System.out.println();
    }
    
}