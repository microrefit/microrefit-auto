package com.microrefit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 博客实体类
 * @author wl
 */
@Entity
@Table(name = "weibo")
public class Blog {
    //主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //博客内容
    private String content;
    //用户名
    private String userName;
    //用户姓名
    private String realName;
    //发帖时间
    private Date releaseTime;
    //附件ID，多个以，分隔
    private String attachId;
    //图片ID，多个以，分隔
    private String imageId;
    //点赞数
    private Integer praise;
    //转发数
    private Integer ref;
    //评论数
    private Integer comment;
    //被收藏数
    private Integer store;
    //是否精品 0-否 1-是
    private Integer competitive;
    //精品设置时间
    private Date cpTime;
    //精品设置用户名
    private String cpName;
    //精品设置用户姓名
    private String cpRealName;
    //是否置顶 0-否 1-是
    private Integer top;
    //置顶时间
    private Date topTime;
    //置顶设置用户名
    private String topName;
    //置顶设置用户姓名
    private String topRealName;
    //置顶过期时间
    private Date topDeadline;
    /**
     * 删除状态
     * 0：正常
     * 1：已删除
     */
    private int deleteStatus;
    
    private String position;

    public Blog() {
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

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getAttachId() {
        return attachId;
    }

    public void setAttachId(String attachId) {
        this.attachId = attachId;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Integer getRef() {
        return ref;
    }

    public void setRef(Integer ref) {
        this.ref = ref;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Integer competitive) {
        this.competitive = competitive;
    }

    public Date getCpTime() {
        return cpTime;
    }

    public void setCpTime(Date cpTime) {
        this.cpTime = cpTime;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Date getTopTime() {
        return topTime;
    }

    public void setTopTime(Date topTime) {
        this.topTime = topTime;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName;
    }

    public Date getTopDeadline() {
        return topDeadline;
    }

    public void setTopDeadline(Date topDeadline) {
        this.topDeadline = topDeadline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCpRealName() {
        return cpRealName;
    }

    public void setCpRealName(String cpRealName) {
        this.cpRealName = cpRealName;
    }

    public String getTopRealName() {
        return topRealName;
    }

    public void setTopRealName(String topRealName) {
        this.topRealName = topRealName;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
    
}
