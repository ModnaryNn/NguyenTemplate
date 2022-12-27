package main;

import controller.KL;
import controller.ML;
import gui.Scene;
import gui.gamesence.GameScene;
import gui.menusence.MenuScene;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

	public static GamePanel gamePanel = null;
	public boolean isRunning;
	public int currentState;
	public Scene currentScene;
	public KL keyListener = new KL();
	public ML mouseListener = new ML();

	public GamePanel() {
		this.setPreferredSize(new Dimension(Constant.SCREEN_WIDTH, Constant.SCREEN_HEIGHT));
		this.setFocusable(true);
		this.setDoubleBuffered(true);
		addKeyListener(keyListener);
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);
		isRunning = true;
		changeState(0);
	}

	public static GamePanel getGamePanel() {
		if (gamePanel == null)
		{
			gamePanel = new GamePanel();
		}
		return gamePanel;
	}

	public void changeState(int newState) {
		currentState = newState;
		switch (currentState){
			case 0:
				currentScene = new MenuScene(keyListener,mouseListener);
				break;
			case 1:
				currentScene = new GameScene();
				break;
			default:
				System.out.println("Error: Invalid state");
				currentScene = null;
				break;
		}
	}

	public void close() {
		isRunning = false;
	}

	public void update(double dt){
		currentScene.update(dt);
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		currentScene.draw(g);
}

}


