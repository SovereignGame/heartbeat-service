package com.sovereign.heartbeatservice.model;

import java.util.Date;

public class OutputMessage {

    private String from;
    private String message;
    private String topic;
    private Date time = new Date();

    public OutputMessage(String from, String text, String time) {
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public String getMessage() {
        return message;
    }

    public String getTopic() {
        return topic;
    }

    public Date getTime() {
        return time;
    }
}