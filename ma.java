/**
 * ma
 */
public class ma {
static int a = 10;
    static String p(){
        a = 20;

        return "Hi";
    }
    public static void main(String[] args) {
        ma a = new ma();
        System.out.println(ma.p());
        p();
        int i = 10;
        double dd = i;
        int ii = (int)dd;

        int[] zz = {1,2,3};
        int[] yy = {1,2,3};
        System.out.println(zz[2] == yy[2]);
        System.out.println("-----------------------");
        int iii[] = {1,2,3};
    int e[] = iii;
    System.out.println(iii == e); 
    System.out.println("-----------------------------");
    String d = "S";
    String q = "S";
    System.out.println(q == d);
    int[] mdre = new int[10];
    int[] yp = new int[2];
    yp[0] = 5;
    mdre[0] = 5;
    System.out.println(mdre[0] == yp[0]);
    }
}