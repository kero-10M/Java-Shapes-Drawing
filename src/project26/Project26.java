
package project26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Project26 {

    public static void main(String[] args) 
    {   
      
        Drawable[] shapes = null;

        try {
            File inputFile = new File("input.txt");
            Scanner sc = new Scanner(inputFile);
          

            if (sc.hasNextInt()) {
                int size = sc.nextInt();
                if (size < 2) {
                    System.out.println("Error: Minimum array size must be 2.");
                    return; 
                }
                shapes = new Drawable[size];
            }
            else{
                System.out.println("Error: File is empty or missing the array size at the beginning.");
                sc.close();
                return;
            }
            int i = 0;
            while (sc.hasNext() && i < shapes.length) {
                String type = sc.next();       
                if (!sc.hasNextDouble()) {
                    System.out.println("Warning: Skipping invalid data for " + type);
                    sc.next(); 
                    continue;  
                }
                double value = sc.nextDouble(); 

                if (type.equalsIgnoreCase("circle")) {
                    shapes[i] = new Circle(value, "green");
                } else if (type.equalsIgnoreCase("cube")) {
                    shapes[i] = new Cube(value, "blue");
                }
                else {
                    System.out.println("Unknown shape type: " + type);
                    continue; 
                }
                if (shapes[i] != null) i++;
            }
            sc.close();
            
            double totalArea = 0;
            for (Drawable d : shapes) {
                if (d instanceof Shape) {
                    totalArea += ((Shape)d).getArea();
                }
            }
            
            PrintWriter writer = new PrintWriter("sumAreas.txt");
            writer.println("Sum of all areas: " + totalArea);
            writer.println("\n--- Details ---");
            for(Drawable d : shapes) {
                if(d != null) writer.println(d.toString());
            }
            
            writer.close(); 
            
           System.out.println("Success! Processing finished. Check sumAreas.txt for results.");

           DrawingFrame gui = new DrawingFrame(shapes);
            gui.setVisible(true);
        } catch (FileNotFoundException e) {
           System.out.println("Error: input.txt file not found. Please ensure it is in the project root folder.");
        }
        
    }
}

    

