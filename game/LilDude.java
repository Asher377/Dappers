package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class LilDude extends JComponent{
	
	public LilDude() 
	{
		
	}
	
	public void paint(Graphics g)
	{
	        g.drawImage(new ImageIcon("icon.jpg").getImage() ,100,100,this);
	        
	}

}
