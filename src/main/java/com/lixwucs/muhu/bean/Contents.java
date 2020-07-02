package com.lixwucs.muhu.bean;


public class Contents {
    private Long id;

    private Long noticesId;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNoticesId() {
        return noticesId;
    }

    public void setNoticesId(Long noticesId) {
        this.noticesId = noticesId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}