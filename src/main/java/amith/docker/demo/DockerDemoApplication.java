package amith.docker.demo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path="/docker")
public class DockerDemoApplication {
	
	Logger logger = LoggerFactory.getLogger(DockerDemoApplication.class);
	
	@GetMapping(path="/message")
	public @ResponseBody String display()
	{
		logger.error("It is working as expected");
		return "Hello World I am a docker with Jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoApplication.class, args);
	}

}
