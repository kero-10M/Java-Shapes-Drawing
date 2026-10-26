
package project26;
 
public abstract class ThreeDShape extends Shape 
{

    public ThreeDShape() {
    }

    public ThreeDShape(String Color) {     
        super(Color);
    }
    
 public abstract double getVolume();   
}
