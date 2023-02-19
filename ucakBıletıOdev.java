

import java.util.Scanner;

class ucakBiletiÖdev {
    public static void main(String[] args) {
        double distance,kmPer= 0.10,total;
        int age,type;


        // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın

        Scanner input=new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz: ");
            age = input.nextInt();
        System.out.print("Gidilecek Mesafeyi Giriniz(KM Cinsinden): ");
            distance= input.nextDouble();
        System.out.println("Yolculuk Türünü Seçiniz: \nTek Yön:1 \nGidiş-Dönüş:2" );
        System.out.print("Seçiminiz: ");
            type= input.nextInt();

            //Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın

            total=distance/kmPer;
                System.out.println("Toplam Km Ücreti: " + total);
            //sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
            //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
            //Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir
            //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
            //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
            //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
            //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        if ((distance <= 0) && (age <= 0)) {
            System.out.println("Yanlış Bir Değer Girdiniz Lütfen Tekrar Deneyiniz.");
        }
        if ((type == 1) || (type == 2)){
            System.out.println("Teşekkür Ederiz. İyi Uçuşlar");
        } else {
            System.out.println("Hatalı bir Değer Girdiniz. Lütfen Tekrar Deneyiniz.");
        } if ((age < 12)){
            double a = total * 0.50;

            System.out.println("İndirimli Fiyatınız: " + (total-a));
        } else if ((age >= 12) && (age <= 24)) {
            double b =total * 0.10;
            System.out.println("İndirimli Fiyatınız: " + (total - b));

        } else if ((age >= 65)) {
            double c = total * 0.30;
            System.out.println("İndirimli Fiyatınız: " + (total - c));

        } else if (type==2) {
            double d = total * 0.20;
            System.out.println("İndirimli Fiyatınız: " + (total - d));

        }


    }


    }
