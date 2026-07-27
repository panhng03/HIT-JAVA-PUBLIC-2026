package BtvnBuoi3;

import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(201);
        System.out.println(a + "+" + b + "=" + c);

        System.out.println("Nhap phep tinh dung hoac sai: ");
        String traLoi = scanner.nextLine();
        if((a + b == c && traLoi.equalsIgnoreCase("phep tinh dung")) || (a + b != c && traLoi.equalsIgnoreCase("pheo tinh sai")) ){
            System.out.println("Ban da tra loi dung");
        }
        else{
            System.out.println("Ban da tra loi sai");
        }
    }
}
