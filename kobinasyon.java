import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        /*N elemanlı bir kümenin elemanları ile oluşturacak r elemanlı farklı özelliklere sahip n'in r'li maliyetleri olarak nitelendirilir.
          N'in r'li hastane C(n,r) şeklinde gösteriliyor.
             Java ile çalıştırmayı hesaplayan programı yürütür.
                    kombinasyon formülü
                        C(n,r) = n! / (r! * (nr)!)
*/
        int n,r;
        int total1=1,total2=1;

        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısını Giriniz: ");
        n = input.nextInt();
        System.out.print("R, Sayısını giriniz");
        r = input.nextInt();

        for (int i=1; i <= n; i++){
            total1= total1 * i;
        }
        System.out.println(n +".faktöriyel: " + total1);

        for (int a=1; a <= r; a++){
            total2 = total2 * a;
        }
        System.out.println(r + ". faktöriyel: " + total2);

        int result = total1 / (total2 * (total2*total1));

        System.out.println(result);
    }
}