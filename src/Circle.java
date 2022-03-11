public class Circle extends Figura{
    double r;
    double PI = 3.1415;
    public Circle (double r){
        this.r=r;
    }
    public double area(){
        return 2*(PI*this.r);
    }
}
