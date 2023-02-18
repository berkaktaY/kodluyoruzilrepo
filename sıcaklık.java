import java.util.Scanner;

class sicaklik {
    public static void main(String[] args) {
        int heat;


        Scanner input = new Scanner(System.in);

        System.out.print("Hava Durumunu Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapmaya Gidebilirsiniz");

        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya Ve Ya Pikniğe Gidebilirsiniz");
            System.out.println("Sinemaya Gitmek için: 1 \nPikniğe Gitmek için: 2");
            System.out.print("Seçiminiz: ");
                heat = input.nextInt();
            System.out.println(heat == 1 ? "https://www.sinemalar.com/filmler/vizyondaki" : "https://listelist.com/gidilesi-piknik-alani/");


        } else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}










