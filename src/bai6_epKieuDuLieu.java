public class bai6_epKieuDuLieu {
    public static void main(String[] args) {
        int a =5;
        int b = 10;
        double kq = (double) a/b;
        System.out.println("kq: " + kq);

        // ép kiểu hẹp
        int c = 128;
        byte d = (byte) c;
        System.out.println("c: "+ c);
        System.out.println("d: "+ d);

        int e = 15;
        byte f = (byte) e;
        System.out.println("e: " + e);
        System.out.println("f: " + f);
    }
}
