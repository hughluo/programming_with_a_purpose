public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int xStart = 0;
        int yStart = 0;

        int allSteps = 0;

        for (int i = 0; i < n; i++) {
            int xNow = 0;
            int yNow = 0;
            int step = 0;

            while (Math.abs(xStart - xNow) + Math.abs(yStart - yNow) != r) {
                int d = (int) (Math.random() * 4);
                if (d == 0) xNow = xNow + 1;
                else if (d == 1) xNow = xNow - 1;
                else if (d == 2) yNow = yNow + 1;
                else yNow = yNow - 1;
                step++;
            }
            allSteps += step;
        }
        double avgSteps = (double) allSteps / n;
        System.out.println("average number of steps = " + avgSteps);
    }
}