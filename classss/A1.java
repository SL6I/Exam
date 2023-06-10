// package classss;

public class A1 {}
class Student{
    int rollno;
    String name;
    static String college = "ITS";
    
    static void change(){
    college = "BBDIT";
    }

    Student(int r, String n){
    rollno = r;
    name = n;
    }

    void display(){System.out.println(rollno+" "+name+" "+college);}
}
 class TestStaticMethod{
   public static void main(String args[]){
   Student.change();//calling change method
   //creating objects
   Student s1 = new Student(111,"Karan");
   Student s2 = new Student(222,"Aryan");
   Student s3 = new Student(333,"Sonoo");
   //calling display method
   s1.display();
   s2.display();
   s3.display();
   }
}
    // By reference variable:
    // class Student{  
    //     int id;  
    //     String name;  
    //    }  
    //    class TestStudent2{  
    //     public static void main(String args[]){  
    //      Student s1=new Student();  
    //      s1.id=101;  
    //      s1.name="Sonoo";  
    //      System.out.println(s1.id+" "+s1.name);//printing members with a white space  
    //     }  
    //    }  
    // By method
    // By constructor

