package cittadini;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextArea;

public class insertPan extends JPanel {

	/**
	 * Create the panel.
	 */
	public insertPan() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pseven = new JPanel();
		add(pseven);
		GridBagLayout gbl_pseven = new GridBagLayout();
		gbl_pseven.columnWidths = new int[]{100, 125, 125, 125, 125, 100, 0};
		gbl_pseven.rowHeights = new int[]{100, 20, 20, 20, 30, 30, 30, 30, 30, 30, 30, 150, 40, 40, 100, 0};
		gbl_pseven.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pseven.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pseven.setLayout(gbl_pseven);
		
		try 
		{
			BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\jofox\\git\\LabB\\LabB\\gobackb.png"));
			Image newImage = myPicture.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			JButton lblNewLabel = new JButton(new ImageIcon(newImage));
			lblNewLabel.setContentAreaFilled(false);
			lblNewLabel.setPreferredSize(new Dimension(50,50));
			lblNewLabel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					infoPan back = new infoPan();
					removeAll();
					add(back);
					repaint();
					revalidate();
				}
			});
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			pseven.add(lblNewLabel, gbc_lblNewLabel);
 
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		JButton btnNewButton_log = new JButton("LOG OUT");
		btnNewButton_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cittaFrame ritorno = new cittaFrame();
				removeAll();
				add(ritorno);
				repaint();
				revalidate();
			}
		});
		btnNewButton_log.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnNewButton_log = new GridBagConstraints();
		gbc_btnNewButton_log.anchor = GridBagConstraints.LINE_END;
		gbc_btnNewButton_log.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_log.gridx = 4;
		gbc_btnNewButton_log.gridy = 0;
		pseven.add(btnNewButton_log, gbc_btnNewButton_log);
		
		try 
		{
			BufferedImage myPicture2 = ImageIO.read(new File("C:\\Users\\jofox\\git\\LabB\\LabB\\primula.png"));
			Image newImage2 = myPicture2.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			JLabel lblNewLabelim = new JLabel(new ImageIcon(newImage2));
			lblNewLabelim.setPreferredSize(new Dimension(50,50));
			GridBagConstraints gbc_lblNewLabelim = new GridBagConstraints();
			gbc_lblNewLabelim.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabelim.gridx = 5;
			gbc_lblNewLabelim.gridy = 0;
			pseven.add(lblNewLabelim, gbc_lblNewLabelim);
			
 
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		JLabel lblNewLabel_1 = new JLabel("N.B. Nel caso in cui avessi gi\u00E0 segnalato un evento avverso, verr\u00E0 tenuto in considerazione");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.gridwidth = 4;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		pseven.add(lblNewLabel_1, gbc_lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("anche quello che hai avuto in precedenza. Nel caso in cui l'evento avverso \u00E8 lo stesso di quello");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_2.gridwidth = 4;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		pseven.add(lblNewLabel_2, gbc_lblNewLabel_2);
			
		JLabel lblNewLabel_3 = new JLabel("gi\u00E0 qui riportato, allora verr\u00E0 presa in considerazione solo la nuova segnalazione.");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_3.gridwidth = 4;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		pseven.add(lblNewLabel_3, gbc_lblNewLabel_3);
			
		JLabel lblNewLabel_4 = new JLabel("Nome utente: ___");
		lblNewLabel_4.setForeground(new Color(0, 0, 205));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.gridwidth = 4;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 4;
		pseven.add(lblNewLabel_4, gbc_lblNewLabel_4);
			
		JLabel lblNewLabel_5 = new JLabel("Vaccinato presso ___");
		lblNewLabel_5.setForeground(new Color(0, 0, 205));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_5.gridwidth = 4;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 5;
		pseven.add(lblNewLabel_5, gbc_lblNewLabel_5);
			
		JLabel lblNewLabel_6 = new JLabel("Tipo di vaccino ricevuto:");
		lblNewLabel_6.setForeground(new Color(0, 0, 205));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.gridwidth = 4;
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 6;
		pseven.add(lblNewLabel_6, gbc_lblNewLabel_6);
			
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pfizer");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 7;
		pseven.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
			
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Moderna");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 2;
		gbc_rdbtnNewRadioButton_1.gridy = 7;
		pseven.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
			
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Astrazeneca");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_2.gridx = 3;
		gbc_rdbtnNewRadioButton_2.gridy = 7;
		pseven.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
			
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("JnJ");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_3.gridx = 4;
		gbc_rdbtnNewRadioButton_3.gridy = 7;
		pseven.add(rdbtnNewRadioButton_3, gbc_rdbtnNewRadioButton_3);
		
		ButtonGroup btnGroupthree = new ButtonGroup();
		btnGroupthree.add(rdbtnNewRadioButton);
		btnGroupthree.add(rdbtnNewRadioButton_1);
		btnGroupthree.add(rdbtnNewRadioButton_2);
		btnGroupthree.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("Reazione avversa che vuoi segnalare:");
		lblNewLabel_7.setForeground(new Color(0, 0, 205));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_7.gridwidth = 2;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 8;
		pseven.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mal di testa", "Tachicardia", "Febbre", "Linfoadenopatia", "Raffreddore", 
				"Dolori muscolari", "Spossatezza", "Dolori articolari", "Crisi ipertensiva", "Paralisi di Bell", "Piastrinopenia autoimmune", "Acufeni"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 8;
		pseven.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_8 = new JLabel("Severit\u00E0 della reazione:");
		lblNewLabel_8.setForeground(new Color(0, 0, 205));
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_8.gridwidth = 2;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 9;
		pseven.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner.setEditor(new JSpinner.DefaultEditor(spinner));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 2;
		gbc_spinner.gridy = 9;
		pseven.add(spinner, gbc_spinner);
		
		JLabel lblNewLabel_9 = new JLabel("Note opzionali:");
		lblNewLabel_9.setForeground(new Color(0, 0, 0));
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 1;
		gbc_lblNewLabel_9.gridy = 10;
		pseven.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("(Max 256 caratteri)");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 2;
		gbc_lblNewLabel_10.gridy = 10;
		pseven.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 4;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 11;
		pseven.add(textArea, gbc_textArea);
		
		JButton btnNewButton = new JButton("REGISTRA SEGNALAZIONE AVVERSA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segfinPan ultima = new segfinPan();
				removeAll();
				add(ultima);
				repaint();
				revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 4;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 12;
		pseven.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("Completa tutti i campi obbligatori prima di proseguire");
		lblNewLabel_11.setForeground(Color.RED);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_11.gridwidth = 4;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 1;
		gbc_lblNewLabel_11.gridy = 13;
		pseven.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
	}

}
