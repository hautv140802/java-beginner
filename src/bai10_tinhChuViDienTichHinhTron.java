import java.util.Scanner;

public class bai10_tinhChuViDienTichHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào bán kính đường tròn r: ");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * r * r;

        // kết quả
        System.out.println("Chu vi là: " + cv);
        System.out.println("Diên tích là: "+ dt);




    }
}
