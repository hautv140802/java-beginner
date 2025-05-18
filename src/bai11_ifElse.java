import java.util.Scanner;

public class bai11_ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời nhập vào dtb: ");
        double dtb = sc.nextDouble();

        // kiểm tra điều kiện
        /*if (dtb > 5.0)
            System.out.println("Bạn đỗ");
        else System.out.println("Bạn đã tạch");*/

        // xếp loại
        if (dtb >= 8 && dtb <=10) {
            System.out.println("Bạn xl giỏi!");
        } else if (dtb >=7 && dtb<8) {
            System.out.println("Bạn xl khá!");
        } else {
            System.out.println("Bạn xl TB!");
        }
    }

}
