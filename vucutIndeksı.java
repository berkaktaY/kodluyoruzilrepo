import java.util.Scanner;

class vucutIndeksı {
    public static void main(String[] args) {

        double boy , kg , vucutİndex;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Gİriniz: ");
        boy= input.nextDouble();
        System.out.print("Lütfen Kilo Bilginizi Giriniz: ");
        kg= input.nextDouble();


        vucutİndex = kg / (boy * boy);

        System.out.println("Vücut İndeksiniz: " + vucutİndex);
    }
}