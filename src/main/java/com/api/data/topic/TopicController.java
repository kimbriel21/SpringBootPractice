package com.api.data.topic;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topics;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){

		return topics.getAllTopic();
	}
	
	@GetMapping("/topics/response")
	public  ResponseEntity<?> getAllTopicsResponse(){
		return new ResponseEntity<>(topics.getAllTopic(), HttpStatus.OK);
		
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopic(@RequestBody Topic topic, @PathVariable String id){
		return topics.getTopic(id);
	}
	
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		topics.addTopic(topic);
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
		topics.updateTopic(id, topic);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topics.deleteTopic(id);
		
	}
}
