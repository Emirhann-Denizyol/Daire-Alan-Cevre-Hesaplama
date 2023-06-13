import java.util.Scanner;

public class Ornek_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;
        double yari_Cap;
        System.out.println("Yariçap girniz : ");
        yari_Cap = scanner.nextDouble();
        System.out.println("Çevre uzunluğu : " + (2 * PI * yari_Cap));
        System.out.println("Alanı : " + (PI * Math.pow(yari_Cap, 2)));
    }
}
