package com.courseapi.startapplication.hi;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Topiccontroller {
	
	@Autowired
	private TopicService topicService;
	
//	@RequestMapping("/hi")
	@GetMapping("/hi")
	public String getHello()
	{
		return "hello";
	}
	
	@RequestMapping("/topics")
	public List<Topics> getTopics()
	{
		return topicService.getAllTopics();
	}
	
	/*@RequestMapping("/topics/{name}")
	public Topics getTopicWithName(@PathVariable String name)
	{
		return topicService.getTopicwithname(name);
	}*/
	

}
