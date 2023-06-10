package rec;

/**
 * recc
 */
public class recc {

      static int factorial(int n){      
          if (n == 1)      
            return 1;      
          else      
            return(n * factorial(n-1));      
    }      
  
// public static void main(String[] args) {  
// System.out.println("Factorial of 5 is: "+factorial(5));  
// int[] a = new int[]{10,20,40};
// }  
}
class recursion 
    {
        int func (int n) 
        {
            int result;
            if (n == 1)
                return 1;
            result = func (n - 1) + n;
            return result;
        }
    } 
    // class Output 
    // {
    //     public static void main(String args[]) 
    //     {
    //         recursion obj = new recursion() ;
    //         System.out.print(obj.func(5));
    //     }
    class Bike{  
  void run(){System.out.println("running");}  
  void hi(){
    System.out.println("hi");
  }
}  
class Splendor extends Bike{  
  void run(){System.out.println("running safely with 60km");} 
  void bye(){
    System.out.println("bye");
  } 

  public static void main(String args[]){  
    Bike b = new Splendor();//upcasting  
    
    b.run(); 
    b.hi();
    // b.bye();
  }  
}  