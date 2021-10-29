package com.crudspring.apicrud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "channelYT")

public class ChannelEntity {

    @Id
    private String channelId;
    private String title;
    private String channelName;
    private String publishAt;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getPublishAt() {
        return publishAt;
    }

    public void setPublishAt(String publishAt) {
        this.publishAt = publishAt;
    }

    @Override
    public String toString() {
        return "ChannelEntity{" +
                "channelId='" + channelId + '\'' +
                ", title='" + title + '\'' +
                ", channelName='" + channelName + '\'' +
                ", publishAt='" + publishAt + '\'' +
                '}';
    }
}
