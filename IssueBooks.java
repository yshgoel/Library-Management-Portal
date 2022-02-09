import java.util.*;
import java.io.*;
public class IssueBooks extends Store
{
    static void issueBooks()
    {
       System.out.println("\t------ ISSUE BOOKS ------\n");
       Scanner sc= new Scanner(System.in);
       Student s = new Student();
       System.out.println("enter book id");
       int id=sc.nextInt();
       sc.nextLine();
      
       for(int i=0;i<books.size();i++)
       {
           if(id==books.get(i).book_id)
           {
               s.book_id=id;

               System.out.println("enter student name");
               s.student_name=sc.nextLine();
               System.out.println("enter student id");
               s.student_id=sc.nextInt();
               students.add(s);

               books.get(i).book_quantity--;

               System.out.println("Book Issued Successfully \n");
               break;
           }
       }
    }   
    
}
