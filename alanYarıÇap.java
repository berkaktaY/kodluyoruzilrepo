import java.util.Scanner;

class alanYarıÇap {
    public static void main(String[] args) {

        int r;
        double pi=3.14, alan,cevre;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarı Çap Giriniz: ");
        r = input.nextInt();

        alan = pi * r*r ;
        cevre= 2* pi * r;

        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);

    }
}