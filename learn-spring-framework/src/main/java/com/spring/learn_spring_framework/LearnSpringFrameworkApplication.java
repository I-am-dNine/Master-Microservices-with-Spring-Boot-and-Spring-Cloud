package com.spring.learn_spring_framework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.learn_spring_framework.game.GameRunner;
import com.spring.learn_spring_framework.game.MarioGame;
import com.spring.learn_spring_framework.game.PacmanGame;
import com.spring.learn_spring_framework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
		SuperContraGame game2 = new SuperContraGame();
		PacmanGame game3 = new PacmanGame();

		GameRunner runner = new GameRunner(game);
//		runner.run();
		runner.run3();
		GameRunner runner2 = new GameRunner(game2);
//		runner2.run2();
		runner2.run3();
		GameRunner runner3 = new GameRunner(game3);
		runner3.run3();


	}

}
