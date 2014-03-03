package q1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <p>This class reads in the three sides of a triangle, and
 * then computes the area.</p>
 * @author Cameron
 * @version 1.0
 */
public class TriangleArea {
    /**
     * <p>This is the main method which reads in the 
     * three sides of a triangle from a user, then computes
     * the area and prints it to 3 decimal places.</p>
     *
     * @param args unused
     */
    public static void main(String[] args) {
        //The three sides of a triangle.
        int side1;
        int side2;
        int side3;
        //The total area of the triangle.
        double total;
        //Half of the perimeter of the triangle, needed for 
        //calculating the area.
        double halfPerimeter; 
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the length of the three sides " 
                + "which make up a triangle: ");
        side1 = scan.nextInt();
        side2 = scan.nextInt();
        side3 = scan.nextInt();
        
        scan.close();
        
        halfPerimeter = (side1 + side2 + side3) / 2;
        
        total = Math.sqrt(halfPerimeter * (halfPerimeter - side1)
                * (halfPerimeter - side2) * (halfPerimeter - side3));
        
        
        System.out.println("The total area of your triangle is: " 
                + df.format(total));
        System.out.println("Question one was called and ran sucessfully.");
    }
}
