package cittadini;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
		                frame.setBounds(100, 100, 500, 600);
		                frame.setVisible(true);
		                frame.setTitle("Piattaforma vaccinale");
		                frame.getContentPane().add(panel);
		     
					} catch (Exception e) 
					{
						e.printStackTrace();
					}
				}
			});
		}
}