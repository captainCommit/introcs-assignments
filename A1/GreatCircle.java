public class GreatCircle {

    public static void main(String[] args) {
        double r = 6371.0;
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double delX = (x2-x1)/2;
        double delY = (y2-y1)/2;
        double value = 2*r*Math.asin(Math.sqrt(Math.pow(Math.sin(delX), 2)+Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin(delY), 2)));
        System.out.println(value+" kilometers");
    }
}