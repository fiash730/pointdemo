class Points {
    private double x;
    private double y;
    Points (double x ,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle{

    private double r;
    Circle(double r){
        this.r = r;
    }
    int bijiao(Points P){
        double xxyy = P.getX() * P.getX() * P.getY() *P.getY();
        double rr = this.r * this.r;

        if (xxyy > rr)
        {
            return  1;
        }
        else if (xxyy < rr)
        {
           return -1;
        }
        else
        {
            return 0;
        }


    }
}

public class Main {

    public static void main(String[] args) {
        Points P = new Points(3,4);
        Circle C = new Circle(5);
        System.out.println(C.bijiao(P));

    }
}
