import java.util.Scanner;

public class bai11_BT_02 {
    public static void main(String[] args) {
        /*
            Bài tập java 05: Viết chương trình nhập vào chiều cao, cân nặng, tính BMI và xuất ra thông báo
            BMI<15: Thân hình quá gầy
            BMI>=15 and BMI<16: Thân hình gầy
            BMI>=16 and BMI<18.5: Thân hình hơi gầy
            BMI>=18.5 and BMI<25:Thân hình bình thường
            BMI>=25 and BMI < 30: Thân hình hơi béo
            BMI >=30 and BMI<35: Thân hình béo
            BMI >=35: Thân hình quá béo
            Gợi ý cách tính: BMI=canNang/(chieuCao ^2)
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();

        double bmi = (double) weight / (Math.pow(height, 2));

        if (bmi >= 35)
            System.out.println("Thân hình quá béo");
        else if (bmi >= 30 && bmi < 35) {
            System.out.println("Thân hình béo");

        } else if (bmi >= 25 && bmi< 30) {
            System.out.println("Thân hình hơi béo");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Thân hình bình thường");
        } else if (bmi >= 16 && bmi <18.5) {
            System.out.println("Thân hình hơi gầy");
        } else {
            System.out.println("Thân hình quá gần");
        }
    }
}
