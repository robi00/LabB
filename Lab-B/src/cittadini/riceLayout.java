package cittadini;

import javax.swing.*;


import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class riceLayout extends JPanel {
	private JLabel cercace;
	private JLabel sivax;
	private JLabel oppur;
	private JTextField tfcontrolpsw;
	private JLabel controlpswerro;
	 
	private JButton clicca1;
	private JButton clicca2;
	private JButton clicca3;
	Boolean check = false;
	
	protected void creaRiceFinestra() {
		
		this.setLayout(new java.awt.GridBagLayout());
	    GridBagConstraints aa = new GridBagConstraints();
	    
	    JLabel titolotwo = new JLabel("RICERCA QUI IL CENTRO CHE TI INTERESSA");
	    titolotwo.setFont(new Font("Arial", Font.BOLD, 20));
	    aa.gridx = 0;
	    aa.gridy = 0;
	    aa.insets = new Insets(0,0,50,0);
	    aa.anchor = GridBagConstraints.LINE_START;
	    this.add(titolotwo, aa);
	    
	}
	
	public riceLayout() {
		 this.creaRiceFinestra();
	}
	
}
