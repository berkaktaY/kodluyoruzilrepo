import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);
             System.out.print("Bir Sayı Giriniz: ");
                  n = input.nextInt();

        for (int i=1; i<=n; i *= 4){
            System.out.println("Girilen Sayının 4.kuvvetleri: " + i);
        }

        System.out.println("---------------------------------");

        for (int k=1; k <= n; k *= 5){
            System.out.println("Girilen Sayının 5.kuvvetleri: " + k);
        }





    }
}