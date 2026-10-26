# Java Shapes Drawing Application

## Overview
This is a Java desktop application that renders geometric shapes like circles and cubes. It reads shape definitions (type and dimensions) from an external text file (`input.txt`), calculates their total areas, and visualizes them on a graphical interface using Java Swing. The total area sum and individual shape details are also exported to an output file (`sumAreas.txt`).

## Features
- **File I/O Processing:** Dynamically reads shape data from `input.txt` and outputs calculations to `sumAreas.txt`.
- **Graphical User Interface (GUI):** Visualizes the geometric shapes (Circles and 3D Cubes) using Java Swing (`JPanel` and `Graphics`).
- **Object-Oriented Design:** Implements core OOP principles including:
  - **Inheritance:** `Circle` and `Cube` classes inherit from abstract classes `Shape` and `ThreeDShape`.
  - **Polymorphism:** Unified handling of shapes through the `Drawable` interface.
  - **Encapsulation:** Private fields accessed via getters and setters with validation (e.g., ensuring positive radius/side values).
- **Mathematical Calculations:** Automatically calculates perimeter, area, and volume depending on the shape type.

## Architecture & Class Structure
- `Drawable.java` (Interface): Defines the `HowToDraw()` method.
- `Shape.java` (Abstract Class): Implements `Drawable`, tracks color and creation date, defines abstract methods for Area and Perimeter.
- `ThreeDShape.java` (Abstract Class): Extends `Shape`, adds abstract method for Volume.
- `Circle.java` (Class): Extends `Shape`, calculates Circle math, manages radius.
- `Cube.java` (Class): Extends `ThreeDShape`, calculates Cube math, manages side length.
- `DrawingFrame.java` (Class): Java Swing JFrame containing a custom JPanel to visually draw the shapes based on their properties.
- `Project26.java` (Main Class): Handles File I/O, instantiates shape objects, sums total areas, and launches the GUI.

## How to Run
1. Ensure you have Java (JDK) installed.
2. Compile the Java files.
3. Create a file named `input.txt` in the root directory. Format: `[total_shapes] [shape_type] [dimension]...` (e.g., `2 circle 5 cube 10`).
4. Run `Project26.java`.
5. Check the generated `sumAreas.txt` and view the popup GUI window.