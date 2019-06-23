package ch18pc03;

import java.util.ArrayList;

/**
 * 
 * @author frank
 */
public class PointList<E extends Point<?>>{
    // Fields
    private ArrayList<E> myArray = new ArrayList<E>(0);
    
    public void add(Point p) {
        myArray.add((E) p);
    }
}