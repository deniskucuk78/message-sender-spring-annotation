package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppliConfig {
	@Bean
	public Message message() {
		return new Message();
	}

}
