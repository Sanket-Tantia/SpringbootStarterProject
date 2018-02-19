package com.sanket.myfirsttry.com.sanket.myfirsttry.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<TopicData> alltopics = new ArrayList<>( Arrays.asList(
        new TopicData("abc","course","des"),
                new TopicData("xyz","course1","des1")
        ));

    public List<TopicData> getAllTopics(){
        return alltopics;
    }

    public TopicData getTopic(String id){
        return alltopics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(TopicData newTopic) {
        alltopics.add(newTopic);    
    }

    public String updateTopic(String id, TopicData updatedTopic) {
        for(int i=0;i<alltopics.size();i++){
            TopicData t = alltopics.get(i);
            if(t.getId()==id){
                alltopics.set(i,updatedTopic);
                return "true";
            }
        }
        return "Sanket";
    }
}
