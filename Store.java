import java.util.*;
public class Store {
    
    static ArrayList<Book> books = new ArrayList<Book>();
    static ArrayList<Student> students = new ArrayList<Student>();
}

class Book{
   
    String book_name;
    int book_price;
    int book_quantity;
    int book_id;
 }
 
 class Student extends Book{
     String student_name;
     int student_id;
 }