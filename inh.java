public class inh {
    void print(){
        System.out.println("INH");
    }
}
class wwe extends inh{
    void print(String s){
        System.out.println("WWE");
    }
}
class Main{
    public static void main(String[] args) {
        inh g = new wwe();
        g.print();
    }
}
