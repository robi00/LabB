package cittadini;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class regisPan extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public regisPan() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel ptwo = new JPanel();
		add(ptwo);
		GridBagLayout gbl_ptwo = new GridBagLayout();
		gbl_ptwo.columnWidths = new int[]{100, 125, 175, 200, 100, 0};
		gbl_ptwo.rowHeights = new int[]{100, 60, 40, 40, 40, 40, 40, 40, 40, 40, 40, 0};
		gbl_ptwo.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_ptwo.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		ptwo.setLayout(gbl_ptwo);
		
		try 
		{
			BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\jofox\\git\\LabB\\LabB\\gobackb.png"));
			Image newImage = myPicture.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			JButton btnNewButton = new JButton(new ImageIcon(newImage));
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.setPreferredSize(new Dimension(50,50));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cittaFrame frame = new cittaFrame();
					removeAll();
					add(frame);
					repaint();
					revalidate();
				}
			});
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton.gridx = 0;
			gbc_btnNewButton.gridy = 0;
			ptwo.add(btnNewButton, gbc_btnNewButton);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
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
			ptwo.add(lblNewLabelim, gbc_lblNewLabelim);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		JLabel lblNewLabel_1 = new JLabel("INSERIRSCI QUI LE TUE CREDENZIALI");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		ptwo.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		ptwo.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 2;
		ptwo.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Nome non valido");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 3;
		gbc_lblNewLabel_9.gridy = 2;
		ptwo.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_9two = new JLabel("Questo campo è vuoto");
		lblNewLabel_9two.setForeground(Color.RED);
		lblNewLabel_9two.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_9two = new GridBagConstraints();
		gbc_lblNewLabel_9two.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_9two.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9two.gridx = 3;
		gbc_lblNewLabel_9two.gridy = 2;
		ptwo.add(lblNewLabel_9two, gbc_lblNewLabel_9two);
		
		JLabel lblNewLabel_3 = new JLabel("Cognome:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		ptwo.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		ptwo.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Cognome non valido");
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 3;
		gbc_lblNewLabel_10.gridy = 3;
		ptwo.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel_10two = new JLabel("Questo campo è vuoto");
		lblNewLabel_10two.setForeground(Color.RED);
		lblNewLabel_10two.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_10two = new GridBagConstraints();
		gbc_lblNewLabel_10two.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_10two.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10two.gridx = 3;
		gbc_lblNewLabel_10two.gridy = 3;
		ptwo.add(lblNewLabel_10two, gbc_lblNewLabel_10two);
		
		JLabel lblNewLabel_4 = new JLabel("Codice fiscale:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 4;
		ptwo.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		ptwo.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Codice fiscale non valido");
		lblNewLabel_11.setForeground(Color.RED);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 3;
		gbc_lblNewLabel_11.gridy = 4;
		ptwo.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		JLabel lblNewLabel_11two = new JLabel("Questo campo è vuoto");
		lblNewLabel_11two.setForeground(Color.RED);
		lblNewLabel_11two.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_11two = new GridBagConstraints();
		gbc_lblNewLabel_11two.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_11two.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11two.gridx = 3;
		gbc_lblNewLabel_11two.gridy = 4;
		ptwo.add(lblNewLabel_11two, gbc_lblNewLabel_11two);
		
		JLabel lblNewLabel_5 = new JLabel("Indirizzo Email:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 5;
		ptwo.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 5;
		ptwo.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Indirizzo non valido");
		lblNewLabel_12.setForeground(Color.RED);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 3;
		gbc_lblNewLabel_12.gridy = 5;
		ptwo.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		JLabel lblNewLabel_12two = new JLabel("Questo campo è vuoto");
		lblNewLabel_12two.setForeground(Color.RED);
		lblNewLabel_12two.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_12two = new GridBagConstraints();
		gbc_lblNewLabel_12two.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_12two.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12two.gridx = 3;
		gbc_lblNewLabel_12two.gridy = 5;
		ptwo.add(lblNewLabel_12two, gbc_lblNewLabel_12two);
		
		JLabel lblNewLabel_6 = new JLabel("Nome utente:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 6;
		ptwo.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 6;
		ptwo.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Nome utente non valido");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_13.setForeground(Color.RED);
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 3;
		gbc_lblNewLabel_13.gridy = 6;
		ptwo.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		JLabel lblNewLabel_13two = new JLabel("Questo campo è vuoto");
		lblNewLabel_13two.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_13two.setForeground(Color.RED);
		GridBagConstraints gbc_lblNewLabel_13two = new GridBagConstraints();
		gbc_lblNewLabel_13two.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_13two.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13two.gridx = 3;
		gbc_lblNewLabel_13two.gridy = 6;
		ptwo.add(lblNewLabel_13two, gbc_lblNewLabel_13two);
		
		JLabel lblNewLabel_13three = new JLabel("Nome utente già esistente");
		lblNewLabel_13three.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_13three.setForeground(Color.RED);
		GridBagConstraints gbc_lblNewLabel_13three = new GridBagConstraints();
		gbc_lblNewLabel_13three.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_13three.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13three.gridx = 3;
		gbc_lblNewLabel_13three.gridy = 6;
		ptwo.add(lblNewLabel_13three, gbc_lblNewLabel_13three);
		
		JLabel lblNewLabel_7 = new JLabel("Password:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 7;
		ptwo.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 0, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 7;
		ptwo.add(passwordField, gbc_passwordField);
		
		JLabel lblNewLabel_14 = new JLabel("Inserire una password sicura");
		lblNewLabel_14.setForeground(Color.RED);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 3;
		gbc_lblNewLabel_14.gridy = 7;
		ptwo.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		JLabel lblNewLabel_14two = new JLabel("Questo campo è vuoto");
		lblNewLabel_14two.setForeground(Color.RED);
		lblNewLabel_14two.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_14two = new GridBagConstraints();
		gbc_lblNewLabel_14two.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_14two.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14two.gridx = 3;
		gbc_lblNewLabel_14two.gridy = 7;
		ptwo.add(lblNewLabel_14two, gbc_lblNewLabel_14two);
		
		JLabel lblNewLabel_8 = new JLabel("ID univoco:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 8;
		ptwo.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 8;
		ptwo.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("ID non trovato");
		lblNewLabel_15.setForeground(Color.RED);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 3;
		gbc_lblNewLabel_15.gridy = 8;
		ptwo.add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		JLabel lblNewLabel_15two = new JLabel("Questo campo è vuoto");
		lblNewLabel_15two.setForeground(Color.RED);
		lblNewLabel_15two.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_15two = new GridBagConstraints();
		gbc_lblNewLabel_15two.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_15two.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15two.gridx = 3;
		gbc_lblNewLabel_15two.gridy = 8;
		ptwo.add(lblNewLabel_15two, gbc_lblNewLabel_15two);
		
		JButton btnNewButton = new JButton("Registrati");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regfinPan next = new regfinPan();
				removeAll();
				add(next);
				repaint();
				revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 9;
		ptwo.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_16 = new JLabel("Ti sei gi\u00E0 registrato! Per proseguire clicca qui:");
		lblNewLabel_16.setForeground(Color.MAGENTA);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.gridwidth = 2;
		gbc_lblNewLabel_16.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_16.gridx = 1;
		gbc_lblNewLabel_16.gridy = 10;
		ptwo.add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		JButton btnNewButton_1 = new JButton("Log in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logPan login = new logPan();
				removeAll();
				add(login);
				repaint();
				revalidate();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.LINE_START;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 10;
		ptwo.add(btnNewButton_1, gbc_btnNewButton_1);

	}

}
