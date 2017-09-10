package co.id.payment.corporate.corporateh2h;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class CorporateH2hApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorporateH2hApplication.class, args);
	}
	
	@Bean
	public SpringDataDialect springDataDialect() {
		return new SpringDataDialect();	
	}
	
}
