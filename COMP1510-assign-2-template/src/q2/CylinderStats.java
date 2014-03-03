package q2;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * <p>This class reads in the radius and height of the cylinder,
 * and computes both the surface area, and volume.</p>
 * @author Cameron
 * @version 1.0
 */
public class CylinderStats {
    /**
     * <p>This is the main method which reads in a users radius
     * and height of a cylinder, computes the volume and surface
     * area and outputs the values to 4 decimal places.</p>
     * @param args unused
     */
    public static void main(String[] args) {
        //The radius and height of the cylinder.
        double radius;
        double height;
        //The area and volume of the cylinder.
        double area;
        double volume;
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(4);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter in the radius and height "
                + "of a cylinder (radius first): ");
        radius = scan.nextDouble();
        height = scan.nextDouble();
        
        scan.close();
        
        volume = Math.PI * Math.pow(radius, 2) * height;
        
        area = 2 * Math.PI * radius * (radius + height);
        
        System.out.println("The surface area of your cylinder is: "
                + df.format(area));
        System.out.println("The volume of your cylinder is: "
                + df.format(volume));
       
        System.out.println("Question two was called and ran sucessfully.");
    }
}
