package cittadini;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.Font;

public class logPan extends JPanel {
	
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Create the panel.
	 */
	public logPan() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pone = new JPanel();
		add(pone);
		GridBagLayout gbl_pone = new GridBagLayout();
		gbl_pone.columnWidths = new int[]{100, 125, 175, 200, 100, 0};
		gbl_pone.rowHeights = new int[]{100, 100, 40, 40, 40, 40, 40, 0};
		gbl_pone.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pone.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pone.setLayout(gbl_pone);
		
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
			pone.add(lblNewLabelim, gbc_lblNewLabelim);
			
			JLabel lblNewLabel = new JLabel("INSERISCI QUI LE TUE CREDENZIALI");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridwidth = 3;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 1;
			pone.add(lblNewLabel, gbc_lblNewLabel);
 
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		JLabel lblNewLabel_2 = new JLabel("Nome utente:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.LINE_END;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		pone.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 2;
		pone.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Inserire un nome valido");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 3;
		gbc_lblNewLabel_6.gridy = 2;
		pone.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_61 = new JLabel("Questo campo è vuoto");
		lblNewLabel_61.setForeground(Color.RED);
		lblNewLabel_61.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_61 = new GridBagConstraints();
		gbc_lblNewLabel_61.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_61.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_61.gridx = 3;
		gbc_lblNewLabel_61.gridy = 2;
		pone.add(lblNewLabel_61, gbc_lblNewLabel_61);
		
		JLabel lblNewLabel_62 = new JLabel("Nome utente già esistente");
		lblNewLabel_62.setForeground(Color.RED);
		lblNewLabel_62.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_62 = new GridBagConstraints();
		gbc_lblNewLabel_62.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_62.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_62.gridx = 3;
		gbc_lblNewLabel_62.gridy = 2;
		pone.add(lblNewLabel_62, gbc_lblNewLabel_62);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.LINE_END;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		pone.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 0, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 7;
		pone.add(passwordField, gbc_passwordField);
		
		JLabel lblNewLabel_7 = new JLabel("Inserire una password sicura");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 3;
		gbc_lblNewLabel_7.gridy = 3;
		pone.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_71 = new JLabel("Questo campo è vuoto");
		lblNewLabel_71.setForeground(Color.RED);
		lblNewLabel_71.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_71 = new GridBagConstraints();
		gbc_lblNewLabel_71.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_71.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_71.gridx = 3;
		gbc_lblNewLabel_71.gridy = 3;
		pone.add(lblNewLabel_71, gbc_lblNewLabel_71);
		
		JButton btnNewButton_1 = new JButton("LOG IN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homePanel next = new homePanel();
				removeAll();
				add(next);
				repaint();
				revalidate();
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.LINE_START;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 4;
		pone.add(btnNewButton_1, gbc_btnNewButton_1);
		
	}

}
