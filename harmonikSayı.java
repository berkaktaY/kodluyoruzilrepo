import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        double n = input.nextDouble();
        double result=0;
        for (double i=1; i <= n; i++){
            result += (1/i);
            System.out.println(result);

        }
    }
}