
import java.sql.SQLOutput;
import java.util.Scanner;

public class Proje3 {

    public static void main(String[] args){

        double a, b, c;

        Scanner kenar = new Scanner(System.in);
        System.out.print("a kenarını giriniz: ");

        a = kenar.nextDouble();

        System.out.print("b kenarını giriniz: ");

        b = kenar.nextDouble();

        c = Math.sqrt((a*a) + (b*b));

        System.out.print("Üçgenin Hipotenüsü:" + c);



    }

}
