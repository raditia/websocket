package com.raditia.websocket.model;

public class Greeting {

    private String content;
    private String time;

    public Greeting() {
    }

    public Greeting(String content, String time) {
        this.content = content;
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
