package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Demo {
	@Bean
	public Employee employee() {
		return new Employee();
	}
}
