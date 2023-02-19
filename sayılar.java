import java.util.Scanner;

class sayılar {
    public static void main(String[] args) {

        int number1, number2, number3;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        number1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        number2 = input.nextInt();
        System.out.print("3. Sayısı Giriniz: ");
        number3 = input.nextInt();

        if ((number1 > number2) && (number2 > number3)){
            if (number1 > number3){
                System.out.print("1.sayı > 2.sayı > 3.sayı");
            }else {
                System.out.print("1. sayı > 2.sayı > 3.sayı");
            }

        } else if ((number2 > number1) && (number2 > number3)) {
            if (number3 > number1){
                System.out.print("2.sayı > 3.sayı > 1.sayı");
            }else {
                System.out.print("2.sayı > 1.sayı > 3.sayı");
            }

        } else if ((number3 > number2) && (number3 > number1)) {
            if (number2 > number1){
                System.out.print("3. sayı > 2.sayı > 1.sayı");
            }else {
                System.out.print("1.sayı > 2.sayı > 3.sayı");
            }

        }
    }
    }
