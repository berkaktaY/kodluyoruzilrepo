import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        // Kullanıcıdan kaç tane sayı girmesi gerektiğinin belirleyelim

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Girmek İstediğinizi Belirtiniz: ");
            int oneNumber= input.nextInt();
            int max=1,min=1;

        // kulanıcıdan girmek istediği sayıları belirleyelim

            for (int i= 1; i<=oneNumber;i++){

                System.out.print(i + ". Sayı= ");
                    int selectNumber= input.nextInt();

        // belirlenen sayıların büyük ve küçük olanları bulalım

                if (i == 0){
                    max = selectNumber;
                    min = selectNumber;
                }
                if (selectNumber > max){
                    max=selectNumber;
                }
                if (selectNumber < min){
                    min = selectNumber;
                }

            }
            System.out.println("En Büyük Sayı: " + max);
            System.out.println("En Küçük Sayı: " + min);
    }
}