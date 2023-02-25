import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        int number, number1;
        int total = 1;

        Scanner input= new Scanner(System.in);
        System.out.print("Üs alınacak sayı: ");
        number = input.nextInt();
        System.out.print("Sayı Giriniz: ");
        number1 = input.nextInt();

        for (int i =1; i <= number; i++ ){

            total *= number;


        }
        System.out.print("Cevap: " + total);
    }
}