
public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        boolean[] birthday;
        int[] result = new int[367];

        for (int i = 0; i < trials; i++) {
            birthday = new boolean[n];
            int count = 0;
            while (true) {
                count++;
                int r = (int) (Math.random() * n);
                if (birthday[r]) break;
                else birthday[r] = true;
            }

            result[count]++;
        }

        int countSum = 0;
        for (int i = 1; i < result.length; i++) {
            countSum += result[i];
            double fraction = (double) countSum / trials;
            System.out.println(i + "\t" + result[i] + "\t" + fraction);
            if (fraction >= 0.5) break;
        }
    }
}