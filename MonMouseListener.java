import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MonMouseListener implements MouseListener {
	Canvas canvas;

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getModifiersEx() == MouseEvent.SHIFT_DOWN_MASK){
			canvas.supprimerRectangle(e.getX(), e.getY());
		} else {
		System.out.println(e.getX() + " " + e.getY());
		canvas.setPosition(e.getX(), e.getY());
		}
		
	
		
		
	}
	
	public void addCanvas(Canvas c) {
		this.canvas = c;
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		canvas.setrecM(e.getX(),e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
