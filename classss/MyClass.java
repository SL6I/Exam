/**
 * A2
 */
 class A2 {}
 class Bike10{  
  
    //blank final variable  
   
    // Bike10(){  
    // speedlimit=70;  
    // System.out.println(speedlimit);  
    // }  
    
    public static void main(String args[]){  
    //   nn; 
    System.out.println(hi);
   }  
  }  
 public class MyClass {
    private int x;
    private int y;
    
    public MyClass() {
        this(0, 0);
        this.reset();
    }
    
    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void reset() {
        this.x = 0;
        this.y = 0;
        // call the other constructor to reset the fields to their default values
        new MyClass();
    }
}
class Animal{  
    Animal(){System.out.println("animal is created");}  
    }  
    class Dog extends Animal{  
    public Dog(){  
        // this();
    System.out.println("dog is created");  
    }  
     void hmm(){
        // this.Dog();
    }
    }  
    class TestSuper4{  
    // public static void main(String args[]){  
    
    // Dog d=new Dog();  
    
    }
class Address {
    
    String city,state,country;
    
    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
    
    }
    
    
     class Emp {
    int id;
    String name;
    Address address;
    
    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        //this.address=address;
    }
    
    void display(){
    System.out.println(id+" "+name);
    // System.out.println(address.city+" "+address.state+" "+address.country);
    }
    public void show(int x)
    {
        System.out.println("In int" + x);
    }
    public void show(String s)
    {
        System.out.println("In String" + s);
    }
    public void show(double b)
    {
        System.out.println("In byte" + b);}
    public static int add(double x, String y) {
        // return (int) x + y;
        return 10;
    }

    public static double add(String x, int y) {
        return y;
    }

    public static String add(String x, String y) {
        return x + y;
    }

    // public static void main(String[] args) {
// System.out.println(add(10,10));    // Address address1=new Address("gzb","UP","india");
    // Address address2=new Address("gno","UP","india");
    
    // Emp e=new Emp(111,"varun",address1);
    // Emp e2=new Emp(112,"arun",address2);
        
    // e.display();
    // e2.display();
        
    }
    
    

//     public static void main(String[] args) {
//         dog d = new dog();
//         d.m();
//     }
// }
// class Animal{
//     Animal(){}
//     Animal(int a){}
//     Animal(int y, int z){}
//     void m(){
//         System.out.println("ANIMAL");
//     }
// }
// class dog extends Animal{
//     dog(){}
//     dog(int x){su}
//     void m(){
        
//         System.out.println("dog");
//         super.m();

//     }
// }