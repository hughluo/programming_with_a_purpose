public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int sum = 0;
        int[] aSequence = new int[args.length-1];

        for (int i = 1; i < args.length; i++) {
            int a = Integer.parseInt(args[i]);
            aSequence[i-1] = a;
            sum += a;
        }

        int[] distribution = new int[sum];
        int entry = 0;
        for (int i = 0; i < aSequence.length; i++) {
            for (int j = 0; j < aSequence[i]; j++) {
                distribution[entry] = i + 1;
                entry += 1;
            }
        }

        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * sum);
            System.out.print(distribution[r] + " ");
        }
        System.out.print('\n');
    
    }
}