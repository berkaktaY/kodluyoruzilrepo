import java.util.Scanner;

class heapMakinesi {
    public static void main(String[] args) {

        // değerlerimizi belirledik

        double number1,number2;
        int select;

        // kullanıcıdan değer atamasının istedik

        Scanner input = new Scanner(System.in);
            System.out.print("1.Sayıyı Giriniz: ");
        number1 = input.nextDouble();
            System.out.print("2.Sayıyı Giriniz: ");
        number2 = input.nextDouble();
            System.out.println();

            System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
            System.out.print("Seçiminizi Gİriniz: ");
            select= input.nextInt();


            switch (select){
                case 1 :
                    System.out.println("Sonuç: " + (number1 + number2));
                    break;
                case  2 :
                    System.out.println("Sonuç: " + (number1 - number2));
                    break;
                case 3 :
                    System.out.println("Sonuç: " + (number1 * number2));
                    break;
                case 4 :
                    System.out.println("Sonuç: " + (number1 / number2));
                    if (number1 == 0 || number2 == 0){
                        System.out.println("Girmiş Olduğunuz Sayı 0 İle Bölünemez");
                    }
                    break;

                default:
                    System.out.println("Yanlış Değer Girdiniz.LÜTFEN TEKRAR DENEYİNİZ");





            }




    }
}