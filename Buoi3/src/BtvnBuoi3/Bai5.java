package BtvnBuoi3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int dem = 0;
        int giaTriTruoc = arr[0];
        int giaTriHienTai = arr[1];
        int viTri = 0;
        for(int x : arr){
            if(viTri >= 2){
                if(giaTriHienTai > giaTriTruoc && giaTriHienTai > x){
                    dem++;
                }
                giaTriTruoc = giaTriHienTai;
                giaTriHienTai = x;
            }
            viTri ++;
        }
        System.out.println(dem);
    }
}
