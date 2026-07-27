package BtvnBuoi3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        boolean doiXung = true;
        for(int i = 0; i<chuoi.length()/2l; i++){
            if(chuoi.charAt(i) != chuoi.charAt(chuoi.length()-1-i)){
                doiXung = false;
                break;
            }
        }
        if(doiXung){
            System.out.println(chuoi.toUpperCase() + " chuoi doi xung");
        }
        else{
            System.out.println(chuoi.toLowerCase() + " chuoi nay khong doi xung");
        }
    }
}
