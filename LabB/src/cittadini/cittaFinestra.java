package cittadini;

import javax.swing.*;


import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class cittaFinestra extends JFrame {
	
	public cittaFinestra(){
		JFrame frame = new JFrame();
        cittaLayout Panelone = new cittaLayout(frame);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Piattaforma vaccinazioni");
        frame.setSize(800,600);
        frame.getContentPane().add(Panelone);
	}

}