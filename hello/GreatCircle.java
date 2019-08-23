public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double x1r = Math.toRadians(x1);
        double y1r = Math.toRadians(y1);
        double x2r = Math.toRadians(x2);
        double y2r = Math.toRadians(y2);

        double r = 6371.0;
        double distance = 2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((x2r-x1r) / 2), 2) + Math.cos(x1r) * Math.cos(x2r) * Math.pow(Math.sin((y2r - y1r) / 2), 2)));
        System.out.println(distance + " kilometers");
    }
}