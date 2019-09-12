import edu.princeton.cs.introcs.StdIn;

public class ShannonEntropy {
    private static int count = 0;
    private static double entropy = 0.0;

    private static double log2(double n) {
        return Math.log(n) / Math.log(2);
    }

    private static double calcTerm(double frequency) {
        double proportion = frequency / count;
        return -(proportion * log2(proportion));
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] intSequence = new int[m + 1];

        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            System.out.println(n);
            intSequence[n]++;
            count++;
        }

        for (int var : intSequence) {
            System.out.println(var);
        }

        for (int i = 1; i < intSequence.length; i++) {
            entropy += calcTerm(intSequence[i]);
            System.out.println(entropy);
        }

        System.out.println(entropy);

    }
}
