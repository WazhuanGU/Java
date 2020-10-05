import java.util.Scanner;

public class a119 {
    public static void main(String[] args) {
        Scanner toget = new Scanner(System.in);

        int N = toget.nextInt();

        String s = "";
        for (int n = N; n >0; n/= 2)
            s = (n % 2) + s;
        
        StdOut.println(s);
        
        StdOut.println(Integer.toBinaryString(N));

        toget.close();
    }
}
