package com.microrefit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: EmpCommPraise
 * @Description:  员工交流点赞表
 * @author wangpeng
 * @date 2016-6-20 下午4:22:38
 */
@Entity
@Table(name = "emp_comm_praise")
public class EmpCommPraise {
    //主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    //博客编号
    private long empCommId;
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
	public long getEmpCommId() {
		return empCommId;
	}
	public void setEmpCommId(long empCommId) {
		this.empCommId = empCommId;
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
