package com.microrefit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="proposal_discuss")
public class ProposalDiscuss {

	//评论ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//上一级评论ID
	private long upDiscussId;
    //上一级评论用户名
    private String upDiscussUserName;
	//直播话题id
	private long proposalId;
	//评论内容
	private String content;
	//评论者用户Id
	private long userId;
	//评论者用户名
	private String userName;
	//评论用户姓名
	private String realName;
	//评论时间
	private Date createTime;
	//是否置顶 0-否 1-是
    private Integer top;
    //回复用户姓名--如果upDiscussId部位null，此处必须有值
    private String returnName;
    
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
	public String getUpDiscussUserName() {
		return upDiscussUserName;
	}
	public void setUpDiscussUserName(String upDiscussUserName) {
		this.upDiscussUserName = upDiscussUserName;
	}
	public long getProposalId() {
		return proposalId;
	}
	public void setProposalId(long proposalId) {
		this.proposalId = proposalId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public Integer getTop() {
		return top;
	}
	public void setTop(Integer top) {
		this.top = top;
	}
	public String getReturnName() {
		return returnName;
	}
	public void setReturnName(String returnName) {
		this.returnName = returnName;
	}
    
    
}
