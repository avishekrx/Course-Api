package com.courseapi.startapplication.hi;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topics> listTopics =  Arrays.asList(
			new Topics("java", "java algorithim", 200),
			new Topics("spring", "java spring boot", 500),
			new Topics("azure", "java devops", 400)
			);

	public List<Topics> getAllTopics()
	{
		return listTopics;
	}

	public Topics getTopicwithname(String name) {
		
		return listTopics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	/*	Topics top = null;
		for(int i=0;i<listTopics.size();i++)
		{
			if(listTopics.get(i).getName().equals(name))
			{
				top =  listTopics.get(i);
			}
		}
		
		return top;*/
	}
}
