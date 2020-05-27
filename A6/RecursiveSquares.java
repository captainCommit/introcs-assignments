public class RecursiveSquares {

    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, length / 2);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, length / 2);
    }

    // Draws a recursive square pattern of order n, centered on (x, y)
    // of the given side length.
    public static void draw(int n, double x, double y, double length) {
        if (n == 0) return;

        double x0 = x - length / 2;
        double x1 = x + length / 2;
        double y0 = y - length / 2;
        double y1 = y + length / 2;

        double ratio = 2;

        draw(n - 1, x0, y1, length / ratio);
        draw(n - 1, x1, y1, length / ratio);
        drawSquare(x, y, length);
        draw(n - 1, x0, y0, length / ratio);
        draw(n - 1, x1, y0, length / ratio);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double x = 0.5;
        double y = 0.5;
        double size = 0.5;

        draw(n, x, y, size);
    }
}