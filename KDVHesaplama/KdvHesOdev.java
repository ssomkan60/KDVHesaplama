import java.util.Scanner;
public class KdvHesOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat Giriniz:");
        int fiyat = input.nextInt();
        double KDV;

        if( fiyat <= 1000){
            System.out.println("KDV Oranı: 0.18");
            KDV = fiyat + (fiyat * 0.18);
            System.out.println("KDV'li Fiyat:" + KDV);
        }
        else{
            System.out.println("KDV Oranı: 0.08");
            KDV = fiyat + (fiyat * 0.08);
            System.out.println("KDV'li Fiyat:" + KDV);
        }
    }
}
