import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double armut=2.14 , elma=3.67 , domates=1.11 , muz=0.95 , patlican=5.00 ;
        double armutKg , elmaKg , domatesKg , muzKg , patlicanKg ;
        double armutTop , elmaTop , domatesTop , muzTop , patlicanTop ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armutKg = inp.nextDouble();

        System.out.print("Elma Kaç Kilp? : ");
        elmaKg = inp.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        domatesKg = inp.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        muzKg = inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        patlicanKg = inp.nextDouble();

        double toplam = (armutKg + elmaKg + domatesKg + muzKg + patlicanKg);
        System.out.println("Toplam Kg : "+ toplam);

        double tutar = ((armutKg*armut) + (elmaKg*elma) + (domatesKg*domates) + (muzKg*muz) + (patlicanKg*patlican));
        System.out.println("Ödenecek Tutar : " + tutar);






    }
}
