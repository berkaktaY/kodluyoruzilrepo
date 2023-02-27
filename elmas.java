import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısını Giriniz: ");
        int saNumber = input.nextInt();

        for (int i = 1; i <= saNumber; i++) {
            for (int j = 1; j < saNumber - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = saNumber - 1; i >= 1; i--) {
            for (int j = saNumber; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
