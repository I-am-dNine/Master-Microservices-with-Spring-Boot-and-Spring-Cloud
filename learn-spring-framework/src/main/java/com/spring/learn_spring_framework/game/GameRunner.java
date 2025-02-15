package com.spring.learn_spring_framework.game;

public class GameRunner {
	
	// private MarioGame game;
	// private SuperContraGame game2;
	private GamingConsole game3;

	
	// public GameRunner(MarioGame game) {
	// 	this.game = game;
	// }
	
	// public GameRunner(SuperContraGame game) {
	// 	this.game2 = game;
	// }
	
	public GameRunner(GamingConsole game) {
		this.game3 = game;
	}

	// public void run() {
	// 	game.up();
	// 	game.down();
	// 	game.left();
	// 	game.right();
	// }
	
	// public void run2() {
	// 	game2.up();
	// 	game2.down();
	// 	game2.left();
	// 	game2.right();
	// }
	
	public void run3() {
		game3.up();
		game3.down();
		game3.left();
		game3.right();
	}

}
