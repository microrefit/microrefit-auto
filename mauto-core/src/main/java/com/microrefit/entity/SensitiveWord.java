package com.microrefit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: SensitiveWord
 * @Description: 敏感词实体类
 * @author wangpeng
 * @date 2016-6-12 下午2:34:13
 *
 */
@Entity
@Table(name = "sensitive_word")
public class SensitiveWord {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/**
	 * 敏感词内容
	 */
	private String content;
	/**
	 * 敏感词级别
	 */
	private int level;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}
