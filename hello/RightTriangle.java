public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("false");
        } else {
            int h, c1, c2;
            if(a > b && a > c) {
                h = a;
                c1 = b;
                c2 = c;
            } else if (b > a && b > c) {
                h = b;
                c1 = a;
                c2 = c;
            }  else {
                h = c;
                c1 = a;
                c2 = b;
            }
            if(Math.pow(h, 2) == Math.pow(c1, 2) + Math.pow(c2, 2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}