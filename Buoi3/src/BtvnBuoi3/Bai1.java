package BtvnBuoi3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.print("Nhap ban kinh: ");
         double r = Double.parseDouble(scanner.nextLine());

         if(r > 0 && r < 1000){
             double pi = 3.14;
             System.out.printf("Chu vi: %.3f \n", 2*pi*r);
             System.out.printf("Dien tich: %.3f \n", pi*r*r);
         }
         else{
             System.out.println("Ban kinh khong hop le");
         }
    }
}

