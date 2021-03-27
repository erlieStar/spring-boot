package org.springframework.boot.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RequestMapping("index")
    public String index() {
	    return "hello world";
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
	    return args -> {
            String[] bns = context.getBeanDefinitionNames();
            for (String beanName : bns) {
                System.out.println(beanName);
            }
        };
    }
}
