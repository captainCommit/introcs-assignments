/**
 * Inversions
 */
public class Inversions {

    public static long count(int[] a) {
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1 ;j < a.length; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        if(n == 0) {
            int[] arr = {};
            return arr;
        }
        int t, m, i, j;
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = i;
        }
        for (t = 1; ((long) t * (long) (t-1)) / 2 < k; t++);
        t--;
        m = (int) k - (t * (t - 1))/2;
        for (i = 0, j = t - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int temp = arr[t];
        for (i = t; i > t - m; i--) {
            arr[i] = arr[i - 1];
        }
        arr[t - m] = temp;
        return arr;
    }
   public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        print(generate(n, k));
   } 
}