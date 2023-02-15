import java.util.Scanner;

/*
class projeKdv {

    public static void main(String[] args) {

        // kullanıcıdan tutar belirlemesini istedik

        Scanner input = new Scanner(System.in);
        System.out.print("tutar giriniz: ");
        float a = input.nextFloat();
        // kullanıcının girdiği tutar ile %18 i çarptık ve sonucu elde ettik
        System.out.println("kdv toplam: " + a * 0.18);
        System.out.println("toplam tutar: " +( a + a * 0.18));
    */

                                // ÖDEV //

class projeKdv{
    public static void main(String[] args) {
        double tutar , kdvOranı1= 0.18, kdvOrani2= 0.08 ,toplam,toplam2;

        Scanner input = new Scanner(System.in);
        System.out.print("alışveriş ücreti giriniz: ");

        tutar= input.nextDouble();

        toplam = tutar * kdvOranı1 + tutar ;
        toplam2 = tutar * kdvOrani2 + tutar;

        if (tutar <= 1000);{
        System.out.println("KDV oranı: 0.18");
            System.out.println("KDV'li tutar: " + toplam);


        }

        if (tutar > 1000);{
        System.out.println("KDV oranı: 0.8");
            System.out.println("KDV'li tutar : " + toplam2);
        }



    }

}