public class RandomWalkers {
    public static void main(String[] args) {
        int dist = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int netdist = 0;
        for (int j = 0; j < trials; j++) {
            int startx = 0;
            int starty = 0;
            int x = startx;
            int y = starty;
            int count = 0;
            if (dist == 0) {
                count = 0;
                continue;
            }
            while (true) {
                int dir = (int) (Math.random() * ((3) + 1))+1;
                switch(dir) {
                    case 1:
                        x++;
                        break;
                    case 2:
                        x--;
                        break;
                    case 3:
                        y++;
                        break;
                    case 4:
                        y--;
                        break;
                }
                if (Math.abs(x-startx)+Math.abs(y-starty) >= dist) {
                    count++;
                    break;
                }
                count++;
            }
            netdist += count;
        }
        double avg = ((double) netdist/ (double) trials);
        System.out.println("average number of steps = "+avg);
    } 
}