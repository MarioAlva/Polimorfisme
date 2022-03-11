public class Figura extends Comparable{
    Figura []v = new Figura[4];
    Triangle w = new Triangle(5.3,6.5);
    Circle c = new Circle(7);
    Quadrat q = new Quadrat(5);
    Rectangle r = new Rectangle(7, 3.5);
    Triangle t = new Triangle(5.4, 3);
    double y = w.area();
    double y1 = c.area();
    double y2 = q.area();
    double y3 = r.area();
    double y4 = t.area();


}
