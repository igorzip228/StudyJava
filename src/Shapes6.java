class TwoShape6 {
    private double width;
    private double height;
    private String name;

    TwoShape6() {
        width = height = 0.0;
    }

    TwoShape6(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoShape6(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoShape6(TwoShape6 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }


    // методы доступа к закрытым переменным экземпляра width и height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    double area() {
        System.out.println("Метод   area() должен быть переопределен");
        return 0.0;
    }
}


class Triangle6 extends TwoShape6 {
    String style;

    Triangle6(double v) {
        super();
        style = "none";
    }

    Triangle6(String s, double w, double h) {
        super(w, h, "треугольник");

        style = "закрашенный";
    }

    Triangle6(Triangle6 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Rectangle extends TwoShape6 {
    Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "прямоугольник");
    }

    Rectangle(double x) {
        super(x, "прямоугольник");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getHeight() == getHeight())
            return true;
        return false;
    }
}


public class Shapes6 {
    public static void main(String[] args) {
        TwoShape6 shapes[] = new TwoShape6[5];

        shapes[0] = new Triangle6("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle6(7.0);
        shapes[4] = new TwoShape6(10, 20, "фигура");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("ббъект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();
        }
    }
}