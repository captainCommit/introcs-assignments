public class WorldMap {
    public static void main(String[] args) {
        int w = StdIn.readInt();
        int h = StdIn.readInt();
        StdDraw.enableDoubleBuffering();
        StdDraw.setCanvasSize(w, h);
        StdDraw.setXscale(0.0, (double) w);
        StdDraw.setYscale(0.0, (double) h);
        while (!StdIn.isEmpty()) {
            StdIn.readString();
            int n = StdIn.readInt();
            double[] x = new double[n];
            double[] y = new double[n];
            for (int i = 0; i < n; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }
    }
    
}