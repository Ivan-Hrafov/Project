package Mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

class SimpleMouseListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked аt " + e.getX() + "," + e.getY());

    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

}

class Main {
    public static void main(String[] args) {
        // создаем окно
        JFrame jf = new JFrame();
        // устанавливаем ему размеры
        jf.setSize(400, 300);
        // и показываем его
        jf.setVisible(true);
        SimpleMouseListener mouseListener = new SimpleMouseListener();
        jf.addMouseListener(mouseListener);
    }
}