import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class pi_nthdigit{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("PI to how many decimal places?: ");
        int num = scan.nextInt();
    
        System.out.println(round(Math.PI, num));
    }

    public static BigDecimal round(double pi, int place)
    {
        int max = 15; // max length of Math.PI
        
        if (place <= 0 || place > max)
        {
            System.out.println("Invalid!");
            System.exit(0);
        }
            BigDecimal bd = new BigDecimal(Double.toString(pi));
            bd = bd.setScale(place, RoundingMode.DOWN);
            return bd;
    }
}
