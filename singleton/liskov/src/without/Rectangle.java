package without;

public class Rectangle {


    protected int width;
    protected int heigth;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }


    public int calculateArea() {
        return width * heigth;

    }
}

class Square extends Rectangle{
    public void setWidth(int width) {
        this.width = width;
        this.heigth=width;
    }
    public void setHeight(int height) {
        this.heigth = height;
        this.width=height;
    }
}


class Initialize{
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.setHeigth(4);
        r.setWidth(5);
        System.out.println(r.calculateArea());
    }
}