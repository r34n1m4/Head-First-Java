package com.reanima.spring.springlearn;

import com.reanima.spring.springlearn.enterprise.web.MyWebController;
import com.reanima.spring.springlearn.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(SpringLearnApplication.class, args);
		//GamingConsole game = new MarioGame();
		//GamingConsole game = new SuperContraGame();
		//GamingConsole game = new PacManGame();
		//GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
