import java.util.HashSet; 
public class Ramanujan {

    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        if (n < 0) 
            return false;
        int cnt = 0;
        int len = (int) Math.round(Math.cbrt(n));
        HashSet<Long> s = new HashSet<Long>();
        long[] els = new long[len];
        for ( int i = 1; i <= len; i++) {
            els[i-1] = (long) i * (long) i * (long) i ;
        }
        for (int i = 0; i < els.length; i++) {
            long temp = n - els[i];
            if (s.contains(temp)) {
                cnt++;
            }
            s.add(els[i]);
        }
        return cnt >= 2;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(isRamanujan(n));
    }
}