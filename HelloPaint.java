import java.awt.Dimension;
import javax.swing.*;

public class HelloPaint {
        public HelloPaint() {
        	    JFrame f = new JFrame("Hello Paint");
                f.setPreferredSize(new Dimension(300,300));
                Canvas c = new Canvas();
                f.getContentPane().add(c);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.pack();
                f.setVisible(true);
                MonMouseListener mML = new MonMouseListener();
                MonMouseMotionListener mMML = new MonMouseMotionListener();
                mML.addCanvas(c);
                mMML.addCanvas(c);
                f.getContentPane().addMouseListener(mML);
                f.getContentPane().addMouseMotionListener(mMML);
        }
                

        public static void main(String args[]){
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                                new HelloPaint();
                        }
                });
        }
}