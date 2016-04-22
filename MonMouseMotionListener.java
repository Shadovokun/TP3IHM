import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MonMouseMotionListener implements MouseMotionListener {
	Canvas canvas;
	
	@Override
	public void mouseDragged(MouseEvent e) {
		canvas.deplacerRectangle(e.getX(), e.getY());
		
	}
	public void addCanvas(Canvas c) {
		this.canvas = c;
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
