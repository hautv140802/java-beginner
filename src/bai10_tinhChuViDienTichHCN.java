import java.util.Scanner;

public class bai10_tinhChuViDienTichHCN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập chiều rộng b: ");
        double b = sc.nextDouble();

        double s = a * b;
        double p = (a+b)*2;

        System.out.println("Diện tích s= " + s);
        System.out.println("Chu vi p= " + p);

    }
}
