import java.util.Scanner;

class çinZodyağı {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
            year= input.nextInt();

            switch (year % 12){

                case 0 :
                    System.out.println("Çin Zoydağınız: Maymun");
                    break;
                case 1 :
                    System.out.println("Çin Zoydağınız: Horoz");
                    break;
                case 2 :
                    System.out.println("Çin Zoydağınız: Köpek");
                    break;
                case 3 :
                    System.out.println("Çin Zoydağınız: Domuz");
                    break;
                case 4 :
                    System.out.println("Çin Zoydağınız: Fare");
                    break;
                case 5 :
                    System.out.println("Çin Zoydağınız: Öküz");
                    break;
                case 6 :
                    System.out.println("Çin Zoydağınız: Kaplan");
                    break;
                case 7 :
                    System.out.println("Çin Zoydağınız: Tavşan");
                    break;
                case 8 :
                    System.out.println("Çin Zoydağınız: Ejderha");
                    break;
                case 9 :
                    System.out.println("Çin Zoydağınız: Yılan");
                    break;
                case 10 :
                    System.out.println("Çin Zoydağınız: At");
                    break;
                case 11 :
                    System.out.println("Çin Zoydağınız: Koyun");
                    break;
                default:
                    System.out.println("Yanlış Değer Girdiniz. Lütfen Tekrar Deneyiniz.");

            }
    }
}