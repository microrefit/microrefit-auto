package com.microrefit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 关注实体类
 * @author wl
 */
@Entity
@Table(name = "watcher")
public class Watch {
	//评论ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//用户名
	private String userName;
	//真实姓名
	private String realName;
	//关注用户名
	private String watchUserName;
	//姓名
	private String watchRealName;
	
	public Watch(){
	}
	
	public Watch(String userName, String realName, String watchUserName, String watchRealName){
		super();
		this.userName = userName;
		this.realName = realName;
		this.watchUserName = watchUserName;
		this.watchRealName = watchRealName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getWatchUserName() {
		return watchUserName;
	}

	public void setWatchUserName(String watchUserName) {
		this.watchUserName = watchUserName;
	}

	public String getWatchRealName() {
		return watchRealName;
	}

	public void setWatchRealName(String watchRealName) {
		this.watchRealName = watchRealName;
	}
	
}
