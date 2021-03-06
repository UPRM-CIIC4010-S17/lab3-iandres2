import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	* 
	*/
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.GREEN);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                      //Draw a border
                        g.setColor(Color.RED);
                        g.drawRect(x1, y1, width, height);
                        
                      //Draw a border
                        g.setColor(Color.BLACK);
                        g.drawRect(x1 + 10, y1 + 10, width - 20, height - 20);
                        
                      //Draw a Line
                        g.setColor(Color.BLUE);
                        g.drawLine(x2, y1, x1, y2);
                        
                        //Draw a Line 
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        
                      //Draw a oval					
                        g.setColor(Color.GRAY);
                        g.fillOval(x1, y1, 55, 55);
                        
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.YELLOW);
                        g.fillPolygon(p);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.drawPolygon(p2);
                        
                        //Draw Puertorican Flag
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, y1 + 50);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1 + 50, width + 1, y1 + 100);
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1 + 100, width + 1, y1 + 150);
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1 + 150, width + 1, y1 + 200);
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1 + 200, width + 1, y1 + 250);
                        
                        Polygon p3 = new Polygon ();
                        p3.addPoint(x1, y1);
                        p3.addPoint(x1 + 100, y1 + 125);
                        p3.addPoint(x1, height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1 + 25, y1 + 123);
                        p4.addPoint(x1 + 41, y1 + 123);
                        p4.addPoint(x1 + 47, y1 + 108);
                        p4.addPoint(x1 + 53, y1 + 123);
                        p4.addPoint(x1 + 69, y1 + 123);
                        p4.addPoint(x1 + 56, y1 + 133);
                        p4.addPoint(x1 + 61, y1 + 148);
                        p4.addPoint(x1 + 47, y1 + 138);
                        p4.addPoint(x1 + 34, y1 + 148);
                        p4.addPoint(x1 + 38, y1 + 133);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p4);
                        
                        
			}
}