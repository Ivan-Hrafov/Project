package Mouse;

import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends JFrame {
    MyFrame() {
        setSize(400, 300);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth()/2, e.getYOnScreen() - getHeight()/2);
            }
        });
    }
}

class SimpleMouseListener {
    public static void main(String[] args) {
        new MyFrame();
    }
}

/*
class SimpleClickListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click at " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}*/
