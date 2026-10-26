
package project26;

public class Cube extends ThreeDShape {
private double side;

    public Cube(double side) 
    {
        this.getColor();
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side>0)
        this.side = side;
        else
        {
         System.out.println("Warning: Side must be positive! Setting to default 1.0");
            this.side = 1.0;   
        }
    }

    public Cube(double side, String Color) {
        super(Color);
        setSide(side);
    }

    @Override
    public String toString() {
        return "Cube{Color =" + super.getColor()+", date = "+ super.getDateCreated()+ ", side=" + side + '}';
    }


    @Override
    public double getVolume() {
    return Math.pow(side, 3);
    }

    @Override
    public double getArea() {
            return Math.pow(side, 2)*6;

    }

    @Override
    public double getPerimeter() {
    return  side*12;

    }

    @Override
    public String HowToDraw() {
    return "Cube";
    }
    
}
