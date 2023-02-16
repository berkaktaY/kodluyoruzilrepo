import java.util.Scanner;

class taksiMetre {
    public static void main(String[] args) {
        // değerlerimizi atayalım //

        double kmBasi = 2.20, toplam,km ;
        int acilisUcreti = 10, minimumTutar = 20;

        // gidilen km nin girilmesini isteyelim //

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen km giriniz: ");
        km = input.nextDouble();

        // gidilen km ile km ücretini hesaplayalım //

        System.out.println("Açılış Ücreti: " + acilisUcreti);

        System.out.println("Km Başı Ücret: " + kmBasi);

        toplam = km * kmBasi;

        // koşul kullanarak girilen km tutarına göre ücretlendirmeyi hesapladık//

        if (km < 10){
            System.out.println("Minimum Ödeme : " + minimumTutar);}
            else if (km > 10);{
            System.out.println("Toplam Ücret: " + toplam);

        }



    }
}