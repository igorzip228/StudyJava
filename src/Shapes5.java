
class TwoShape5 {
    private double width;
    private double height;

    TwoShape5() {
        width = height = 0.0;
    }

    TwoShape5(double w, double h) {
        width = w;
        height = h;
    }

    TwoShape5(double x) {
        width = height = x;
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

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}


class Triangle5 extends TwoShape5 {
    String style;

    Triangle5() {
        super();
        style = "none";
    }

    Triangle5(String s, double w, double h) {
        super(w, h);

        style = s;
    }

    Triangle5(double x) {
        super(x);

        style = "закрашеный";
    }


    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}


public class Shapes5 {
    public static void main(String[] args) {
        Triangle5 t1 = new Triangle5();
        Triangle5 t2 = new Triangle5("контурный", 8.0, 12.0);
        Triangle5 t3 = new Triangle5(4.0);

        t1 = t2;

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        System.out.println("Информация о t3: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

    }
}