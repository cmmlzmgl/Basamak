import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, toplam = 0;

        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        do
        {
            int ilkBasamak = number %10;
            toplam += ilkBasamak;
            number = number - ilkBasamak;
            number = number /10;

        } while( number %10 != 0 );

        System.out.print("Basamak sayıları toplamı: " + toplam);
    }
}
