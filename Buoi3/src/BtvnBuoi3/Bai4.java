package BtvnBuoi3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap A: ");
        int A = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap B: ");
        int B = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap C: ");
        int C = Integer.parseInt(scanner.nextLine());

        // điều_kiện ? giá_trị_đúng : giá_trị_sai;
        int trungVi = (A > B) ? ((A < C) ? A : ((B > C) ? B : C)) : ((B < C) ? B : ((A > C) ? A : C));
        System.out.println("So trung vi: " + trungVi);
    }
}
