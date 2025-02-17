package com.spring.learn_spring_framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.learn_spring_framework.game.GameRunner;
//import com.spring.learn_spring_framework.game.MarioGame;
//import com.spring.learn_spring_framework.game.PacmanGame;
//import com.spring.learn_spring_framework.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
//		SuperContraGame game2 = new SuperContraGame();
//		PacmanGame game3 = new PacmanGame();
//
//		GameRunner runner = new GameRunner(game);
////		runner.run();
//		runner.run();
//		GameRunner runner2 = new GameRunner(game2);
////		runner2.run2();
//		runner2.run();
//		GameRunner runner3 = new GameRunner(game3);
//		runner3.run();
		
		ConfigurableApplicationContext context =  SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

	}

}
