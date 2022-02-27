public class Shape {
    float area, perimeters;

    public Shape(float a, float p) {
        this.area = a;
        this.perimeters = p;
    }

    public static float Area(float w, float h) {
        return w * h;
    }

    public static float Perimeter(float w, float h) {
        return 2*(w+h);
    }

    public static float Area(float r) {
        float PI = 3.14f;
        return PI*(r*r);
    }

    public static float Perimeter(float r) {
        float PI = 3.14f;
        return 2*PI*r;
    }

    public static void main(String[] args) {
        float area = Area(10, 20);
        float perimeter = Perimeter(10, 20);

        Shape shape = new Shape(area, perimeter);
        System.out.println("Area of Rectangle: " + shape.area);
        System.out.println("Perimeter of Rectangle: " + shape.perimeters);

        area = Area(10);
        perimeter = Perimeter(10);
        shape = new Shape(area, perimeter);
        System.out.println("Area of Circle: " + shape.area);
        System.out.println("Perimeter of Circle: " + shape.perimeters);
    }
}
