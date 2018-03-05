package com.boot.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.topic.Topic;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hi";
	}

	@RequestMapping("/topics")
	public List<Topic> topics() {
		return Arrays.asList(new Topic("spring", "spring framework description", "spring framework"),
				new Topic("java", "java framework description", "java framework"));
	}

}
