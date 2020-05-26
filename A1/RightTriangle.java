public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean x = a  > 0;
        boolean y = b > 0;
        boolean z = c > 0;
        boolean p = a*a+b*b == c*c;
        boolean q = b*b+c*c == a*a;
        boolean r = a*a+c*c == b*b;
        boolean exp = ((x && y && z) && (p || q || r));
        System.out.println(exp);
    }
}