class TwoShape3 {
    private double width;
    private double height;

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


class Triangle3 extends TwoShape3 {
    String style;


    Triangle3(String s, double w, double h) {
        setHeight(w);
        setHeight(h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}


public class Shapes3 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("закрашеный", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("контурный", 8.0, 12.0);


        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t1.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());


    }
}

