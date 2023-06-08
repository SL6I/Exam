 class equ {
    public static void main(String[] args) {
        Time time1 = new Time(10,10);
        Time time2 = new Time(10, 10);
        // System.out.println(time1.equals(time2));
        System.out.println(time1.equals(time2));
    }
}
class Time{
    int h;
    int m;
    public Time(int h, int m){
        this.h = h;
        this.m = m;
    }
    public boolean equals(Time obj) {
        return (this == obj);
}
}