import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class HighScoreScreen extends JPanel implements ActionListener{
	
	private CardLayout cl;
	private JPanel panelManager;
	private Timer t;
	private Clip clip;
	
	public HighScoreScreen(CardLayout cl, JPanel panelManager) 
	{
		this.setPreferredSize(new Dimension(650, 650));
		this.setLayout(null);
		File file = new File("PUSHIN-P.wav");
		try {
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		}
		catch(Exception e) {}
		JLabel background = new JLabel();
		this.setBackground(Color.blue);
		background.setIcon(new ImageIcon("bestScore (2).jpg"));
		background.setBounds(0, -25, 700, 700);
		this.add(background);
		this.setFocusable(false);
		t = new Timer(6500, this);
		this.cl = cl;
		this.panelManager = panelManager;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		cl.show(panelManager, "game");
		((panelManager)(panelManager)).giveFocustoGame();
		t.stop();
		clip.stop();
		
	}
	
	public void start() 
	{
		t.start();
		clip.start();
	}
	
	

}
