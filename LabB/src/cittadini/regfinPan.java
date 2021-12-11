package cittadini;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class regfinPan extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public regfinPan() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pthree = new JPanel();
		add(pthree);
		GridBagLayout gbl_pthree = new GridBagLayout();
		gbl_pthree.columnWidths = new int[]{100, 125, 175, 200, 100};
		gbl_pthree.rowHeights = new int[]{100, 120, 40, 40, 40, 40, 120, 40, 0};
		gbl_pthree.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_pthree.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pthree.setLayout(gbl_pthree);
		
		try 
		{
			BufferedImage myPicture2 = ImageIO.read(new File("C:\\Users\\jofox\\git\\LabB\\LabB\\primula.png"));
			Image newImage2 = myPicture2.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			JLabel lblNewLabelim = new JLabel(new ImageIcon(newImage2));
			lblNewLabelim.setPreferredSize(new Dimension(50,50));
			GridBagConstraints gbc_lblNewLabelim = new GridBagConstraints();
			gbc_lblNewLabelim.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabelim.gridx = 4;
			gbc_lblNewLabelim.gridy = 0;
			pthree.add(lblNewLabelim, gbc_lblNewLabelim);
			
			JLabel lblNewLabel = new JLabel("REGISTRAZIONE EFFETTUATA CON SUCCESSO!");
			lblNewLabel.setForeground(new Color(0, 128, 128));
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridwidth = 3;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 1;
			pthree.add(lblNewLabel, gbc_lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Se vuoi segnalare una reazione avversa al vaccino, devi prima autenticarti:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.LINE_START;
			gbc_lblNewLabel_1.gridwidth = 3;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 1;
			gbc_lblNewLabel_1.gridy = 2;
			pthree.add(lblNewLabel_1, gbc_lblNewLabel_1);
			
			JButton btnNewButton = new JButton("AUTENTICAZIONE");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					homePanel home = new homePanel();
					removeAll();
					add(home);
					repaint();
					revalidate();
				}
			});
			
			JLabel lblNewLabel_4 = new JLabel("Nome utente:");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
			gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_4.gridx = 1;
			gbc_lblNewLabel_4.gridy = 3;
			pthree.add(lblNewLabel_4, gbc_lblNewLabel_4);
			
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 2;
			gbc_textField.gridy = 3;
			pthree.add(textField, gbc_textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_5 = new JLabel("Nome utente non trovato");
			lblNewLabel_5.setForeground(Color.RED);
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
			GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
			gbc_lblNewLabel_5.anchor = GridBagConstraints.LINE_START;
			gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_5.gridx = 3;
			gbc_lblNewLabel_5.gridy = 3;
			pthree.add(lblNewLabel_5, gbc_lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("Password:");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
			GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
			gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_6.gridx = 1;
			gbc_lblNewLabel_6.gridy = 4;
			pthree.add(lblNewLabel_6, gbc_lblNewLabel_6);
			
			passwordField = new JPasswordField();
			GridBagConstraints gbc_passwordField = new GridBagConstraints();
			gbc_passwordField.insets = new Insets(0, 0, 0, 5);
			gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
			gbc_passwordField.gridx = 2;
			gbc_passwordField.gridy = 4;
			pthree.add(passwordField, gbc_passwordField);
			
			JLabel lblNewLabel_2 = new JLabel("Password errata");
			lblNewLabel_2.setForeground(Color.RED);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.anchor = GridBagConstraints.LINE_START;
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_2.gridx = 3;
			gbc_lblNewLabel_2.gridy = 4;
			pthree.add(lblNewLabel_2, gbc_lblNewLabel_2);
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton.gridx = 2;
			gbc_btnNewButton.gridy = 5;
			pthree.add(btnNewButton, gbc_btnNewButton);
			
			JLabel lblNewLabel_7 = new JLabel("Per consultare le informatzioni di un centro:");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
			GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
			gbc_lblNewLabel_7.gridwidth = 2;
			gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_7.gridx = 1;
			gbc_lblNewLabel_7.gridy = 6;
			pthree.add(lblNewLabel_7, gbc_lblNewLabel_7);
			
			JButton btnNewButton_1 = new JButton("CERCA CENTRO");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ricePan ricepan = new ricePan();
					removeAll();
					add(ricepan);
					repaint();
					revalidate();
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.anchor = GridBagConstraints.WEST;
			gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton_1.gridx = 3;
			gbc_btnNewButton_1.gridy = 6;
			pthree.add(btnNewButton_1, gbc_btnNewButton_1);
			
			JLabel lblNewLabel_3 = new JLabel("Per tornare alla pagina iniziale:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_3.setForeground(new Color(0, 0, 0));
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.gridwidth = 2;
			gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
			gbc_lblNewLabel_3.gridx = 1;
			gbc_lblNewLabel_3.gridy = 7;
			pthree.add(lblNewLabel_3, gbc_lblNewLabel_3);
			
			JButton btnNewButton_2 = new JButton("TORNA HOME");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cittaFrame next = new cittaFrame();
					removeAll();
					add(next);
					repaint();
					revalidate();
				}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
			gbc_btnNewButton_2.anchor = GridBagConstraints.WEST;
			gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
			gbc_btnNewButton_2.gridx = 3;
			gbc_btnNewButton_2.gridy = 7;
			pthree.add(btnNewButton_2, gbc_btnNewButton_2);
 
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
