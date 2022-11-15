public class Main {
    public static void main(String[] args) {

        Square square = new Square();
        System.out.println( square.getPerimeter());
        Triangle triangle = new Triangle();
        System.out.println(triangle.getPerimeter());
        Nonagon rhombus = new Nonagon();
        System.out.println(rhombus.getPerimeter());
        Hexagon hexagon = new Hexagon();
        System.out.println(hexagon.getPerimeter());
        Pentagon pentagon = new Pentagon();
        System.out.println(pentagon.getPerimeter());


    }
}