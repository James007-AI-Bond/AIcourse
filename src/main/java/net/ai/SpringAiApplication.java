package net.ai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAiApplication {

	@Value("${ai.open-ai.api-keys}")
	public  static String  openAiApiKeys;

	public static void main(String[] args) {

		SpringApplication.run(SpringAiApplication.class, args);
	}

}
