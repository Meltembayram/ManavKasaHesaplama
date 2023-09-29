
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {

        // Java ile kullanıcıların manavdan almış oldukları ürünlerin
        // kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        // Armut : 2,14 TL Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patlıcan : 5,00 TL
        double armut = 2.14 , elma = 3.67 , domates = 1.11 , muz = 0.95 , patlican = 5.00;
        double total, akg , ekg, dkg, mkg, pkg ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kac kilo armut aldiniz? ");
        akg = inp.nextDouble();
        System.out.println("Kac kilo elma aldiniz? ");
        ekg = inp.nextDouble();
        System.out.println("Kac kilo domates aldiniz? ");
        dkg = inp.nextDouble();
        System.out.println("Kac kilo muz aldiniz? ");
        mkg = inp.nextDouble();
        System.out.println("Kac kilo patlican aldiniz? ");
        pkg = inp.nextDouble();

        total = (akg * armut) + (ekg * elma ) + (dkg * domates ) + (mkg * muz ) + (pkg * patlican);
        System.out.println("Toplam Harcamaniz: " + total);


    }
}
