package Week02.Reading;

public class Walrus {
    public int weight;
    public double tuskSize;

    public Walrus(int w, double ts) {
        weight = w;
        tuskSize = ts;
    }
    public String toString() {
        return String.format("weight: %d, tusk size: %.2f", weight, tuskSize);
    }
    public static void changeList(int[] m){

        m[0]=100;
    }

    public static void main(String[] args) {
//        Walrus a = new Walrus(1000, 8.3);
//        System.out.println(a);
//        Walrus b = new Walrus(0, 8.3);
//        System.out.println(b);
//        b = a;
//        System.out.println(b);
//        b.weight = 5;
//        System.out.println(a);
//        System.out.println(b);
//
//        int x = 5;
//        int y;
//        y = x;
//        x = 2;
//        System.out.println("x is: " + x);
//        System.out.println("y is: " + y);

        int[] mm = {5,0};
        System.out.println(mm[0]);
        changeList(mm);
        System.out.println(mm[0]);

    }
}
