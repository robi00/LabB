package cittadini;

import java.awt.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class cittaFrame extends JPanel
{
	private JTextField textField;
	private JPasswordField passwordField;
	// Crea pannello
	
	public cittaFrame() 
	{
		initComponents();
		createEvent();
	}
	
	// Questo metodo contiene e inizializza i componenti
	
	private void initComponents() 
	{
		setPreferredSize(new Dimension(700,700));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel p = new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 125, 175, 200, 100, 0};
		gridBagLayout.rowHeights = new int[]{100, 80, 60, 40, 40, 40, 80, 50, 30, 50, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		p.setLayout(gridBagLayout);
		add(p);
		
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
			p.add(lblNewLabelim, gbc_lblNewLabelim);
 
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		JLabel lblNewLabel = new JLabel("SERVIZIO VACCINAZIONI \r\nPER CITTADINI");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 5;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		p.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EFFETTUA IL LOG IN SE HAI FATTO LA REGISTRAZIONE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		p.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome utente:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.LINE_END;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		p.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 3;
		p.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Inserire un nome valido");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 3;
		gbc_lblNewLabel_6.gridy = 3;
		p.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_61 = new JLabel("Questo campo è vuoto");
		lblNewLabel_61.setForeground(Color.RED);
		lblNewLabel_61.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_61 = new GridBagConstraints();
		gbc_lblNewLabel_61.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_61.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_61.gridx = 3;
		gbc_lblNewLabel_61.gridy = 3;
		p.add(lblNewLabel_61, gbc_lblNewLabel_61);
		
		JLabel lblNewLabel_62 = new JLabel("Nome utente già esistente");
		lblNewLabel_62.setForeground(Color.RED);
		lblNewLabel_62.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_62 = new GridBagConstraints();
		gbc_lblNewLabel_62.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_62.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_62.gridx = 3;
		gbc_lblNewLabel_62.gridy = 3;
		p.add(lblNewLabel_62, gbc_lblNewLabel_62);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.LINE_END;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 4;
		p.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 0, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 4;
		p.add(passwordField, gbc_passwordField);
		
		JLabel lblNewLabel_7 = new JLabel("Inserire una password sicura");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 3;
		gbc_lblNewLabel_7.gridy = 4;
		p.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_71 = new JLabel("Questo campo è vuoto");
		lblNewLabel_71.setForeground(Color.RED);
		lblNewLabel_71.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel_71 = new GridBagConstraints();
		gbc_lblNewLabel_71.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_71.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_71.gridx = 3;
		gbc_lblNewLabel_71.gridy = 4;
		p.add(lblNewLabel_71, gbc_lblNewLabel_71);
		
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
		gbc_btnNewButton_1.gridy = 5;
		p.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("SE NON HAI FATTO LA REGISTRAZIONE:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 3;
		gbc_lblNewLabel_4.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 6;
		p.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("REGISTRATI");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regisPan newpan = new regisPan();
				removeAll();
				add(newpan);
				repaint();
				revalidate();
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.gridwidth = 2;
		gbc_btnNewButton_2.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 7;
		p.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("OPPURE, PER CERCARE UN CENTRO VACCINALE:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.gridwidth = 3;
		gbc_lblNewLabel_5.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 8;
		p.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("CERCA CENTRO");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ricePan newpan = new ricePan();
				removeAll();
				add(newpan);
				repaint();
				revalidate();
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_3.gridwidth = 3;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 9;
		p.add(btnNewButton_3, gbc_btnNewButton_3);
	}
	
	// Questo metodo contiene gli eventi
	
	private void createEvent() {
		/* da riempire */
	}
}
