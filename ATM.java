import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        String userName;
        String password;

        int process;
        int balance = 8750;
        int deposit1,deposit2;
        int right = 3;
        while (right > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı Adınınz: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();


            if ((userName.equals("Aktay56") && (password.equals("Aktay56")))) {
                System.out.println("Giriş Başarılı. Bankamıza Hoşgeldiniz. \n Yapacağınız İşlemi Seçiniz.");

                do { System.out.println(" 1- Para Yatırma \n 2- Para Çekme \n 3- Bakiye Sorgulama \n 4- Çıkış");
                    process = input.nextInt();
                    switch (process) {
                        case 1:
                            System.out.println("Yatıracağınız Tutarı Giriniz: ");
                            deposit1 = input.nextInt();
                            System.out.println("Toplam Bakiyeniz: " + (deposit1 + balance));
                            break;

                        case 2:
                            System.out.println("Çekmek İstediğiniz Tutarı Giriniz: ");
                            deposit2 = input.nextInt();
                            if (deposit2 > balance){
                                System.out.println("Bakiyeniz Yetersiz");
                            }else {
                                System.out.println("Kalan Bakiyeniz: " + (balance - deposit2));
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;

                        case 4:
                            System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz.");
                    }

                }while (process !=4);

            } else {
                System.out.println("Yanlış Kullanıcı Adı Veya Şifre Girdiniz. Lütfen Tekrar Deneyiniz.");
                right--;
                if(right == 0){

                    System.out.println("Hesabınız Bloke Olmuştur. Lütfen Bankanız ile İletişime Geçiniz.");
                }
                System.out.println("Kalan Hakkınız: " + right);
            }

        }
        right--;




    }
}














