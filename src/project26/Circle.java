
package project26;

public class Circle extends Shape {
private double rad;

    public double getRad() {
        return rad;
    }

    public Circle(double rad, String Color) {
        super(Color);
        setRad(rad);
    }

    public Circle(double rad) {
        super();
        setRad(rad);
    }

    public void setRad(double rad) {
       if(rad>0)
        this.rad = rad;
       else
       {
       System.out.println("Warning: Radius must be positive! Setting to default 1.0");
            this.rad = 1.0;
       }
    }

    @Override
    public String toString() {
        return "Circle{Color =" + super.getColor()+", date = "+ super.getDateCreated()+ ", rad=" + rad + '}';
    }
    
@Override
    public double getArea() {
        return Math.PI*Math.pow(this.rad, 2);
    }

    
@Override
    public double getPerimeter() {
     return 2*Math.PI*this.rad;
    }

    
@Override
    public String HowToDraw() {
      return "Circle";
    }
    
}
