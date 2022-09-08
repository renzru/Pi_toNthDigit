import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

// TODO: make it so that it can print more decimals of pi than the max 15 digits in Math.PI (Maybe use a formula for generating pi?)

public class pi_nthdigit{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pi to how many decimal places?: ");
        int num = scan.nextInt();
        int max = 15; // max length of Math.PI
        
        if (num > 0 && num <= max)
        {
            System.out.println(round(num));
        }

        else 
        {
            System.out.println("Invalid!");
        }
    }

    public static BigDecimal round(int place)
    {
            BigDecimal bd = new BigDecimal(Double.toString(Math.PI));
            bd = bd.setScale(place, RoundingMode.DOWN);
            return bd;
    }
}
