# Java Shapes Drawing Application

## Overview
A Java desktop application that draws geometric shapes (circles and cubes). It reads shape definitions (type and dimension) from a text file (`input.txt`), calculates their areas, and draws them in a Java Swing window. The total area and the details of each shape are written to an output file (`sumAreas.txt`).

## Features
- **File I/O:** Reads shape data from `input.txt` and writes the results to `sumAreas.txt`.
- **Graphical User Interface:** Draws circles and 3D cubes with Java Swing (`JPanel` and `Graphics`).
- **Object-Oriented Design:**
  - **Inheritance:** `Circle` and `Cube` inherit from the abstract classes `Shape` and `ThreeDShape`.
  - **Polymorphism:** Shapes are handled through the `Drawable` interface.
  - **Encapsulation:** Private fields with getters and setters that validate values (for example, a positive radius or side).
- **Calculations:** Perimeter, area and volume, depending on the shape type.

## Class Structure
7 types: 1 interface, 2 abstract classes and 4 classes.
- `Drawable.java` (interface): defines the `HowToDraw()` method.
- `Shape.java` (abstract class): implements `Drawable`, stores color and creation date, declares abstract methods for area and perimeter.
- `ThreeDShape.java` (abstract class): extends `Shape`, adds an abstract method for volume.
- `Circle.java` (class): extends `Shape`, calculates circle area and perimeter, stores the radius.
- `Cube.java` (class): extends `ThreeDShape`, calculates cube area, perimeter and volume, stores the side length.
- `DrawingFrame.java` (class): Swing `JFrame` with a custom `JPanel` that draws the shapes.
- `Project26.java` (main class): reads the file, creates the shapes, sums the areas and opens the window.

## How to Run
1. Install a JDK (Java 8 or newer).
2. Create `input.txt` in the project root, in the format `[total_shapes] [shape_type] [dimension]...` (for example `2 circle 5 cube 10`).
3. From the project root, compile and run:
   ```bash
   javac -d out src/project26/*.java
   java -cp out project26.Project26
   ```
4. Open the generated `sumAreas.txt` and look at the drawing window.

## Author
Kerollus Adel. Individual work.
