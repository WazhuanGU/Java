import java.lang.Math;

public class a117 {
    public static void main(String[] args) {
        a1();
        a2();
        a3();
    }
    public static void a1() {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
    }
    public static void a2() {
        int sum = 0;
        for (int i = 1; i < 1000; i++)
        for (int j = 0; j < i; j++)
        sum++;
        StdOut.println(sum);   
    }
    public static void a3() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < 1000; j++)
                sum++;
        StdOut.println(sum);
        
    }

}
