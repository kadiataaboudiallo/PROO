class Point2 {
    private int x, y;

    private void check() {
        if(x < 0) x = 0;
        if(y < 0 ) y = 0;
    }
    Point2() {}
    Point2(int v){
        x = y = v;
        check();
    }
    Point2(int xi, int yi){
        x = xi;
        y = yi;
        check();
    }
    void move(int dx, int dy){
        x += dx;
        y += dy;
        check();
    }
    void set(int xi, int yi){
        x = xi;
        y = yi;
        check();
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void print(){
        System.ou.println(x + ";" + y);
    }
}