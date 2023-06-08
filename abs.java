public abstract class abs {
    abstract int me();
}
class d extends abs{
    int me(){
        return 9;
    }
    public static void main(String[] args) {
        abs g = new d   ();
    }
}
