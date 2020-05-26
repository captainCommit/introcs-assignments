public class RandomWalker {
    public static void main(String[] args) {
        int dist = Integer.parseInt(args[0]);
        if (dist == 0) {
            System.out.println("(0, 0)\nsteps = 0\n");
            return;
        }
        int startX = 0;
        int startY = 0;
        int x = startX;
        int y = startY;
        int count = 0;
        while (true) {
            System.out.println("("+x+", "+y+")");
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
            if (Math.abs(x-startX)+Math.abs(y-startY) >= dist)
            {
                count++;
                System.out.println("("+x+", "+y+")");
                break;
            }
            count++;
        }
        System.out.println("steps = "+count);     
    }
}