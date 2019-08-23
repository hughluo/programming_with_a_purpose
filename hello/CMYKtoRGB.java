public class CMYKtoRGB {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);

        double white = 1 - k;
        long r = Math.round(255 * white * (1 - c));
        long g = Math.round(255 * white * (1 - m));
        long b = Math.round(255 * white * (1 - y));

        System.out.println("red   = " + r);
        System.out.println("green = " + g);
        System.out.println("blue  = " + b);


    }
}