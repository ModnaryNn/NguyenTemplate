package main;

import javax.swing.*;
import java.awt.*;

public class GameWindow {
	private JFrame jframe;
	public static GameWindow gameWindow = null;

	public GameWindow() {

		jframe = new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setResizable(false);
		jframe.setTitle(Constant.SCREEN_TITLE);
		addPanel(GamePanel.getGamePanel());
		jframe.pack();
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
	}

	public static GameWindow getGameWindow() {
		if (GameWindow.gameWindow == null) {
			GameWindow.gameWindow = new GameWindow();
		}
		return GameWindow.gameWindow;
	}



	public void addPanel(JPanel panel) {
		jframe.add(panel);
	}

}
