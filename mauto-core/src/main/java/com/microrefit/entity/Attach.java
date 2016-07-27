package com.microrefit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 博客-附件实体类
 * @author wl
 */
@Entity
@Table(name = "attach")
public class Attach {
    //附件ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //附件uuid
    private String uuid;
    //附件路径
    private String path;
    //附件文件名
    private String fileName;
    //附件大小
    private long fileSize;
    //附件上传日期
    private Date uploadDate;
    //附件上传用户名
    private String creater;
    //附件上传用户姓名
    private String createrRealName;
    //附件来源
    private String origion;

    public Attach() {
    }

    public Attach(long id, String fileName, long fileSize) {
        this.id = id;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public Attach(String fileName, long fileSize, Date uploadDate, String creater, String createrRealName, String origion, String uuid, String path) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.uploadDate = uploadDate;
        this.creater = creater;
        this.createrRealName = createrRealName;
        this.origion = origion;
        this.path = path;
        this.uuid = uuid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
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

    public long getFileSize() {
        return fileSize;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getOrigion() {
        return origion;
    }

    public void setOrigion(String origion) {
        this.origion = origion;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
}
