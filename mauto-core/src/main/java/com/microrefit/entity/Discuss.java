package com.microrefit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 博客的评论类
 * @author wl
 */
@Entity
@Table(name = "weibo_discuss")
public class Discuss {
	//评论ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//上一级评论ID
	private long upDiscussId;
	//微博id
	private long weiboId;
	//评论内容
	private String content;
	//评论时间
	private Date createTime;
	//评论者用户名
	private String creater;
	//评论用户姓名
	private String createrRealName;
	//上一级评论用户名
	private String upDiscussUserName;
    //上一级评论真实姓名
    private String upDiscussRealName;
	
	public Discuss(){
	}
	
	public Discuss(long weiboId, String content, Date createTime, String creater, String createrRealName){
		super();
		this.weiboId = weiboId;
		this.content = content;
		this.createTime = createTime;
		this.creater = creater;
		this.createrRealName = createrRealName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUpDiscussId() {
		return upDiscussId;
	}

	public void setUpDiscussId(long upDiscussId) {
		this.upDiscussId = upDiscussId;
	}

	public long getWeiboId() {
		return weiboId;
	}

	public void setWeiboId(long weiboId) {
		this.weiboId = weiboId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getCreaterRealName() {
		return createrRealName;
	}

	public void setCreaterRealName(String createrRealName) {
		this.createrRealName = createrRealName;
	}

	public String getUpDiscussUserName() {
		return upDiscussUserName;
	}

	public void setUpDiscussUserName(String upDiscussUserName) {
		this.upDiscussUserName = upDiscussUserName;
	}

    public String getUpDiscussRealName() {
        return upDiscussRealName;
    }

    public void setUpDiscussRealName(String upDiscussRealName) {
        this.upDiscussRealName = upDiscussRealName;
    }
	
}
