
public class TestMove1 {
    public final static int X_MAX= 64;
    public final static int Y_MAX= 24;
    public final static float WIDTH= 0.5f;

    public static void main (String [] args){
        StdDraw.setXscale(-WIDTH, X_MAX+WIDTH);
        StdDraw.setYscale(-WIDTH, Y_MAX+WIDTH);
        for( int y= Y_MAX; y >= 0; --y){
            for(int x= 0; x <= X_MAX; ++x){
                StdDraw.clear(StdDraw.GRAY);
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledCircle(x, y, WIDTH);
                // display and pause for 20 ms
                StdDraw.show(20);
            }
        }
    }
}