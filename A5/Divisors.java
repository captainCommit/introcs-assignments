public class Divisors {
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        }
        while (Math.abs(b) != 0) {
            int t = Math.abs(b);
            b = Math.abs(a) % Math.abs(b);
            a = t;
        }
        return Math.abs(a);
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        }
        int g = gcd(a, b);
        return  Math.abs(a) * Math.abs(b) / g;
    }
    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }
    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        int cnt = 1;
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            if (areRelativelyPrime(i, n))
                cnt++;
        }
        return cnt;
    }
    // Takes two integer command-line arguments a and b and prints each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
        System.out.println("lcm(" + a + ", " + b + ") = " + lcm(a, b));
        System.out.println("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a, b));
        System.out.println("totient(" + a + ") = " + totient(a));
        System.out.println("totient(" + b + ") = " + totient(b));
    }
}