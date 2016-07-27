/**
 * Project Name:HYOA_CORE 
 * File Name:Dept.java 
 * Package Name:com.cmcc.oa.pojo 
 * Date:2016-6-27上午11:05:54
 */
package com.microrefit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @ClassName: Dept
 * @Description:  部门
 * @author wangpeng
 * @date 2016-6-27 上午11:05:54
 */
@Entity
@Table(name = "dept")
public class Dept {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String deptName;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
