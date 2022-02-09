import java.util.*;
import java.io.*;
public class ViewIssuedBooks extends Store
{
    static void viewIssuedBooks()
    {
        System.out.println("\t------ VIEW ISSUED BOOKS ------\n");
        for(int i=0;i<students.size();i++)
        System.out.println(students.get(i).book_id + "\t" + students.get(i).student_name + "\t" + students.get(i).student_id);
        System.out.println();

    }
    
}
