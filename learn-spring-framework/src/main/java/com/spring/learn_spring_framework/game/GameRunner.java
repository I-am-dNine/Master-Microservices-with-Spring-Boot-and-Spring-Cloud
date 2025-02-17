package com.spring.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	// private MarioGame game;
	// private SuperContraGame game2;
	@Autowired
	private GamingConsole game;

	
	// public GameRunner(MarioGame game) {
	// 	this.game = game;
	// }
	
	// public GameRunner(SuperContraGame game) {
	// 	this.game2 = game;
	// }
	
	public GameRunner(GamingConsole game) {
		this.game = game;
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
	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
