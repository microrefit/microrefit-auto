package com.microrefit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 点赞表
 * @author wangyanming-cx
 * @date 2016年6月6日16:24:17
 *
 */
@Entity
@Table(name = "praise")
public class Praise {
    //主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    //博客编号
    private long blogId;
    //用户Id
    private long userId;
    //用户名
    private String userName;
    //用户姓名
    private String realName;
    //点赞时间
    private Date createTime;
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
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
}
