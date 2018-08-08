package Overrideler;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.JTextField;

public class TextKutusu extends JTextField {

    @Override
    protected void processKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_TYPED) {
            if (!Character.isDigit(e.getKeyChar())) {
                e.consume();
            }
        }super.processKeyEvent(e);
    }


}
