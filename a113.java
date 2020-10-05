/**
 * Test
 */

 import java.util.Scanner;

public class a113{

    public static void main(String[] args) {
        Scanner Aagument = new Scanner(System.in);

        int argu_1 = Aagument.nextInt();
        int argu_2 = Aagument.nextInt();
        int argu_3 = Aagument.nextInt();
        if(argu_1!=argu_2)
            System.out.println("not equal");
        else if(argu_1!=argu_3)
            System.out.println("not equal");
        else if(argu_2!=argu_3)
            System.out.println("not equal");
        else 
            System.out.println("equal");

        Aagument.close();
    }
}