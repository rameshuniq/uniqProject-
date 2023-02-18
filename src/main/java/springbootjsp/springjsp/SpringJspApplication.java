package springbootjsp.springjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("springbootjsp.springjsp")
public class SpringJspApplication{
	public static void main(String[] args) {
		SpringApplication.run(SpringJspApplication.class, args);
	}
}