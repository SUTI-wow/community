package com.suti.community.entity;

import java.util.HashMap;
import java.util.Map;

public class Event {
    //事件类型 点赞 关注 评论
    private String topic;
    //触发事件的人
    private int userId;
    //事件发生在哪个实体 实体：帖子 评论 用户
    private int entityType;
    private int entityId;
    //实体的作者
    private int entityUserId;

    private Map<String, Object> data = new HashMap<>();

    public String getTopic() {
        return topic;
    }


    //setter方法返回值设置为 event  方便连用setter方法
    public Event setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Event setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public Event setEntityType(int entityType) {
        this.entityType = entityType;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public Event setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityUserId() {
        return entityUserId;
    }

    public Event setEntityUserId(int entityUserId) {
        this.entityUserId = entityUserId;
        return this;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public Event setData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
}
