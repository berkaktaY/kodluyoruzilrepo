import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        int n;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz: ");
                n = input.nextInt();
                     if ((n % 2 == 0) && (n % 4 == 0)){
                         total += n;
                    }

             }while (n % 2 == 0);
                    System.out.print("Toplam Sayı: " + total);
    }
}