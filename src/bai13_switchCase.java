import java.util.Scanner;

public class bai13_switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");

        int n = sc.nextInt();

        int div = n % 2;

        switch (div){
            case 0 :
                System.out.println("Số chẵn");
                break;
            default:
                System.out.println("Số lẽ");
        }
    }
}
