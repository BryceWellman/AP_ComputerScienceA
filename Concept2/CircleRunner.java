

public class CircleRunner {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10);
        Circle hisCircle = new Circle();
        Circle herCircle = new Circle();

        System.out.println(myCircle.getArea());
        System.out.println(hisCircle.getArea());

        hisCircle.setRadius(5);
        herCircle.setRadius(2 * hisCircle.getRadius());

        System.out.println(hisCircle.getArea());
        System.out.println(herCircle.getArea());
    }
}
