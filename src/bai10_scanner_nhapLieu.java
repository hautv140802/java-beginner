import java.util.Scanner;

import java.util.Scanner;
public class bai10_scanner_nhapLieu {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng scanner
        Scanner sc = new Scanner(System.in);

        // nhập chuỗi
        System.out.println("Mời nhập vào mk cấp 1: ");
        String mk1 =sc.nextLine();
        System.out.println("mk cấp 1 là: " + mk1);

        // nhập số nguyên
        System.out.println("Mời nhập vào 1 số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("a= "+ a);

        // nhập số float
        System.out.println("Mời nhập vào 1 số thực x: ");
        float x = sc.nextFloat();
        System.out.println("x= "+ x);



    }
}
