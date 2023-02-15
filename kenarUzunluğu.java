import java.util.Scanner;

/*class kenarUzunluğu {
    public static void main(String[] args) {
        // değişkenleri belirleyelim
        int a,b;
        double c;

        // kullanıcıdan veri alalım

        Scanner input = new Scanner(System.in);
        System.out.print("1.kenar uzunluğu: ");
        a = input.nextInt();
        System.out.print("2.kenar uzunluğu: ");
        b = input.nextInt();
// java da karakök almamızı sağlayan komut " math.sqrt()" komutudur
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs: " + c);

*/

                                // ÖDEV//

class kenarUzunluğu {
    public static void main(String[] args) {
                // değişkenleri tanımladık//
        int a,b,c;
        double ucgeninCevresi,cevre,alan;
                // kullanıcıdan kenar bilgilerini istedik//
        Scanner input= new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğu: ");
        a = input.nextInt();
        System.out.print("2. Kenar uzunluğu: ");
        b= input.nextInt();
        System.out.print("3 Kenar Uzunluğu: ");
        c= input.nextInt();
                // formülleri uygulayarak sonuca ulaştık//
        ucgeninCevresi = 2 * (a + b + c / 2);
        System.out.println("Ücgenin Çevresi: "+ ucgeninCevresi);
        cevre = a+b+c/2;
        System.out.println("Çevre: " + cevre);
        alan= ucgeninCevresi * (ucgeninCevresi-a)*(ucgeninCevresi-b)*(ucgeninCevresi-c);
        System.out.println("Üçgenin Alanı: " + alan);



    }
}