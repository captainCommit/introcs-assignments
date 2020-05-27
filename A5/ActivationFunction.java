public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (x > 0)
            return 1.0;
        else if (x < 0)
            return 0.0;
        else if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }
        else
            return 0.5;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }
        return (1.0) / (1.0 + Math.exp(-1.0 * x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        double tanh = (Math.exp(x) - Math.exp(-1.0 * x))/(Math.exp(x) + Math.exp(-1.0 * x));
        if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }

        else if (x <= -20) {
            return -1;
        }
        else if (x >= 20) {
            return 1;
        }
        else
            return (tanh);
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }
        else if (x == Double.POSITIVE_INFINITY) {
            return 1;
        }
        else if (x == Double.NEGATIVE_INFINITY) {
            return -1;
        }
        return x / (1 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }
        if (x <= -2)
            return -1;
        else if (x < 0)
            return x + (Math.pow(x, 2)) / (4.0);
        else if (x < 2)
            return x - (Math.pow(x, 2)) / (4.0);
        else
            return 1.0;
    }
    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double d = Double.parseDouble(args[0]);
        System.out.println("heaviside("+d+") = "+heaviside(d));
        System.out.println("sigmoid("+d+") = "+sigmoid(d));
        System.out.println("tanh("+d+") = "+tanh(d));
        System.out.println("softsign("+d+") = "+softsign(d));
        System.out.println("sqnl("+d+") = "+sqnl(d));
    }
}