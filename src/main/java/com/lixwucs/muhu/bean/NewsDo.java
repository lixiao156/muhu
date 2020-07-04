package com.lixwucs.muhu.bean;

import java.util.Date;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 14:03
 */
public class NewsDo {
    private Long id;

    private String name;

    private String title;

    private String summary;

    private String author;

    private Long createdid;

    private Long modifiedid;

    private Date createdtime;

    private Date modifiedtime;

    private String pic;

    private Integer channelsId;

    // 关联查询：实际上是不需要的
    private String channelName;
    // 关联查询
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCreatedid() {
        return createdid;
    }

    public void setCreatedid(Long createdid) {
        this.createdid = createdid;
    }

    public Long getModifiedid() {
        return modifiedid;
    }

    public void setModifiedid(Long modifiedid) {
        this.modifiedid = modifiedid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getChannelsId() {
        return channelsId;
    }

    public void setChannelsId(Integer channelsId) {
        this.channelsId = channelsId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NewsDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", author='" + author + '\'' +
                ", createdid=" + createdid +
                ", modifiedid=" + modifiedid +
                ", createdtime=" + createdtime +
                ", modifiedtime=" + modifiedtime +
                ", pic='" + pic + '\'' +
                ", channelsId=" + channelsId +
                ", channelName='" + channelName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
