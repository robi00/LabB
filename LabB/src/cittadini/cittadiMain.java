package cittadini;


import javax.swing.*;


import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class cittadiMain extends JFrame
{
	// Crea frame
	public static void main(String[] args) 
	{
			
			EventQueue.invokeLater(new Runnable() 
			{
				public void run() 
				{
					try 
					{
						JFrame frame = new JFrame();
						cittaFrame panel = new cittaFrame();
		                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		                frame.setLocation(500, 150);
		                panel.setPreferredSize(new Dimension(700, 700));
		                frame.setResizable(false);
		                frame.setVisible(true);
		                frame.setTitle("Piattaforma vaccinale");
		                ImageIcon icon = new ImageIcon("C:\\Users\\jofox\\git\\LabB\\LabB\\primula.png");
		                frame.setIconImage(icon.getImage());
		                frame.getContentPane().add(panel);
		                frame.pack();
		     
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
				}
			});
		}
}

