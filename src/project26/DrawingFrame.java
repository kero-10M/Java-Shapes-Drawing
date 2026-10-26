package project26;

import javax.swing.*;
import java.awt.*;

public class DrawingFrame extends JFrame {
    
    private Drawable[] shapesToDraw;

    public DrawingFrame(Drawable[] shapes) {
        this.shapesToDraw = shapes;
        
        setTitle("Project 26 - Final Shape Drawer");
        setSize(800, 600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JScrollPane scrollPane = new JScrollPane(new DrawingPanel());
        add(scrollPane);
    }

    private class DrawingPanel extends JPanel {
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(2000, 800); 
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            int scale = 5; 
            int x = 50;    
            int y = 100;
            
            g.setFont(new Font("Arial", Font.BOLD, 14));
            FontMetrics metrics = g.getFontMetrics(); 

            if (shapesToDraw == null) return;

             for (Drawable d : shapesToDraw) {
                if (d instanceof Shape) {
                    Shape currentShape = (Shape) d;
                    Color shapeColor = getColorFromString(currentShape.getColor());
                    g.setColor(shapeColor);
                    
                    String label = "";    
                    int shapeWidth = 0;   
                    
                    if (d instanceof Circle) {
                        Circle c = (Circle) d;
                        int radius = (int) c.getRad();
                        int diameter = (radius * 2) * scale; 
                        shapeWidth = diameter;
                        label = "Circle (" + c.getRad() + ")";
                        
                        g.fillOval(x, y, diameter, diameter);
                        g.setColor(Color.BLACK);
                        g.drawOval(x, y, diameter, diameter);
                        
                    } else if (d instanceof Cube) {
                        Cube c = (Cube) d;
                        int side = (int) c.getSide();
                        int s = side * scale; 
                        int depth = s / 2;
                        
                        shapeWidth = s + depth; 
                        
                        label = "Cube (" + c.getSide() + ")";
                        
                        g.setColor(shapeColor);
                        g.fillRect(x, y + depth, s, s); 
                        g.setColor(Color.BLACK);
                        g.drawRect(x, y + depth, s, s);
                        
                        Polygon topFace = new Polygon();
                        topFace.addPoint(x, y + depth);
                        topFace.addPoint(x + depth, y);
                        topFace.addPoint(x + s + depth, y);
                        topFace.addPoint(x + s, y + depth);
                        
                        g.setColor(shapeColor.darker()); 
                        g.fillPolygon(topFace);
                        g.setColor(Color.BLACK);
                        g.drawPolygon(topFace);
                        
                        Polygon sideFace = new Polygon();
                        sideFace.addPoint(x + s, y + depth);
                        sideFace.addPoint(x + s + depth, y);
                        sideFace.addPoint(x + s + depth, y + s);
                        sideFace.addPoint(x + s, y + s + depth);
                        
                        g.setColor(shapeColor.darker());
                        g.fillPolygon(sideFace);
                        g.setColor(Color.BLACK);
                        g.drawPolygon(sideFace);
                    }
                    g.setColor(Color.BLACK); 
                    g.drawString(label, x, y - 10);
                    
                    int textWidth = metrics.stringWidth(label);
                    
                    int spaceNeeded = Math.max(shapeWidth, textWidth);
                    
                    x += spaceNeeded + 50;
                }
            }
        }
        
        private Color getColorFromString(String colorName) {
            if (colorName == null) return Color.BLACK;
            
            switch (colorName.toLowerCase()) {
                case "red": return Color.RED;
                case "blue": return Color.BLUE;
                case "green": return Color.GREEN;
                case "yellow": return Color.YELLOW;
                case "black": return Color.BLACK;
                case "white": return Color.WHITE;
                case "orange": return Color.ORANGE;
                case "gray": return Color.GRAY;
                case "cyan": return Color.CYAN;
                case "magenta": return Color.MAGENTA;
                case "pink": return Color.PINK;
                default: return Color.DARK_GRAY; 
            }
        }
    }
}