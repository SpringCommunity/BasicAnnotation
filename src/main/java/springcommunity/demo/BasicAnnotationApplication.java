package springcommunity.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"springcommunity.demo"})
public class BasicAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAnnotationApplication.class, args);
	}
}
