import java.util.*;

public class NearBy_Cars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distsq;

        public Point(int x, int y, int distsq) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
        }

        @Override
        public int compareTo(Point p2) {
            return Integer.compare(this.distsq, p2.distsq);
        }
    }

    public static void main(String args[]) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { 2, 4 } };
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distsq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distsq));
        }

        // nearest k cars
        for (int i = 0; i < k; i++) {
            Point p = pq.remove();
            System.out.println("Car (" + p.x + ", " + p.y + ")");
        }
    }
}
