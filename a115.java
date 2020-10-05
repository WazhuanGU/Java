
import java.util.Scanner;

public class a115 {
    public static void main(String[] args) {
        Scanner floatnum = new Scanner(System.in);

        double argument_1 = floatnum.nextDouble();
        double argument_2 = floatnum.nextDouble();

        if(0 < argument_1 && argument_1 < 1){
            if(0 < argument_2 && argument_2 < 1)
                System.out.println("ture");
            else
            System.out.println("false");
        }            
        else
            System.out.println("false");
        
        floatnum.close();



            


    }
    
}
