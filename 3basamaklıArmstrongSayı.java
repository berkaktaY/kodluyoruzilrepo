import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Bir 3 Basamaklı Sayı Giriniz: ");
        int number = input.nextInt();
        int basNumber=0;
        int basValue;
        int tempNumber=number;
        int result=1;
        int basPow;


        while ((tempNumber !=0) || (tempNumber != 999)){
            tempNumber /= 10;
            basNumber++;

        }
            tempNumber=number;
        while ((tempNumber != 0) || (tempNumber != 999)){
            basValue= tempNumber % 10;
            basPow=1;

                for (int i =1; i<= basNumber; i++){
                    basPow*=basValue;
                }

                result += basPow;
            System.out.println(result);
            tempNumber /= 10;

        }

        if (result == number){
            System.out.print(number + " Sayısı Bir Armstrong Sayısıdır.");
        }else {
            System.out.print(number + " Sayısı Bir Armstrong Sayısı Değildir.");
        }




    }
}