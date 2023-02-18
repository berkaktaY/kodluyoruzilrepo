import java.util.Scanner;

class notOrtalamasıOdev {
    public static void main(String[] args) {

        // değerlerimizi belirleyelim

        double Matematik, Fizik, Turkce, Kimya, Muzik , gecmeNotu=55,toplamNot;


        // kullanıcıdan bilgileri isteyelim

        Scanner input = new Scanner(System.in);

            System.out.print("Matematik Notunuz: ");
                Matematik= input.nextDouble();

            System.out.print("Fizik notunuz: ");
                Fizik = input.nextDouble();

            System.out.print("Türkçe notunuz: ");
                Turkce = input.nextDouble();

            System.out.print("Kimya notunuz: ");
                Kimya = input.nextDouble();

            System.out.print("Müzik notunuz: ");
                Muzik = input.nextDouble();

        toplamNot= (Matematik + Fizik + Kimya + Turkce + Muzik) / 5;

        if ((Matematik < 0 || Matematik >100)){
            System.out.println("Yanlış Değer Girdiniz ! Lütfen Tekrar Deneyiniz");

        } else if (Fizik < 0 || Fizik > 100) {
            System.out.println("Yanlış Değer Girdiniz ! Lütfen Tekrar Deneyiniz");

        } else if (Kimya < 0 || Kimya > 100) {
            System.out.println("Yanlış Değer Girdiniz ! Lütfen Tekrar Deneyiniz");

        } else if (Turkce < 0 || Turkce > 100) {
            System.out.println("Yanlış Değer Girdiniz ! Lütfen Tekrar Deneyiniz");

        } else if (Muzik < 0 || Muzik > 100) {
            System.out.println("Yanlış Değer Girdiniz ! Lütfen Tekrar Deneyiniz");

        } else if ((toplamNot >= gecmeNotu)){
            System.out.println("Not Ortalamanız: " + toplamNot);
            System.out.println("Sınıftan Geçtiniz:");

        } else if (toplamNot < gecmeNotu) {
            System.out.println("Not Ortalamanız: " + toplamNot);
            System.out.println("Sınıfta Kaldınız");

        }


    }
        }

