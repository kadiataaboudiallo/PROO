class Point {
    private int x, y;  
    char l;             

    
    private void check() {
        if (x < 0) x = 0;
        if (y < 0) y = 0;
    }

    Point() {
        x = 0;
        y = 0;
        check();
    }

    Point(int v) {
        x = y = v;
        check();
    }
    Point(int xi, int yi) {
        x = xi;
        y = yi;
        check();
    }

    void move(int dx, int dy) {
        x += dx;
        y += dy;
        check();
    }

    void set(int xi, int yi) {
        x = xi;
        y = yi;
        check();
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void print() {
        System.out.println(x + ";" + y + ":" + l);
    }
}

public class Main {
    public static void main(String[] args) {
        Point pt = new Point();
        pt.print();   
        pt.l = 'o';   
        pt.set(5, 2); 
        pt.print();  
        pt.move(-6, 4); 
        pt.print();   

        Point pt1 = new Point(4);
        pt1.print();  

        Point pt2 = new Point(4, 5);
        pt2.print(); 
    }
}