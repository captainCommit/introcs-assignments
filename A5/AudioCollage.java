public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = alpha*a[i];
        }
        return res;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        int n = a.length-1;
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[n-i];
        }
        return res;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] res = new double[a.length+b.length];
        int i = 0;
        for (i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        for (int j = 0; j < b.length; j++, i++) {
            res[i] = b[j];
        }
        return res;
    }
    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] c;
        if (a.length < b.length) {
            c = new double[b.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
            }
            for (int i = 0; i < c.length; i++) {
                c[i] += b[i];
            }
        }
        else {
            c = new double[a.length];
            for (int i = 0; i < b.length; i++) {
                c[i] = b[i];
            }
            for (int i = 0; i < c.length; i++) {
                c[i] += a[i];
            }
        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] b = new double[(int) (a.length / alpha)];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[(int) (i * alpha)];
        }
        return b;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] v1 = amplify(StdAudio.read("cow.wav"), 20);
        //StdAudio.play(v1);
        double[] w = reverse(StdAudio.read("piano.wav"));
        //StdAudio.play(w);
        double[] x = merge(StdAudio.read("buzzer.wav"), StdAudio.read("cow.wav"));
        StdAudio.play(x);
        double[] y = mix(StdAudio.read("dialup.wav"), StdAudio.read("singer.wav"));
        StdAudio.play(y);
        double[] z = changeSpeed(StdAudio.read("cow.wav"), 0.25);
        StdAudio.play(z);
    }
}