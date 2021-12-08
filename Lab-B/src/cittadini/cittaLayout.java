package cittadini;

import javax.swing.*;


import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class cittaLayout extends JPanel {
	private JLabel cercace;
	private JLabel sivax;
	private JLabel oppur;
	private JTextField tfcontrolpsw;
	private JLabel controlpswerro;
	 
	private JButton clicca1;
	private JButton clicca2;
	private JButton clicca3;
	Boolean check = false;
	
	protected void creaCittaFinestra(JFrame frame) {
		
		this.setLayout(new java.awt.GridBagLayout());
	    GridBagConstraints aa = new GridBagConstraints();
	    
	    JLabel titolo = new JLabel("SERVIZIO VACCINAZIONI CONTRO IL COVID19");
	    titolo.setFont(new Font("Times new roman", Font.BOLD, 20));
	    aa.gridx = 0;
	    aa.gridy = 0;
	    aa.insets = new Insets(0,0,50,0);
	    aa.anchor = GridBagConstraints.LINE_START;
	    this.add(titolo, aa);
	    
	    this.cercace = new JLabel("PER CONSULTARE LE INFORMAZIONI RELATIVE AD UN CENTRO VACCINALE");
	    aa.gridx = 0;
	    aa.gridy = 1;
	    aa.insets = new Insets(0,0,0,0);
	    aa.anchor = GridBagConstraints.LINE_START;
	    this.add(this.cercace, aa);
	    
	    this.clicca1 = new JButton("CLICCA QUI");
	    aa.gridx = 1;
	    aa.gridy = 1;
	    aa.insets = new Insets(0, -10, 0, 0);
	    aa.anchor = GridBagConstraints.LINE_START;
	    this.clicca1.addActionListener(new operaRice(frame));
	    this.add(this.clicca1, aa);
	    
	    this.sivax = new JLabel("NEL CASO AVESSI OTTENUTO UNA DOSE DI VACCINO:");
	    aa.gridx = 0;
	    aa.gridy = 2;
	    aa.insets = new Insets(50,0,0,0);
	    aa.anchor = GridBagConstraints.LINE_START;
	    this.add(this.sivax, aa);
	    
	    this.clicca2 = new JButton("REGISTRATI");
	    aa.gridx = 0;
	    aa.gridy = 3;
	    aa.insets = new Insets(10, 0, 0, 0);
	    aa.anchor = GridBagConstraints.LINE_START;
	    this.add(this.clicca2, aa);
	    
	    this.oppur = new JLabel("OPPURE EFFETTUA IL");
	    aa.gridx = 1;
	    aa.gridy = 3;
	    aa.insets = new Insets(10,-320,0,0);
	    aa.anchor = GridBagConstraints.LINE_START;
	    this.add(this.oppur, aa);
	    
	    this.clicca3 = new JButton("LOG IN");
	    aa.gridx = 2;
	    aa.gridy = 3;
	    aa.insets = new Insets(10, -270, 0, 0);
	    aa.anchor = GridBagConstraints.LINE_START;
	    this.add(this.clicca3, aa);
	    
	    
	    
	    
	    
	}
	
	public cittaLayout (JFrame frame) {
		 this.creaCittaFinestra(frame);
	}
	
	public JLabel getCercace() {
	     return this.cercace;
	}

	public void setCercace(JLabel cercace) {
	     this.cercace = cercace;
	}
	
	public JButton getClicca1() {
	     return this.clicca1;
	}

	public void setClicca1(JButton clicca1) {
	     this.clicca1 = clicca1;
	}
	
	public JLabel getSivax() {
	     return this.sivax;
	}

	public void setSivax(JLabel sivax) {
	     this.sivax = sivax;
	}
	
	public JButton getClicca2() {
	     return this.clicca2;
	}

	public void setClicca2(JButton clicca2) {
	     this.clicca2 = clicca2;
	}
	
	public JLabel getOppur() {
	     return this.oppur;
	}

	public void setOppur(JLabel oppur) {
	     this.oppur = oppur;
	}
	
	public JButton getClicca3() {
	     return this.clicca3;
	}
	
	public void setClicca3(JButton clicca3) {
	     this.clicca3 = clicca3;
	}
	
	
}
