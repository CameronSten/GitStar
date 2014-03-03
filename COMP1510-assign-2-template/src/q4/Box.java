package q4;
/**
 * <p>The class which contains all of the parameters
 * of a box object.</p> 
 * @author Cameron
 * @version 1.0
 */
public class Box {
    /**
     * The height of the box.
     */
    private int height;
    /**
     * The width of the box.
     */
    private int width;
    /**
     * The depth of the box.
     */
    private int depth;
    /**
     * Returns true if the box is full.
     */
    private boolean full;
    /**
     * The constructor of the box object.
     * @param length The height of the box.
     * @param girth The width of the box.
     * @param interior The depth of the box.
     */
    public Box(int length, int girth, int interior) {
        
        height = length;
        width = girth;
        depth = interior;
        full = false;
    }
    /**
     * Sets the height of the box.
     * @param length the height.
     */
    public void setHeight(int length) {
        height = length;
    }
    /**
     * Sets the width of the box.
     * @param girth the width.
     */
    public void setWidth(int girth) {
        width = girth;
    }
    /**
     * Sets the depth of the box.
     * @param interior the depth.
     */
    public void setDepth(int interior) {
        depth = interior;
    }
    /**
     * Sets whether the box is full or not.
     * @param yesOrNo If its full.
     */
    public void setFull(boolean yesOrNo) {
        full = yesOrNo;
    }
    /**
     * Gets the height of the box.
     * @return the height.
     */
    public int getHeight() {
        
        return height;
    }
    /**
     * Gets the width of the box.
     * @return the width.
     */
    public int getWidth() {
        
        return width;
    }
    /**
     * Gets the depth of the box.
     * @return the depth.
     */
    public int getDepth() {
        
        return depth;
    }
    /**
     * Gets whether the box is full or not.
     * @return if its full.
     */
    public boolean getFull() {
        
        return full;
    }
    /**
     * A nicely formatted representation of the data of the box.
     * @return the data for the box.
     */
    public String toString() {
        
        return "Height: " + height + " Width: " + width 
                + " Depth: " + depth +  " Full: "
                + full;
    }

}
