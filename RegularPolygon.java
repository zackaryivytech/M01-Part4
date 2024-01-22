public class RegularPolygon {


    private int n = 3;

    private double side = 1;

    private double x = 0;
    private double y = 0;

    public RegularPolygon(){

    }

    public RegularPolygon(int n, int side){
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, int side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;

    }

    public int getNumberSides(){
        return n;
    }

    public double sideLength(){
        return side;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;

    }

    public void setNumSides(int n){
        this.n = n;
    }

    public void setLength(double side){
        this.side = side;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getPerimeter(){
        return side * n;
    }

    public double getArea(){
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }



}

