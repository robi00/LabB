package cittadini;

import javax.swing.*;


import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class ricercaCent extends JFrame {
	
	public ricercaCent(JFrame frame){
        riceLayout Paneltwo = new riceLayout();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().removeAll();
        frame.setSize(801,600);
        frame.getContentPane().add(Paneltwo);
	}

}
