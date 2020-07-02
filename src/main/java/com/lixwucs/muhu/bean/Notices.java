package com.lixwucs.muhu.bean;

import java.util.Date;

public class Notices {
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

    private Integer parentId;

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
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
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
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getChannelsId() {
        return channelsId;
    }

    public void setChannelsId(Integer channelsId) {
        this.channelsId = channelsId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}