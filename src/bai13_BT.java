import java.util.Scanner;

public class bai13_BT {
    public static void main(String[] args) {
    /*
        Viết chương trình khung tìm kiếm: cho người dùng nhập vào lựa chọn
        1. tìm theo tên
        2. tìm theo tác giả
        3. tìm theo nhà xuất bản
        4. tìm theo tiêu đề
        Thoát nếu phím bấm không hợp lệ
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhâp một phím bất kỳ: ");
        System.out.println("1. tìm theo tên");
        System.out.println("2. tìm theo tác giả");
        System.out.println("3. tìm theo nhà xuất bản");
        System.out.println("4. tìm theo tiêu đề");

        String key = sc.next();

        switch (key) {
            case "1":
                System.out.println("tìm theo tên");
                break;
            case "2":
                System.out.println("tìm theo tác giả");
                break;
            case "3":
                System.out.println("tìm theo nhà xuất bản");
                break;
            case "4":
                System.out.println("tìm theo tiêu đề");
                break;
            default:
                System.out.println("Thoát");
        }

    }
}
