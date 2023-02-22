import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class SmileyFace extends JFrame {

  
   public SmileyFace(){
       setSize(200,200);
       setVisible(true);
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       repaint();
   }
  
   public void paint(Graphics g){
      
       g.drawOval(25, 25, 150, 150);
       g.drawOval(50, 50,40, 25);
       g.drawOval(115, 50,40, 25);
      
       g.setColor(Color.BLACK);
       g.fillOval(60, 52, 20, 20);
       g.fillOval(125, 52, 20, 20);
      
       g.drawLine(85, 120, 115, 120);
       g.drawLine(85, 120, 100, 90);
       g.drawLine(100, 90,115, 120);
      
       g.drawArc(70, 120, 65, 20, 0, -180);
   }
  
   public static void main(String a[]){
       new SmileyFace();
   }
}