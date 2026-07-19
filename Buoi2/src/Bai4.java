import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng học sinh: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        double[] diem = new double[soLuong];

        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhập điểm học sinh thứ " + (i + 1) + ": ");
            diem[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Điểm cao nhất: " + timDiemCaoNhat(diem));
        System.out.printf("Điểm trung bình lớp: %.2f\n", tinhDiemTrungBinh(diem));
        System.out.println("Số học sinh dưới trung bình: " + demHocSinhDuoiTrungBinh(diem));
    }

    public static double timDiemCaoNhat(double[] diem) {
        double lonNhat = diem[0];

        for (double x : diem) {
            if (x > lonNhat) {
                lonNhat = x;
            }
        }

        return lonNhat;
    }

    public static double tinhDiemTrungBinh(double[] diem) {
        double tong = 0;

        for (double x : diem) {
            tong += x;
        }

        return tong / diem.length;
    }

    public static int demHocSinhDuoiTrungBinh(double[] diem) {
        int dem = 0;

        for (double x : diem) {
            if (x < 5.0) {
                dem++;
            }
        }

        return dem;
    }
}
