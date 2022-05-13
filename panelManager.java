import java.awt.CardLayout;

import javax.swing.JPanel;

import game.game;

public class panelManager extends JPanel{

	private TitleScreen titleScreen;
	private HighScoreScreen highScoreScreen;
	private game game;
	
	public panelManager() 
	{
	
		CardLayout cl = new CardLayout();
		this.setLayout(cl);
		//Panels
		titleScreen = new TitleScreen(cl, this);
		highScoreScreen = new HighScoreScreen(cl, this);
		game = new game(cl, this);
		
		//add panels to panel
		this.add(titleScreen, "titlescreen");
		this.add(highScoreScreen, "highscorescreen");
		this.add(game, "game");
		//show
		cl.show(this, "titlescreen");
		
	}
	
	public void startHighScore() 
	{
		highScoreScreen.start();
		
	}
	
	public void giveFocustoGame() 
	{
		game.setFocusable(true);
		game.requestFocus();
	}
}
