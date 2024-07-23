import java.util.Random;
import java.util.Scanner;

public class sayi_Tahmin_Oyunu {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random b = new Random();
        int c = b.nextInt(10);
        int v = 0;
        int x = 3;
        System.out.println("Sayı tahmin oyununa hoş geldiniz. 1-10 arasında bir sayı  tahmin ediniz.");

        while(v < 3) {
            System.out.print("Bir sayı giriniz: ");
            int e = a.nextInt();
            if (e == c) {
                System.out.println("Doğru bidiniz!");
                break;
            }

            --x;
            if (x > 0) {
                System.out.println("" + x + " hakkınınz kaldı");
                ++v;
                if (e < c) {
                    System.out.println("Daha büyük bir sayı giriniz");
                }

                if (e > c) {
                    System.out.println("Daha küçük bir sayı giriniz");
                }
            }

            if (x == 0) {
                System.out.println("Hiç hakkınız kalmadı");
                System.out.println("Random sayı: " + c);
                break;
            }
        }

    }
}