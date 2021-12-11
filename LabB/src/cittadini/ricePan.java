package cittadini;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ricePan extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ricePan() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pfour = new JPanel();
		add(pfour);
		GridBagLayout gbl_pfour = new GridBagLayout();
		gbl_pfour.columnWidths = new int[]{100, 250, 250, 100, 0};
		gbl_pfour.rowHeights = new int[]{100, 60, 40, 40, 300, 160, 0};
		gbl_pfour.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pfour.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		pfour.setLayout(gbl_pfour);
		
		try 
		{
			BufferedImage myPicture = ImageIO.read(new File("C:\\Users\\jofox\\git\\LabB\\LabB\\gobackb.png"));
			Image newImage = myPicture.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			JButton lblNewLabel = new JButton(new ImageIcon(newImage));
			lblNewLabel.setContentAreaFilled(false);
			lblNewLabel.setPreferredSize(new Dimension(50,50));
			lblNewLabel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					homePanel home = new homePanel();
					removeAll();
					add(home);
					repaint();
					revalidate();
				}
			});
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 0;
			pfour.add(lblNewLabel, gbc_lblNewLabel);
 
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
		gbc_btnNewButton_log.gridx = 2;
		gbc_btnNewButton_log.gridy = 0;
		pfour.add(btnNewButton_log, gbc_btnNewButton_log);
		
		try 
		{
			BufferedImage myPicture2 = ImageIO.read(new File("C:\\Users\\jofox\\git\\LabB\\LabB\\primula.png"));
			Image newImage2 = myPicture2.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
				
			JLabel lblNewLabelim = new JLabel(new ImageIcon(newImage2));
			lblNewLabelim.setPreferredSize(new Dimension(50,50));
			GridBagConstraints gbc_lblNewLabelim = new GridBagConstraints();
			gbc_lblNewLabelim.insets = new Insets(0, 0, 5, 0);
			gbc_lblNewLabelim.gridx = 3;
			gbc_lblNewLabelim.gridy = 0;
			pfour.add(lblNewLabelim, gbc_lblNewLabelim);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		JLabel lblNewLabel_1 = new JLabel("Inserisci qui il nome del centro:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		
		JLabel lblNewLabel_1two = new JLabel("Inserisci qui comune del centro:");
		lblNewLabel_1two.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_1two = new GridBagConstraints();
		gbc_lblNewLabel_1two.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1two.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1two.gridx = 1;
		gbc_lblNewLabel_1two.gridy = 2;
		
		JLabel lblNewLabel_3 = new JLabel("Scegli la tipologia del centro: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.LINE_END;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.BOLD, 12));
		spinner.setModel(new SpinnerListModel(new String[] {"ospedaliero", "aziendale", "hub"}));
		spinner.setEditor(new JSpinner.DefaultEditor(spinner));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.anchor = GridBagConstraints.LINE_START;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 2;
		gbc_spinner.gridy = 3;
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Ricerca per nome");
		rdbtnNewRadioButton.setSelected(true);
		if (rdbtnNewRadioButton.isSelected()) {
			pfour.add(lblNewLabel_1, gbc_lblNewLabel_1);
			pfour.revalidate();
			pfour.repaint();
		}
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pfour.add(lblNewLabel_1, gbc_lblNewLabel_1);
				pfour.remove(lblNewLabel_1two);
				pfour.remove(lblNewLabel_3);
				pfour.remove(spinner);
				pfour.revalidate();
				pfour.repaint();
			}
		});
		if (rdbtnNewRadioButton.isSelected()==true) {
			pfour.add(lblNewLabel_1, gbc_lblNewLabel_1);
			pfour.revalidate();
			pfour.repaint();
		}
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.SOUTH;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 0;
		pfour.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Ricerca per comune e tipo");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pfour.add(lblNewLabel_1two, gbc_lblNewLabel_1two);
				pfour.add(lblNewLabel_3, gbc_lblNewLabel_3);
				pfour.add(spinner, gbc_spinner);
				pfour.remove(lblNewLabel_1);
				pfour.revalidate();
				pfour.repaint();
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 2;
		gbc_rdbtnNewRadioButton_1.gridy = 0;
		pfour.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnNewRadioButton);
		btnGroup.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 2;
		pfour.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Clicca su seleziona per consultare le informazioni del centro che ti interessa ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridwidth = 2;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 1;
		pfour.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 2;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 4;
		pfour.add(list, gbc_list);
		
		JButton btnNewButton = new JButton("SELEZIONA CENTRO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoPan seleziona = new infoPan();
				removeAll();
				add(seleziona);
				repaint();
				revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 5;
		pfour.add(btnNewButton, gbc_btnNewButton);

	}

}
