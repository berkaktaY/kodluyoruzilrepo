import java.util.Scanner;

class YarıÇapÖdev {
    public static void main(String[] args) {

                // Değerlerimizi Atadık//
        int r , a;
        double pi= 3.14,alan;

                // Kullanıcıdan Bilgileri İstedik//
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını giriniz: ");
        r = input.nextInt();
        System.out.print("Dairenin Merkez Açısını Giriniz: ");
        a = input.nextInt();

        // Alan hesaplamasını Yaptık//

        alan = (pi *(r*r)*a)/360;
        System.out.println("Dairenin Alanı: " + alan);

    }
}