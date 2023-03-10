import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int number= input.nextInt();


        int sayi1=0;
        int sayi2=1;
        int toplam;

        System.out.print(number + " Sayısının Fibonacci Serisi: ");

        for (int i =1; i<=number; i++){
            System.out.println(sayi1 + ",");

            toplam=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=toplam;
        }
    }
}