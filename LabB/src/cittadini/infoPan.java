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
import javax.swing.JTextArea;

public class infoPan extends JPanel {

	/**
	 * Create the panel.
	 */
	public infoPan() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel psix = new JPanel();
		add(psix);
		GridBagLayout gbl_psix = new GridBagLayout();
		gbl_psix.columnWidths = new int[]{100, 125, 125, 125, 125, 100, 0};
		gbl_psix.rowHeights = new int[]{100, 60, 40, 40, 40, 40, 250, 60, 70, 0};
		gbl_psix.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_psix.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		psix.setLayout(gbl_psix);
		
		try 
		{
			BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\jofox\\git\\LabB\\LabB\\gobackb.png"));
			Image newImage = myPicture.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			JButton lblNewLabel = new JButton(new ImageIcon(newImage));
			lblNewLabel.setContentAreaFilled(false);
			lblNewLabel.setPreferredSize(new Dimension(50,50));
			lblNewLabel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ricePan back = new ricePan();
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
			psix.add(lblNewLabel, gbc_lblNewLabel);
 
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
		gbc_btnNewButton_log.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_log.gridx = 4;
		gbc_btnNewButton_log.gridy = 0;
		psix.add(btnNewButton_log, gbc_btnNewButton_log);
		
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
			psix.add(lblNewLabelim, gbc_lblNewLabelim);
 
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		JLabel lblNewLabel_1 = new JLabel("CENTRO VACCINALE _____");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 6;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		psix.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero di persone vaccinate presso questo centro: ___");
		lblNewLabel_2.setForeground(new Color(0, 0, 205));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_2.gridwidth = 4;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		psix.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Numero di eventi avversi segnalati: ___");
		lblNewLabel_3.setForeground(new Color(0, 0, 205));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 4;
		gbc_lblNewLabel_3.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		psix.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Visualizza gli eventi avversi associati al tipo di vaccino:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 4;
		gbc_lblNewLabel_4.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 4;
		psix.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pfizer");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 5;
		psix.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Moderna");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 2;
		gbc_rdbtnNewRadioButton_1.gridy = 5;
		psix.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Astrazeneca");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_2.gridx = 3;
		gbc_rdbtnNewRadioButton_2.gridy = 5;
		psix.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("JnJ");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_3.gridx = 4;
		gbc_rdbtnNewRadioButton_3.gridy = 5;
		psix.add(rdbtnNewRadioButton_3, gbc_rdbtnNewRadioButton_3);
		
		ButtonGroup btnGrouptwo = new ButtonGroup();
		btnGrouptwo.add(rdbtnNewRadioButton);
		btnGrouptwo.add(rdbtnNewRadioButton_1);
		btnGrouptwo.add(rdbtnNewRadioButton_2);
		btnGrouptwo.add(rdbtnNewRadioButton_3);
		
		JTextArea textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 4;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 1;
		gbc_textArea.gridy = 6;
		psix.add(textArea, gbc_textArea);
		
		JButton btnNewButton = new JButton("INSERISCI EVENTO AVVERSO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertPan last = new insertPan();
				removeAll();
				add(last);
				repaint();
				revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 4;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 7;
		psix.add(btnNewButton, gbc_btnNewButton);
	}

}
