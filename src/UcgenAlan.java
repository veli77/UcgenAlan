import java.util.Scanner;
import static java.lang.Math.sqrt;
public class UcgenAlan {
    public static void main(String[] args) {
        double a,b,c,d,e;
        Scanner input = new Scanner(System.in);

        System.out.print("a kenarı:");
        a = input.nextDouble();
        System.out.print("b kenarı:");
        b = input.nextDouble();
        System.out.print("c kenarı:");
        c = input.nextDouble();

        d=(a+b+c)/2;
        e=sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.println("üçgenin alanı:"+e);
    }
}
