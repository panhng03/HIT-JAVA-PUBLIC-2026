import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo công cụ quét dữ liệu đầu vào chuẩn (bàn phím)
        Scanner scanner = new Scanner(System.in);
        // 1. Tinh chu vi va dien tich hcn
        System.out.print("Nhap chieu dai: ");
        int dai = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap chieu rong: ");
        int rong = Integer.parseInt(scanner.nextLine());
        System.out.println("Chu vi " + (dai + rong) * 2);
        System.out.println("Dien tich " + (dai * rong));
        // 2. Kiem tra nam nhuan
        System.out.print("Nhap nam: ");
        int year = Integer.parseInt(scanner.nextLine());
        if((year % 4 == 0) && ((year & 100) != 0) || (year % 400 == 0)){
            System.out.println("Nam nhuan");
        }
        else{
            System.out.println("Khong phai nam nhuan");
        }
        // 3. Nhap n, tính n! va tong chan tu 1 den n
        System.out.print("Nhap n: ");
        int n = Integer.parseInt(scanner.nextLine());
        long gt = 1;
        for(int i = 1; i<=n; i++){
            gt += i;
        }
        int tongchan = 0;
        for(int i = 2; i<=n; i += 2){
            tongchan += i;
        }
        System.out.println("giai thua: " + gt);
        System.out.println("tongchan: " + tongchan);
        // 4. Dao nguoc so nguyen va kiem tra so doi xung
        int songuyen = 1234;
        int sobandau = songuyen;
        int sodao = 0;
        while(songuyen != 0){
            int socuoi = songuyen % 10;
            sodao = sodao * 10 + socuoi;
            songuyen = songuyen / 10;
        }
        System.out.println("So dao" + sodao);
        if( sobandau == sodao){
            System.out.println("So doi xung");
        }
        else{
            System.out.println("Khong phai so doi xung");
        }
        // 5. Bang cuu chuong, tam giac dau sao va duyet mang for each
        for(int i = 1; i <= 9; i++){
            System.out.println("Bang" +i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + "x" + j + "=" + (i*j) );
            }
            System.out.println();
        }

        for(int
            i = 1; i <= 3; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int[] mang = {7,8,9,10};
        for(int x : mang ){
            System.out.println(x);
        }
    }

}

