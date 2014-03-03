package q5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>The class which holds the parameters for a traffic light,
 * including the colors for the lights, the button,
 * the frame and the background.</p>
 *
 * @author Cameron
 * @version 1.0
 */
public class TrafficLight  extends JFrame {

    /**
     * Serial UID number.
     */
    private static final long serialVersionUID = 1L;
    /**
     * The button which changes the traffic lights "lights".
     */
    private JButton button;
    
    Color Green = Color.black;
    Color Red = Color.black;
    Color Yellow = Color.black;
    
    int buttonCount = 1;
    /**
     * The diameter of the "lights".
     */
    final int circleDiam = 100;
    /**
     * The x position of the "lights".
     */
    final int circleStart = 25;
    /**
     * The increment in y position for the "lights".
     */
    final int circleNext = 105;
    

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public TrafficLight() {       
                    
        super("Cameron Stenmark");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Change");
        button.addActionListener(new Listener());
        JPanel panel = new JPanel();
        panel.add(button);

        panel.add(new DrawingPanel());
        panel.setBackground(new Color(236, 118, 0));


        getContentPane().add(panel);

        setSize(200, 420);
        setVisible(true);
    }
    class DrawingPanel extends JPanel {
        
        /**
         * Serial Version UID.
         */
        private static final long serialVersionUID = 6104244723290853177L;
        
                       
        public DrawingPanel() {
            setPreferredSize(new Dimension(150, 340));
            setBackground(new Color(193, 97, 0));
        }
        /**
         * The paint component which draws the "lights".
         * @param g the graphics
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            g.setColor(Red);
            g.fillOval(circleStart, circleStart, circleDiam, circleDiam);
            
            g.setColor(Yellow);
            g.fillOval(circleStart, (circleStart + circleNext), 
                    circleDiam, circleDiam);
            
            g.setColor(Green);
            g.fillOval(circleStart, ((circleNext * 2) + circleStart), 
                    circleDiam, circleDiam);
        }
    }
        /**
         * The action listener for the button.
         * @author Cameron
         * @version 1.0
         */
        class Listener implements ActionListener {
            /**
             * <p>The listener, using an if statement to determine
             * which color should be "on".
             * @param event the event.
             */
            public void actionPerformed(ActionEvent event) {
                if (buttonCount == 1) {
                    buttonCount = 2;
                    Red = Color.red;
                    Yellow = Color.black;
                    Green = Color.black;
                    revalidate();
                    repaint();
                } else if (buttonCount == 2) {
                    buttonCount = 0;
                    Yellow = Color.black;
                    Red = Color.black;
                    Green = Color.green;
                    revalidate();
                    repaint();
                } else if (buttonCount == 0) {
                    buttonCount = 1;
                    Green = Color.black;
                    Red = Color.black;
                    Yellow = Color.yellow;
                    revalidate();
                    repaint();
                }                                                              
            }
        }
      
}
