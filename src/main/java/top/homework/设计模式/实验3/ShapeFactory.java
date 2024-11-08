package top.homework.设计模式.实验3;
/*
 * @author  MaRui
 * @date  2024/10/24 9:28
 * @version 1.0
 */


/**
 * @author MaRui
 */
public class ShapeFactory {
    public Shape createShape(String shapeType) throws UnSupportedShapeException {
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else {
            throw new UnSupportedShapeException("Shape " + shapeType + " is not supported.");
        }
    }
}