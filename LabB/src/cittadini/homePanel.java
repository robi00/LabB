package cittadini;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class homePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public homePanel() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pfive = new JPanel();
		add(pfive);
		GridBagLayout gbl_pfive = new GridBagLayout();
		gbl_pfive.columnWidths = new int[]{100, 500, 100, 0};
		gbl_pfive.rowHeights = new int[]{100, 80, 40, 40, 40, 60, 40, 60, 40, 0};
		gbl_pfive.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pfive.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pfive.setLayout(gbl_pfive);
		
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
		gbc_btnNewButton_log.gridx = 1;
		gbc_btnNewButton_log.gridy = 0;
		pfive.add(btnNewButton_log, gbc_btnNewButton_log);
		
		try 
		{
			BufferedImage myPicture2 = ImageIO.read(new File("C:\\Users\\jofox\\git\\LabB\\LabB\\primula.png"));
			Image newImage2 = myPicture2.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			JLabel lblNewLabelim = new JLabel(new ImageIcon(newImage2));
			lblNewLabelim.setPreferredSize(new Dimension(50,50));
			GridBagConstraints gbc_lblNewLabelim = new GridBagConstraints();
			gbc_lblNewLabelim.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabelim.gridx = 2;
			gbc_lblNewLabelim.gridy = 0;
			pfive.add(lblNewLabelim, gbc_lblNewLabelim);
 
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		JLabel lblNewLabel_1 = new JLabel("Ciao ___ !");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		pfive.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome utente: ___");
		lblNewLabel_2.setForeground(new Color(0, 0, 205));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		pfive.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vaccinato presso il centro: ___");
		lblNewLabel_3.setForeground(new Color(0, 0, 205));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		pfive.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ID univoco corrispondente: ___");
		lblNewLabel_4.setForeground(new Color(0, 0, 205));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 4;
		pfive.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Se vuoi consultare le informazioni del tuo centro o di un centro qualsiasi:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 5;
		pfive.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JButton btnNewButton = new JButton("CERCA CENTRO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ricePan ricerca = new ricePan();
				removeAll();
				add(ricerca);
				repaint();
				revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 6;
		pfive.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Se invece hai avuto un effetto collaterale al vaccino che vuoi segnalare:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.LINE_START;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 7;
		pfive.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("SEGNALA EVENTO AVVERSO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertPan segnala = new insertPan();
				removeAll();
				add(segnala);
				repaint();
				revalidate();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 8;
		pfive.add(btnNewButton_1, gbc_btnNewButton_1);
		
	}

}
