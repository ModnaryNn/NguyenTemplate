package main;

public class Game implements Runnable {

	private GameWindow gameWindow;
	private GamePanel gamePanel;
	private Thread gameThread;
	private final int FPS_SET = 120;

	//CONSTRUCTOR
	public Game() {
		gamePanel 	= 		GamePanel.getGamePanel();
		gameWindow 	= 		GameWindow.getGameWindow();
		gamePanel.requestFocus();
		startGameLoop();
	}

	//METHODS
	private void startGameLoop() {
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {

		double timePerFrame = 1000000000.0 / FPS_SET;
		long lastFrame = System.nanoTime();
		long now = System.nanoTime();

		int frames = 0;
		long lastCheck = System.currentTimeMillis();

		while (gamePanel.isRunning) {

			now = System.nanoTime();
			if (now - lastFrame >= timePerFrame) {
				gamePanel.update(now-lastFrame);
				gamePanel.repaint();
				lastFrame = now;
				frames++;
			}

			if (System.currentTimeMillis() - lastCheck >= 1000) {
				lastCheck = System.currentTimeMillis();
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		System.exit(0);
	}

}
