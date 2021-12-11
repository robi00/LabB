package cittadini;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
import javax.swing.JButton;
import java.awt.Color;

public class segfinPan extends JPanel {

	/**
	 * Create the panel.
	 */
	public segfinPan() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel peight = new JPanel();
		add(peight);
		GridBagLayout gbl_peight = new GridBagLayout();
		gbl_peight.columnWidths = new int[]{100, 500, 100, 0};
		gbl_peight.rowHeights = new int[]{100, 200, 60, 60, 0};
		gbl_peight.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_peight.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		peight.setLayout(gbl_peight);
		
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
			peight.add(lblNewLabelim, gbc_lblNewLabelim);
			
			JLabel lblNewLabel = new JLabel("SEGNALAZIONE REGISTRATA CON SUCCESSO!");
			lblNewLabel.setForeground(new Color(0, 128, 128));
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 1;
			gbc_lblNewLabel.gridy = 1;
			peight.add(lblNewLabel, gbc_lblNewLabel);
			
			JButton btnNewButton = new JButton("TORNA ALLA HOME");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					homePanel home = new homePanel();
					removeAll();
					add(home);
					repaint();
					revalidate();
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
			gbc_btnNewButton.gridx = 1;
			gbc_btnNewButton.gridy = 2;
			peight.add(btnNewButton, gbc_btnNewButton);
			
			JButton btnNewButton_1 = new JButton("EFFETTUA IL LOG OUT");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cittaFrame ritorno = new cittaFrame();
					removeAll();
					add(ritorno);
					repaint();
					revalidate();
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
			gbc_btnNewButton_1.gridx = 1;
			gbc_btnNewButton_1.gridy = 3;
			peight.add(btnNewButton_1, gbc_btnNewButton_1);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		
	}

}
