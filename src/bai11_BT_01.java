import java.util.Scanner;

public class bai11_BT_01 {
    public static void main(String[] args) {
        // Tìm x và y khi biết tổng và hiệu của chúng

        Scanner sc = new Scanner(System.in);

        System.out.println("Vui lòng nhập tổng 2 số x + y: ");
        double sum = sc.nextDouble();
        System.out.println("Vui lòng nhập hiêệu 2 số x - y: ");
        double diff = sc.nextDouble();

        double x =(double) (sum + diff) / 2;
        double y = sum - x;
        System.out.println("x= " + x);
        System.out.println("y= " + y);

    }
}
