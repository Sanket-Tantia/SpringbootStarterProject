package com.sanket.myfirsttry.com.sanket.myfirsttry.topic;

public class TopicData {

    private String id;
    private String name;
    private String desc;

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TopicData(){

    }

    public TopicData(String id, String name, String desc) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
    }
}
