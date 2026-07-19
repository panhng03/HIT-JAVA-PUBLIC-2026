import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap canh b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap canh c: ");
        int c = Integer.parseInt(scanner.nextLine());

        if(a + b > c && a + c > b && b + c > a){
            if(a == b && b == c){
                System.out.println("Day la tam giac deu");
            }
            else if (a == b || a == c){
                System.out.println("Day la tam giac can");
            }
            else{
                System.out.println("Day la tam giac thuong");
            }
            double p = (a + b + c)/2.0;
            System.out.printf("Chu vi tam giac: %.2f\n"+ 2*p);

            System.out.printf("Dien tich tam giac: %.2f\n", Math.sqrt(p*(p - a)*(p - b)*(p - c)));
        }
        else{
            System.out.println("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ.");
        }
    }
}
