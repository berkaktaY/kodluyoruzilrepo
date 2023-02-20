import java.util.Scanner;

class artıkYıllar {
    public static void main(String[] args) {

        int year,total;

        Scanner input = new Scanner(System.in);

            System.out.print("Yıl Giriniz: ");
                year = input.nextInt();

        if ((year/4 == 0) && (year/400==0)){
            System.out.println(year);
            System.out.print("Bir Artık Yıldır.");
        }else if(!(year%100==0) && !(year%400==0)){
            if (year%4==0){
                System.out.println(year);
                System.out.print("Bir Artık Yıldır.");
            }else {
                System.out.println(year);
                System.out.print("Bir Artık Yıl Değildir.");

        }
        }else {
            System.out.println(year);
            System.out.print("Bir Artık Yıl Değildir");
        }


        }
    }
