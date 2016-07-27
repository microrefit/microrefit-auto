package com.microrefit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 博客-话题实体类
 * @author 张秋扬
 */
@Entity
@Table(name = "topic")
public class Topic {
    //主键ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //话题名
    private String name;
    //创建人
    private String userName;
    //创建人姓名
    private String realName;
    //创建时间
    private Date createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Topic [id=" + id + ", name=" + name + ", userName=" + userName + ", realName=" + realName + ", createDate=" + createDate + "]";
    }

}
