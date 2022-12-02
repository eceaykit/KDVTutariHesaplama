import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar, kdvOran1 = 0.18, kdvOran2= 0.08, kdvTutar, kdvliTutar;
        //Kullanıcıdan veri alalım.
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");

        //KDV'siz tutarı gösterelim.
        tutar = input.nextDouble();
        System.out.println("KDV'siz Tutar: " + tutar);

        //Koşul belirleyelim.
        boolean kosul1 = (tutar >= 0) && (tutar <=1000);
                String str = kosul1 ? "KDV Oranı: %18" : "KDV Oranı: %8";
        System.out.println(str);

        //KDV tutarını gösterelim.
        kdvTutar = (tutar >= 0) && (tutar <=1000) ? kdvOran1 * tutar : kdvOran2 * tutar;
        System.out.println("KDV Tutarı: " +kdvTutar);

        //KDV eklenmiş tutarı verelim.
        kdvliTutar= tutar + kdvTutar;
        System.out.println("KDV'li Tutar: " +kdvliTutar);

    }
}