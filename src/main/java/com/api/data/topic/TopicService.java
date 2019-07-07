package com.api.data.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public TopicService(){
		
	}
	
	public List<Topic> getAllTopic(){
		List<Topic> topics = new ArrayList<Topic>();
		
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findById(id).orElse(null);
	}
	
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
	
	
	

}
