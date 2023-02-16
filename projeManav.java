import java.util.Scanner;

class projeManav {
    public static void main(String[] args) {

        // değişkenleri belirleyelim//

       double pearPrice=2.14 , applePrice= 3.67 , tomatoesPrice = 1.11, bananaPrice= 0.95, auberginePrice=5.00;
       double pear, apple , tomatoes, banana,aubergine;


       //kullanıcıdan hangi üründen kaç kilo almak istediğini belirleyelim

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kg: ");
        pear= inp.nextDouble();

        System.out.print("Elma kg: ");
        apple= inp.nextDouble();

        System.out.print("Domates kg: ");
        tomatoes= inp.nextDouble();

        System.out.print("Muz kg: ");
        banana= inp.nextDouble();

        System.out.print("Patlıcan kg: ");
        aubergine= inp.nextDouble();

        // kullanıcın aldığı ürünleri hesaplayalım

        double totalPear = pearPrice * pear;
        System.out.println("Armut'un Ücreti: " + totalPear);

        double totalApple = applePrice * apple;
        System.out.println("Elma'nın ücrei: " + totalApple);

        double totalTomatoes = tomatoesPrice * tomatoes;
        System.out.println("Domates'in Ücreti: " + totalTomatoes);

        double totalBanana = bananaPrice * banana;
        System.out.println("Muz'un ücreti: " + totalBanana);

        double totalAubergine = auberginePrice * aubergine;
        System.out.println("Patlıcan'ın Ücreti: " + totalAubergine);

        // Kullanıcının aldığı ürünlerin toplam ödenecek tutarı hesapladık

        double totalPaymet = totalPear + totalApple + totalTomatoes + totalBanana + totalAubergine;
        System.out.println("Ödenecek Toplam Tutar: " + totalPaymet);
    }
}