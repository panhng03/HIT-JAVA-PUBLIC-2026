import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thông tin nhân viên: ");
        String chuoi = scanner.nextLine();

        chuoi = chuoi.trim();

        String[] thongTin = chuoi.split("-");

        if (thongTin.length < 4) {
            System.out.println("Thông tin không đúng định dạng!");
            return;
        }

        String maNhanVien = thongTin[0].trim();
        String hoTen = thongTin[1].trim();
        String namSinh = thongTin[2].trim();
        String phongBan = thongTin[3].trim();

        hoTen = chuanHoaHoTen(hoTen);

        if (phongBan.toLowerCase().contains("kỹ thuật")
                || phongBan.toLowerCase().contains("ky thuat")) {
            System.out.println("Phân loại: Nhân viên kỹ thuật");
        } else {
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }

        int tuoi = 2026 - Integer.parseInt(namSinh);
        System.out.println("Mã nhân viên: " + maNhanVien
                + " | Họ và tên: " + hoTen
                + " | Tuổi: " + tuoi
                + " | Bộ phận: " + phongBan);
    }

    public static String chuanHoaHoTen(String hoTen) {

        String[] cacTu = hoTen.split("\\s+");

        String ketQua = "";

        for (int i = 0; i < cacTu.length; i++) {

            String tu = cacTu[i];

            String chuDau = tu.substring(0, 1).toUpperCase();
            String chuSau = tu.substring(1).toLowerCase();

            ketQua += chuDau + chuSau;

            if (i < cacTu.length - 1) {
                ketQua += " ";
            }
        }

        return ketQua;
    }
}
