class LPoint extends Point3{
    private char l;

    LPoint() {}
    LPoint(int v, char li){
        super(v);
        l = li
    }
    LPoint(int xi; int yi,char li){
        super(xi,yi);
        l = li;
    }
    void stl(int xl,int yi,char li){
        set(xi,yi);
        l = li;
    }
    char getl(){
        returnl;
    }
    void printl(){
        super.print();
        System.out.println(";" + l);
    }

}
public class Main{
    public static void main(String[] args){
        LPoint pt = new LPoint();
        pt.printl();
         pt.setl(5, 2, 'b');
          pt.printl();
           pt.move(-6, 4);
           pt.printl();
    }
}