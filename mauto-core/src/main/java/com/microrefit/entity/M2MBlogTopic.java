/*
 * Project: HYOA
 * 
 * File Created at 2016年6月13日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.microrefit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Type BlogTopic.java
 * @Desc 微博和话题的多对多表映射
 * @author 张秋扬
 * @date 2016年6月13日 下午3:00:31
 * @version 
 */
@Entity
@Table(name = "blog_topic_m2m")
public class M2MBlogTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long blogId;
    private long topicId;
    private String topicName;

    public M2MBlogTopic(long blogId, long topicId, String topicName) {
        this.blogId = blogId;
        this.topicId = topicId;
        this.topicName = topicName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBlogId() {
        return blogId;
    }

    public void setBlogId(long blogId) {
        this.blogId = blogId;
    }

    public long getTopicId() {
        return topicId;
    }

    public void setTopicId(long topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年6月13日 张秋扬 create
 */
