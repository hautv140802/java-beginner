public class bai9_toanTuLogic_TienTo_HauTo {
    public static void main(String[] args) {
        int i = 15;
        // kiểm tra giá trị i > 0 và i < 10 không
        System.out.println("i > 0 và i < 10 " + (i > 0 && i < 10));

        // kiểm tra i > 10 hoặc i < -1 không
        System.out.println("i > 10 hoặc i < -1 " + (i > 10 || i < -1));

        // phép phủ định
        System.out.println("phủ định i > 10 hoặc i < -1 " + !(i > 10 || i < -1));


        // toán tử tiền tố, hậu tố
        int x = 100;
        int y = 90;
        int z = 80;
        int t = 70;
        x++; // x= x + 1 => 101
        ++y; // => 91
        z --;
        --t;

        System.out.println("x= " +x);
        System.out.println("y= " +y);
        System.out.println("z= " +z);
        System.out.println("t= " +t);

        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1; // 1 - 3 + 1

      /*
      *   step1: ++b  =>3
      *   step 2: a = 1, b = 3 => 1 - 3 + 1
      *   step 3: c = -1
      *   step 4: a = 2
      * */

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
    }
}
