package ch18pc03;

/**
 * 
 * @author frank
 */
public class Ch18pc03 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Create some Point objects.
        Point<Integer> p1 = new Point<Integer>(1, 1);
        Point<Integer> p2 = new Point<Integer>(2, 2);
        Point<Integer> p3 = new Point<Integer>(3, 3);
        Point<Integer> p4 = new Point<Integer>(4, 4);
  
        // Create a PointList object.
        PointList<Point<Integer>> plist = new PointList<Point<Integer>>();

        // Add the Point objects to the PointList.
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        plist.add(p4);
  
        // Display the list elements.
        System.out.println(plist);
    }

}
