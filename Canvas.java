import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Canvas extends JPanel{
	
	int carreX, carreY, h, w, recM;
	Vector<Rectangle> mes_rec= new Vector<Rectangle>();

	
        public void paintComponent(Graphics g) {
        		h = 20;
        		w = 20;
        		super.paintComponent(g);
        		setBackground(Color.WHITE);
                     for(Rectangle r : mes_rec) {
                	 g.setColor(Color.BLUE);
                     g.fillRect(r.x, r.y, w , h);
                     g.setColor(Color.BLACK);
                     g.drawRect(r.x, r.y, w , h);
                }
        }
        
        public void setPosition(int x, int y) {
        	carreX = x;
        	carreY = y;
        	mes_rec.add(new Rectangle(carreX-(w/2),carreY-(h/2),w,h));
        	repaint();
        }
        
        public void deplacerRectangle(int x, int y){
        	
					mes_rec.elementAt(recM).x = x - w/2;
					mes_rec.elementAt(recM).y = y - h/2;
			      	repaint();
        }

		public void supprimerRectangle(int x, int y) {
			for (int i = 0; i < mes_rec.size(); i++ ) {
				if (mes_rec.elementAt(i).contains(x,y)) {
					mes_rec.removeElementAt(i);
				}
			}
			repaint();
			
		}

		public void setrecM(int x, int y) {
			// TODO Auto-generated method stub
			for (int i = 0; i < mes_rec.size(); i++ ) {
				if (mes_rec.elementAt(i).contains(x,y)) {
					recM = i;
				}
			}
			
		}
}