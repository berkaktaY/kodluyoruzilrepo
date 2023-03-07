import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
            int number= input.nextInt();

            for (int i=number-1; i >=1; i--){
                for (int k=number-1; k >= i; k--){
                    System.out.print(" ");
                }

                for (int j=1; j <= (2*i-1); j++){
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}