import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.sound.sampled.*;

public class TitleScreen extends JPanel implements ActionListener, KeyListener{
	
	private JLabel background;
	private JLabel startLabel;
	private Timer t;
	private boolean color;
	private Clip clip;
	private int currentScreen;
	private CardLayout cl;
	private JPanel panelManager;
	
	
	public TitleScreen(CardLayout cl, JPanel panelManager)
	{
		this.setFocusable(true);
		this.requestFocusInWindow();
		File file = new File("Kanye-West-Wolves-_8-Bit-Remix_.wav");
		try {
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
		}
		catch(Exception e) {}
		this.setLayout(null);
		this.setPreferredSize(new Dimension(650, 650));
		color = true;
		t = new Timer(1000,this);
		t.start();
		this.addKeyListener(this);
		
		background = new JLabel();
		background.setIcon(new ImageIcon("titlescreen3.png"));
		background.setBounds(0, -25, 700, 700);
		this.add(background);
		
		startLabel = new JLabel("-Press Enter to Start-");
		startLabel.setBounds(140, 525, 500, 200);
		startLabel.setForeground(Color.RED);
		startLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		
		background.add(startLabel);
		this.currentScreen = currentScreen;
		this.panelManager = panelManager;
		this.cl = cl;
		this.setVisible(true);
	}
	
	public void off() 
	{
		clip.stop();
		t.stop();
	}
	
	public void on() 
	{
		clip.start();
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(color)
		{
			startLabel.setForeground(Color.RED);
			color = false;
		}
		else 
		{
			startLabel.setForeground(Color.YELLOW);
			color = true;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
			if(e.getKeyChar() == e.VK_ENTER) 
			{
				cl.show(panelManager, "highscorescreen");
				this.off();
				this.setFocusable(false);
				((panelManager)(this.panelManager)).startHighScore();
			}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
