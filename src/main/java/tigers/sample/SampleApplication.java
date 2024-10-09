package tigers.sample;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
}

@RestController
@RequestMapping("/hello")
class HelloController {
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	@GetMapping
	public String hello() {
    log.info("Hello is called {}",
        OffsetDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
		return "Hello Vinh!";
	}
}
