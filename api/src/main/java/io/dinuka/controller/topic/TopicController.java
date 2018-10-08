package io.dinuka.controller.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topic") 
	public List<Topic> getAllTpoic() {
		return Arrays.asList(
				new Topic("Spring", "spring Framework", "Spring Framework Description"),
				new Topic("Java", "Core Java", "Core Java Description"),
				new Topic("JavaScript", "JavaScript", "JavaScript Description")
				);
	}
}
