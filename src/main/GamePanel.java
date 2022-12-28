package main;

import controller.KL;
import controller.ML;
import gui.Scene;
import gui.gamesence.GameScene;
import gui.menusence.MenuScene;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

	private static GamePanel gamePanel = null;
	private boolean running;
	private int currentState;
	private Scene currentScene;
	private KL keyListener = new KL();
	private ML mouseListener = new ML();

	private GamePanel() {
		this.setPreferredSize(new Dimension(Constant.SCREEN_WIDTH, Constant.SCREEN_HEIGHT));
		this.setFocusable(true);
		this.setDoubleBuffered(true);
		addKeyListener(keyListener);
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);
		setRunning(true);
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
				currentScene = new GameScene(keyListener,mouseListener);
				break;
			default:
				System.out.println("Error: Invalid state");
				currentScene = null;
				break;
		}
	}

	public void close() {
		setRunning(false);
	}

	public void update(double dt){
		currentScene.update(dt);
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		currentScene.draw(g);
}

	//GETTERS AND SETTERS

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

}


