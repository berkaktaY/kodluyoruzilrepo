import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
            int number = input.nextInt();
            int total=0;

            for (int i=1; i <= number; i++){

                if(number % i ==0){
                   total+=i;
                }
            }
            if(total == number){
                System.out.print(number + " Bir Mükemmel Sayı Değildir.");
        }  else {
                System.out.print(number + " Bir Mükemmel Sayıdır.");
        }



    }
}