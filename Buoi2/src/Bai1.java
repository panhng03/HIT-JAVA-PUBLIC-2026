import java.util.Scanner;
public class Bai1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập x1: ");
            int x1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập y1: ");
            int y1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập x2: ");
            int x2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập y2: ");
            int y2 = Integer.parseInt(scanner.nextLine());

            double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

            System.out.printf("Khoang cach: %.2f", d);
        }
}