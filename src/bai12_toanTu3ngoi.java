import java.util.Scanner;

public class bai12_toanTu3ngoi {

    public static void main(String[] args) {
        // Kiểm tra số nguyên nhập vào là chẵn hay lẻ

        Scanner sc = new Scanner(System.in);

        System.out.println("Mời nhập một số nguyên n: ");
        int n = sc.nextInt();

        String traLoi = n % 2 == 0 ? "Số chăn" : "Số lẽ";
        System.out.println("Số " + n + " là " + traLoi);



    }
}
