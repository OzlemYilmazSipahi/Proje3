
import java.util.Scanner;

public class Proje3 {

    public static void main(String[] args){

        double a, b, c, cevre, alan;

        Scanner kenar = new Scanner(System.in);
        System.out.print("a kenarının uzunluğunu giriniz: ");

        a = kenar.nextDouble();

        System.out.print("b kenarının uzunluğunu giriniz: ");

        b = kenar.nextDouble();

        System.out.print("c kenarının uzunluğunu giriniz: ");

        c = kenar.nextDouble();

        cevre = (a+b+c)/2;

        System.out.println("Üçgenin Çevresi: " + cevre*2);

        alan = cevre*(cevre-a)*(cevre-b)*(cevre-c);

        System.out.print("Üçgenin Alanı: " + alan);




    }

}
