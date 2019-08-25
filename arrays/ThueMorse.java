
public class ThueMorse {
    public static void main(String[] args) {
        int len = Integer.parseInt(args[0]);
        boolean[] sequence = new boolean[len];

        // construct ThueMorse sequence
        for (int i = 1; i < len; i++) {
            int p = 0;
            while (i >= Math.pow(2, p)) {
                p++;
            }
            p = p - 1;
            int neg = i - (int) (Math.pow(2, p));
            sequence[i] = !sequence[neg];  
        }

        // print out pattern
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (sequence[j] == sequence[i]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.print('\n');
        }
    }
}