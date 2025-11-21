package ho_daniel.Zoe.Fitness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.mongodb.autoconfigure.MongoAutoConfiguration;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
@RestController
public class ZoeFitnessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoeFitnessApplication.class, args);
	}

}
