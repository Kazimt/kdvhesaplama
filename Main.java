import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar,kdv1=0.18,kdv2=0.08,toplam,kdvlitutar;
        Scanner input= new Scanner(System.in);

        System.out.println("KDV hesaplanacak tutar giriniz:");
        tutar=input.nextDouble();
    kdvlitutar= tutar<1000 ? tutar*kdv1 : tutar*kdv2;
    toplam=kdvlitutar+tutar;
    System.out.println("Kdv'li tutar:" +toplam);

    }
}