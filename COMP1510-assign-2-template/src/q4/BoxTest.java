package q4;

import java.util.Scanner;
/**
 * <p>The class which creates two box objects, complete with 
 * height, width, depth and whether they are full or not.</p>
 * @author Cameron
 * @version 1.0
 */
public class BoxTest {
    /**
     * <p>This is the main method which creates and modifies
     * two box objects based on the users input.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //A box object, ready for a user to modify.
        Box box2 = new Box(0, 0, 0);
        //The heights of the two boxes.
        int height1;
        int height2;
        //The widths of the two boxes.
        int width1;
        int width2;
        //The depths of the two boxes.
        int depth1;
        int depth2;
        //If a box is full.
        boolean full1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the height, width, "
                + "and depth of a box: ");
        height1 = scan.nextInt();
        width1 = scan.nextInt();
        depth1 = scan.nextInt();
        
        System.out.println("Please enther the height, width, "
                + "and depth of another box: ");
        height2 = scan.nextInt();
        width2 = scan.nextInt();
        depth2 = scan.nextInt();
        
        Box box1 = new Box(height1, width1, depth1);
        
        box2.setHeight(height2);
        box2.setWidth(width2);
        box2.setDepth(depth2);
        
        System.out.println("True or false; the first box is empty: ");
        full1 = scan.nextBoolean();
        
        scan.close();
        
        box1.setFull(full1);
        
        System.out.println("Box 1: " + box1.toString());
        System.out.println("Box 2: " + "Height: " + box2.getHeight()
                + " Width: " + box2.getWidth() + " Depth: " + box2.getDepth()
                + " Full: " + box2.getFull());
        
        
        
        
        System.out.println("\nQuestion four was called and ran sucessfully.");
    }

};
