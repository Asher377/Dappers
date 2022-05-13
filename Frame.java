import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{
	
	private int currentStage;
	private JPanel panelManager;
	
	public Frame() 
	{
		super("Dappers!");
		
		panelManager = new panelManager();
		
		this.setIconImage(new ImageIcon("icon.jpg").getImage());
		this.setBackground(Color.black);
		this.setResizable(false);
		
		this.add(panelManager);
		this.pack();
		
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}

}
