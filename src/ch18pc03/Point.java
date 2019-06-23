package ch18pc03;

/**
 * 
 * @author frank
 */
public class Point<T extends Number> {
    private T xCoordinate; // The X coordinate
    private T yCoordinate; // The Y coordinate

    public Point(T x, T y) {
        xCoordinate = x;
        yCoordinate = y;
    }


    public void setX(T x) {
        xCoordinate = x;
    }


    public void setY(T y) {
        yCoordinate = y;
    }

    public T getX() {
        return xCoordinate;
    }


    public T getY() {
        return yCoordinate;
    }
}
