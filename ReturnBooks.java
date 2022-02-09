import java.util.*;
import java.io.*;
public class ReturnBooks extends Store 
{
    static void returnBooks()
    {
        System.out.println("\t------ RETURN BOOKS ------\n");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter book id to be returned");
        int id=sc.nextInt();
        for(int i=0;i<students.size();i++)
       {
           if(id==students.get(i).book_id)
           {
               students.remove(i);
               for(int j=0;j<books.size();j++)
                {
                     if(id==books.get(j).book_id)
                    {
                         books.get(j).book_quantity++;
                         break;
                    }
                }
                System.out.println("Book Returned Successfully\n");
                break;
            }
        }

    }
}
