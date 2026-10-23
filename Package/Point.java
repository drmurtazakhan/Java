package ics201.lab01.graphics;
public class Point {
        private double x;
        private double y;
        public Point(double x, double y) {
               this.x=x;
               this.y=y;
        }
        public Point() {
               this(0.0, 0.0);
        }
        public double distanceToOrigin() {
               return Math.sqrt((x * x) + (y * y));
        }
        public double distanceToPoint(Point p) {
               return Math.sqrt(((x-p.x)*(x-p.x))+((y-p.y)*(y-p.y)));
        }
        public void moveTo(double x, double y) {
               this.x=x;
               this.y=y;
        }
        public void translate(double dx, double dy) {
               x += dx;
               y += dy;
        }
        public double getX() {
               return x;
        }
        public  double getY() {
               return y;
        }
        public String toString() {
               return "("+x+", "+y+")";
        }
        public boolean equals(Point p) {
               return this.x == p.x && this.y == p.y;
        }
}


