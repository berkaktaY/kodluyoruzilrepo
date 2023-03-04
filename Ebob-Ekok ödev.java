import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
                                                System.out.println("EBOB BULMA");
                                                System.out.println("====================================");
        System.out.print("1. Sayıyıyı Giriniz: ");
            int number1 = input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
            int number2 = input.nextInt();

            int i=1;
            int ebob =1;

            while (i <= number1){
                if ((number1 % i == 0) && (number2 % i == 0)){

                    ebob=i;
                }
                i++;
            }System.out.println("ebob("+ number1 +","+ number2 +") = " + ebob);

                                    System.out.println("==================================");

                                        System.out.println("EKOK BULMA");
                            System.out.println("=================================");

        System.out.print("1. Sayıyı Giriniz: ");
            int value1= input.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
            int value2= input.nextInt();

            int j=1;
            int ekok=1;

            while (j <= (value1 * value2)){
                if ((j % value1 == 0) && (j % value2 == 0)){

                    ekok=j;
                    break;

                }j++;

            }System.out.println("EKOK(" + value1 + "," + value2 + ")= " + ekok);

    }
}