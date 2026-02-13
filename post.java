package com.smma.model;

public class Post {

    private String title;
    private String content;
    private String scheduledTime;

    public Post() {}

    public Post(String title, String content, String scheduledTime) {
        this.title = title;
        this.content = content;
        this.scheduledTime = scheduledTime;
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }

    public void setContent(String content) { this.content = content; }

    public String getScheduledTime() { return scheduledTime; }

    public void setScheduledTime(String scheduledTime) { this.scheduledTime = scheduledTime; }
}
