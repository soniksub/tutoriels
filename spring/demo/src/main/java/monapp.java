package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
@SpringBootApplication
public class monapp {

	@Value("${api.parle.string}")
	private String defautParle;

	@RequestMapping("/api/parle")
	String parle() {
		return defautParle; 
	}

	public static void main(String[] args) {
		SpringApplication.run(monapp.class, args);
	}

}
