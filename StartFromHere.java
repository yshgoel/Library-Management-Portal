import java.util.*;
import java.io.*;

import javafx.css.StyleableStringProperty;

class first extends Store
{
    
    // static ArrayList<Book> books = new ArrayList<Book>();
    // static ArrayList<Student> students = new ArrayList<Student>();
    
    //static int  p =0;
    //  static void addBooks() throws IOException
    // {
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("\t------ ADD BOOKS ------\n");
    
    //     Book b = new Book();
    //     System.out.println("Enter Book id");
    //     b.book_id=sc.nextInt();
    //     sc.nextLine();
    //     System.out.println("Enter Book name");
    //     b.book_name=sc.nextLine();
    //     System.out.println("Enter Book price");
    //     b.book_price=sc.nextInt();
    //     System.out.println("Enter quantity");
    //     b.book_quantity=sc.nextInt();
    //     books.add(b);

    //     FileWriter writer = new FileWriter("All Books.txt"); 
    //     writer.write(String.valueOf(b.book_id) + "\t" + b.book_name + "\t" + String.valueOf(b.book_price) + "\t" + String.valueOf(b.book_quantity) + "\n");
    //     writer.close();

    //     System.out.println();

    // }
    // static void viewBooks()
    // {
    //     System.out.println("\t------ VIEW BOOKS ------\n");
    //     for(int i=0;i<books.size();i++)
    //     System.out.println(books.get(i).book_name + "\t" + books.get(i).book_price + "\t" + books.get(i).book_quantity + "\t" + books.get(i).book_id);
    //     System.out.println();
    // }
    // static void issueBooks()
    // {
    //    System.out.println("\t------ ISSUE BOOKS ------\n");
    //    Scanner sc= new Scanner(System.in);
    //    Student s = new Student();
    //    System.out.println("enter book id");
    //    int id=sc.nextInt();
    //    sc.nextLine();
      
    //    for(int i=0;i<books.size();i++)
    //    {
    //        if(id==books.get(i).book_id)
    //        {
    //            s.book_id=id;

    //            System.out.println("enter student name");
    //            s.student_name=sc.nextLine();
    //            System.out.println("enter student id");
    //            s.student_id=sc.nextInt();
    //            students.add(s);

    //            books.get(i).book_quantity--;

    //            System.out.println("Book Issued Successfully \n");
    //            break;
    //        }
    //    }
        

    // }
    // static void viewIssuedBooks()
    // {
    //     System.out.println("\t------ VIEW ISSUED BOOKS ------\n");
    //     for(int i=0;i<students.size();i++)
    //     System.out.println(students.get(i).book_id + "\t" + students.get(i).student_name + "\t" + students.get(i).student_id);
    //     System.out.println();

    // }
    // static void returnBooks()
    // {
    //     System.out.println("\t------ RETURN BOOKS ------\n");
    //     Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter book id to be returned");
    //     int id=sc.nextInt();
    //     for(int i=0;i<students.size();i++)
    //    {
    //        if(id==students.get(i).book_id)
    //        {
    //            students.remove(i);
    //            for(int j=0;j<books.size();j++)
    //             {
    //                  if(id==books.get(j).book_id)
    //                 {
    //                      books.get(j).book_quantity++;
    //                      break;
    //                 }
    //             }
    //             System.out.println("Book Returned Successfully\n");
    //             break;
    //         }
    //     }

    // }
    public static void main(String args[])  throws Exception
    {
        
        //FileWriter f = new FileWriter("test1.txt");
        int ch;
        while(true)
        {

            System.out.println("\t------ LIBRARY MANAGEMENT PORTAL ------");
            
            Scanner sc= new Scanner(System.in);
            System.out.println("1 add book");
            System.out.println("2 view books");
            System.out.println("3 issue book");
            System.out.println("4 view issued books");
            System.out.println("5 return book");
            System.out.println("6 exit");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                AddBooks.addBooks();
                //addBooks();
                break;

                case 2:
                ViewBooks.viewBooks();
                break;

                case 3:
                IssueBooks.issueBooks();
                break;

                case 4:
                ViewIssuedBooks.viewIssuedBooks();
                //viewBooks();
                break;

                case 5:
                ReturnBooks.returnBooks();
                //viewIssuedBooks();
                // viewBooks();
                break;
                
                case 6:
                System.exit(0);

                default :
                System.out.println("Wrong Input");
                

            }
       }
        
    }
}

// class Book{
   
//    String book_name;
//    int book_price;
//    int book_quantity;
//    int book_id;
// }

// class Student extends Book{
//     String student_name;
//     int student_id;
// }