package com.lixwucs.muhu.bean;



public class Channels {
    private Integer channelId;

    private String channelName;

    private Long noticesId;

    private Integer channelParentId;

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Long getNoticesId() {
        return noticesId;
    }

    public void setNoticesId(Long noticesId) {
        this.noticesId = noticesId;
    }

    public Integer getChannelParentId() {
        return channelParentId;
    }

    public void setChannelParentId(Integer channelParentId) {
        this.channelParentId = channelParentId;
    }
}