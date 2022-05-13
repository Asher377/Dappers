package game;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class game extends JPanel implements KeyListener{
	
	private CardLayout cl;
	private JPanel panelManager;
	
	public game(CardLayout cl, JPanel panelManager) 
	{
		this.setBackground(Color.BLACK);
		this.setPreferredSize(new Dimension(650, 650));
		this.setLayout(null);
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("gamebackground.png"));
		background.setBounds(-30, -26, 700, 700);
		this.add(background);
		LilDude lil = new LilDude();
		lil.setBounds(100, 100, 500, 500);
		background.add(lil);
		this.cl = cl;
		this.panelManager = panelManager;
		this.setFocusable(false);
		this.addKeyListener(this);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
