import java.util.Scanner;
public class hesaplama {
    public static void main(String[] args) {
        int armtkg, elmakg, domakg, muzkg, patlkg;
        double armtf, elmaf, domaf, muzf, patlf;

        Scanner input = new Scanner(System.in);


        System.out.print("Armut Kaç kilo :");
         armtkg = input.nextInt();
        System.out.print("Elma Kaç kilo :");
         elmakg = input.nextInt();
        System.out.print("Domates Kaç kilo :");
         domakg = input.nextInt();
        System.out.print("Muz Kaç kilo :");
         muzkg = input.nextInt();
        System.out.print("Patlıcan Kaç kilo :");
         patlkg = input.nextInt();

         armtf = 2.14 * armtkg;
         elmaf = 3.67 * elmakg;
         domaf =  1.11 * domakg;
         muzf = 0.95 * muzkg;
         patlf = 5.00 * patlkg;


        System.out.println("Armut Fiyatı :" + armtf);
        System.out.println("Elma  Fiyatı :" + elmaf);
        System.out.println("Domates  Fiyatı :" + domaf);
        System.out.println("Muz  Fiyatı :" + muzf);
        System.out.println("Patlıcan Fiyatı :" + patlf);

    }
}
