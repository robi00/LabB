package cittadini;
import javax.swing.*;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class operaRice implements ActionListener {
	
	public JFrame framer;
	
	public operaRice(JFrame frame){
		framer = frame;
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
    	ricercaCent fairicerca = new ricercaCent(framer);
    }

}

