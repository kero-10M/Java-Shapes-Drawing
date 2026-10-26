
package project26;

import java.util.Date;


public abstract class Shape implements Drawable
{
  private Date dateCreated; 
  private String Color;

    public Shape()
    {
        this.dateCreated = new Date();
    }

    public Shape(String Color) {
        this.Color = Color;
        this.dateCreated = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
  public abstract double getArea();
  public abstract double getPerimeter();

    
    
    
}
