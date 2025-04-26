import javax.swing.JButton;
import java.awt.Graphics;

class ChessSquareButton extends JButton {
    public ChessSquareButton() {
        super();
        setOpaque(true);
        setContentAreaFilled(true);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // First paint background
        if (isOpaque()) {
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
        }
        // Then let the JButton do its normal thing (draw Icon, etc.)
        super.paintComponent(g);
    }
}
