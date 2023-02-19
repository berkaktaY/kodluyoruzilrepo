import java.util.Scanner;
//Koç Burcu : 21 Mart - 20 Nisan
//
//Boğa Burcu : 21 Nisan - 21 Mayıs
//
//İkizler Burcu : 22 Mayıs - 22 Haziran
//
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//
//Başak Burcu : 23 Ağustos - 22 Eylül
//
//Terazi Burcu : 23 Eylül - 22 Ekim
//
//Akrep Burcu : 23 Ekim - 21 Kasım
//
//Yay Burcu : 22 Kasım - 21 Aralık
//
//Oğlak Burcu : 22 Aralık - 21 Ocak
//
//Kova Burcu : 22 Ocak - 19 Şubat
//
//Balık Burcu : 20 Şubat - 20 Mart

class burclar {
    public static void main(String[] args) {
        int month,day;

        Scanner input =new Scanner(System.in);
            System.out.print("Doğduğunuz Ay: ");
                month= input.nextInt();

            System.out.print("Doğduğunuz Gün: ");
                day = input.nextInt();

        if (month == 1){
            if ((day >= 1) && (day <= 21)){
                System.out.print("Burcunuz Oğlak");
            }else {
                System.out.print("Burcunuz Kova");
            }
        } else if (month == 2) {
            if ((day >= 1) && (day <=19)){
                System.out.print("Burcunuz Kova");
            }else {
                System.out.print("Burcunuz Balık");
            }

        } else if (month == 3) {
            if ((day >= 1) && (day <= 20)){
                System.out.print("Burcunuz Balık");
            } else {
                System.out.print("Burcunuz Koç");

            }

        } else if (month == 4) {
            if((day >= 1) && (day <= 20) ){
                System.out.print("Burcunuz Koç");
            }else {
                System.out.print("Burcunuz Boğa");
            }

        } else if (month== 5) {
            if ((day >=1) && (day <= 21)){
                System.out.print("Burcunuz Boğa");
            }else {
                System.out.print("Burcunuz İkizler");
            }

        } else if (month == 6) {
            if ((day >= 1) && (day <= 22)){
                System.out.print("Burcunuz İkizler");
            }else {
                System.out.print("Burcunuz Yengeç");
            }

        } else if (month==7) {
            if ((day >= 1) && (day <= 22)){
                System.out.print("Burcunuz Yengeç");
            }else {
                System.out.print("Burcunuz Aslan");
            }

        } else if (month == 8) {
            if((day >= 1) && (day <= 22)){
                System.out.print("Burcunuz Alan");
            } else {
                System.out.print("Burcunuz Başak");
            }

        } else if (month == 9) {
            if ((day >= 1) && (day <= 22)){
                System.out.print("Burcunuz Başak");
            }else {
                System.out.print("Burcunuz Terazi");
            }

        } else if (month == 10) {
            if ((day >= 1) && (day <= 22)){
                System.out.print("Burcunuz Terazi");
            }else {
                System.out.print("Burcunuz Akrep");
            }

        } else if (month == 11) {
            if ((day >= 1)&&(day <=21)){
                System.out.print("Burcunuz Akrep");
            }else {
                System.out.print("Burcunuz Yay");
            }

        } else if (month == 12) {
            if ((day >=1) && (day <=21)){
                System.out.print("Burcunuz Yay");
            }else {
                System.out.print("Burcunuz Oğlak");
            }
        }


    }
}