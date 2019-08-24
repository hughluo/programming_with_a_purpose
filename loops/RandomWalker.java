public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int xStart = 0;
        int yStart = 0;
        int xNow = 0;
        int yNow = 0;
        int step = 0;

        while (Math.abs(xStart - xNow) + Math.abs(yStart - yNow) != r) {
            System.out.println("(" + xNow + ", " + yNow + ")");
            int d = (int) (Math.random() * 4);
            if (d == 0) xNow = xNow + 1;
            else if (d == 1) xNow = xNow - 1;
            else if (d == 2) yNow = yNow + 1;
            else yNow = yNow - 1;
            step++;
        }
        System.out.println("(" + xNow + ", " + yNow + ")");
        System.out.println("steps = " + step);
    }
}