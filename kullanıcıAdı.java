import java.util.Scanner;

class kullanıcıAdı {
    public static void main(String[] args) {

        // değerlerimizi atayalım//

        String password, userName;


        // kullanıcıdan bilgileri isteyelim//

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("Berkaktay56@gmail.com") && (password.equals("Aktay56"))) {
            System.out.print("Giriş Yapılıyor. LÜTFEN BEKLEYİNİZ !");
        } else if (userName.equals("Berkaktay56@gmail.com") || password.equals("Aktay56")) {
            System.out.println("Şifreniz Hatalı:");
        }
        System.out.println("Şifre Oluşturmak İçin Seçim Yapınız \nEVET:1\nHAYIR:2");
        System.out.print("Seçiminiz: ");
        password = input.nextLine();

        if (password.equals("1")){
            System.out.print("Yeni Şifreniz: ");
                password= input.nextLine();
            System.out.println("Şifrenzi Başarılı Bir Şekilde Oluşturulmuştur.");
        }
        if (password.equals("Aktay56")) {
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz !");
            System.out.print("Yeni Şifreniz: ");
                password= input.nextLine();
            System.out.println("Şifrenzi Başarılı Bir Şekilde Oluşturulmuştur.");

        }


    }


}




















            //System.out.println("Şifreniz Oluşturulmuştur.LÜTFEN TEKRAR GİRİŞ YAPINIZ !");






        

