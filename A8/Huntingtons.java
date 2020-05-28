public class Huntingtons {

    public static int maxRepeats(String dna) {
        int n = dna.length();
        int maxCount = 0;
        int count = 0;
        int i = 0;
        while (i <= n - 3) {
            if (dna.charAt(i) == 'C') {
                String condon = dna.substring(i, i + 3);
                if (condon.equals("CAG")) {
                    count++;
                    maxCount = Math.max(count, maxCount);
                    i += 3;
                    continue;
                }
            }
            count = 0;
            i++;
        }
        return maxCount;
    }
    public static String removeWhitespace(String s) {
        return s.replaceAll("[\\n\\t ]", "");
    }
    public static String diagnose(int maxRepeats) {
        if (maxRepeats >= 181)
            return "not human";
        if (maxRepeats >= 40)
            return "Huntington's";
        if (maxRepeats >= 36)
            return "high risk";
        if (maxRepeats >= 10)
            return "normal";
        else
            return "not human";
    }
    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);
        String data = in.readAll();
        String dna = removeWhitespace(data);
        int maxRepeats = maxRepeats(dna);
        StdOut.println("max repeats = " + maxRepeats);
        StdOut.println(diagnose(maxRepeats));
    }    
}