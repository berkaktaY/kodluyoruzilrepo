import java.util.Scanner;

public class projeOne {
    public static void main(String[] args) {
        // değişkenleri oluştur
        int mat , fizik , kimya,turkce,tarih,müzik;

        // Scanner sınıfını tanımladık
        Scanner ders = new Scanner(System.in);

        // kullancıdan bilgilerin alınması

        System.out.print("matematik notunuz: ");
        mat = ders.nextInt();

        System.out.print("fizik notunuzu giriniz: ");
        fizik = ders.nextInt();

        System.out.print("kimya notunuzu giriniz: ");
        kimya = ders.nextInt();

        System.out.print("tarih notunuzu girin: ");
        tarih = ders.nextInt();

        System.out.print("turkce notunuzu giriniz: ");
        turkce = ders.nextInt();

        System.out.print("müzik notunuznu giriniz: ");
        müzik = ders.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + müzik;
        double sonuc = toplam / 6 ;

        System.out.println("ortalamanız: " + sonuc);

        // koşullu ifade 60 ve üzeri ise geçti değil ise kaldı yazılacak

            boolean kosul1 = sonuc >= 60;
            boolean kosul2 = sonuc < 60 ;
            boolean sonuc1 = kosul1||kosul2;

        System.out.println("sınıf geçti: " + sonuc1);
        System.out.println("sınıf kaldı: " + sonuc1);






    }
}


