public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] probs = new int[args.length];
        for (int i = 1; i < args.length; i++) {
            probs[i] = Integer.parseInt(args[i]);
        }
        for (int i = 1; i < args.length; i++) {
            probs[i] = probs[i] + probs[i-1];
        }
        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random()*probs[probs.length-1]);
            for (int j = 1; j < probs.length; j++) {
                if (probs[j-1] <= r && probs[j] > r) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}