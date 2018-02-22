package com.sanket.myfirsttry.com.sanket.myfirsttry.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Topic {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<TopicData> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topic/{foo}")
    public TopicData getTopic(@PathVariable("foo") String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public void addTopic(@RequestBody TopicData newTopic){
        topicService.addTopic(newTopic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{id}")
    public void updateTopic(@RequestBody TopicData updatedTopic, @PathVariable("id") String id){
        topicService.updateTopic(id,updatedTopic);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);

    }

}
