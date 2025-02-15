package com.spring.learn_spring_framework;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.learn_spring_framework.game.GameRunner;
import com.spring.learn_spring_framework.game.MarioGame;
import com.spring.learn_spring_framework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		MarioGame game = new MarioGame();
		SuperContraGame game2 = new SuperContraGame();

		GameRunner runner = new GameRunner(game);
		runner.run();
		GameRunner runner2 = new GameRunner(game2);
		runner2.run2();


	}

}
