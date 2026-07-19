import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mat khau: ");
        String matKhau = scanner.nextLine();

        String xoaKhoangTrang= matKhau.trim();
        int doDai = xoaKhoangTrang.length();

        boolean coSo = false;
        boolean coChuHoa = false;

        for (int i = 0; i < doDai; i++) {
            char c = xoaKhoangTrang.charAt(i);

            if (c >= '0' && c <= '9') {
                coSo = true;
            }

            if (c >= 'A' && c <= 'Z') {
                coChuHoa = true;
            }
        }

        if (doDai >= 8 && coSo && coChuHoa) {
            System.out.println("Mat khau hop le.");
        } else {
            System.out.println("Mat khau khong hop le.");

            if (doDai < 8) {
                System.out.println("- Mat khau phai co it nhat 8 ky tu.");
            }

            if (!coSo) {
                System.out.println("- Mat khau phai co it nhat 1 chu so.");
            }

            if (!coChuHoa) {
                System.out.println("- Mat khau phai co it nhat 1 chu cai viet hoa.");
            }
        }

    }
}
