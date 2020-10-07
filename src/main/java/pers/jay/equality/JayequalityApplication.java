package pers.jay.equality;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("pers.jay.equality.mapper")
public class JayequalityApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JayequalityApplication.class, args);
	}
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JayequalityApplication.class);
    }
}
