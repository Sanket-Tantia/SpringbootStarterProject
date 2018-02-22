package com.sanket.myfirsttry.com.sanket.myfirsttry.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<TopicData> alltopics = new ArrayList<>( Arrays.asList(
//        new TopicData("abc","course","des"),
//                new TopicData("xyz","course1","des1")
//        ));

    public List<TopicData> getAllTopics(){
        //return alltopics;
        List<TopicData> alltopics = new ArrayList<>();
        topicRepository.findAll().forEach(alltopics::add);
        return alltopics;
    }

    public TopicData getTopic(String id){
        //return alltopics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
        return topicRepository.findOne(id);
    }

    public void addTopic(TopicData newTopic) {
        //alltopics.add(newTopic);
        topicRepository.save(newTopic);
    }

    public void updateTopic(String id, TopicData updatedTopic) {
        //alltopics.stream().filter(t ->t.getId().equals(id)).findFirst().set

//        for(int i=0;i<alltopics.size();i++){
//            TopicData t = alltopics.get(i);
//            if(t.getId()==id){
//                alltopics.set(i,updatedTopic);
//                return "true";
//            }
//        }
//        return id;
        topicRepository.save(updatedTopic);
    }

    public void deleteTopic(String id) {
        //alltopics.removeIf(t -> t.getId().equals(id));
        topicRepository.delete(id);
    }
}
