/**
 * Project Name:HYOA_CORE 
 * File Name:Proposal.java 
 * Package Name:com.cmcc.oa.pojo 
 * Date:2016-7-4下午6:20:48
 */
package com.microrefit.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName: Proposal
 * @Description: 提案
 * @author wangpeng
 * @date 2016-7-4 下午6:20:48
 */
@Entity
@Table(name="proposal")
public class Proposal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	/**
	 * 提案人
	 */
	private String proposer;
	/**
	 * 提案人部门
	 */
	private String proposerDept;
	/**
	 * 提案类别
	 */
	private String proposalType;
	/**
	 * 提案主题
	 */
	private String proposalTheme;
	/**
	 * 建议办理部门
	 */
	private String handleDept;
	/**
	 * 提案内容及理由
	 */
	private String contentAndReason;
	/**
	 * 解决措施及建议
	 */
	private String stepAndSuggest;
	/**
	 * 建议时间
	 */
	private Date proposalTime;
	/**
	 *回复时间
	 */
	private Date replyTime;
	/**
	 * 回复内容
	 */
	private String reply;
	/**
	 * 通过状态
	 */
	private boolean pass;
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
	 * @return the proposer
	 */
	public String getProposer() {
		return proposer;
	}
	/**
	 * @param proposer the proposer to set
	 */
	public void setProposer(String proposer) {
		this.proposer = proposer;
	}
	/**
	 * @return the proposerDept
	 */
	public String getProposerDept() {
		return proposerDept;
	}
	/**
	 * @param proposerDept the proposerDept to set
	 */
	public void setProposerDept(String proposerDept) {
		this.proposerDept = proposerDept;
	}
	/**
	 * @return the proposalType
	 */
	public String getProposalType() {
		return proposalType;
	}
	/**
	 * @param proposalType the proposalType to set
	 */
	public void setProposalType(String proposalType) {
		this.proposalType = proposalType;
	}
	/**
	 * @return the proposalTheme
	 */
	public String getProposalTheme() {
		return proposalTheme;
	}
	/**
	 * @param proposalTheme the proposalTheme to set
	 */
	public void setProposalTheme(String proposalTheme) {
		this.proposalTheme = proposalTheme;
	}
	/**
	 * @return the handleDept
	 */
	public String getHandleDept() {
		return handleDept;
	}
	/**
	 * @param handleDept the handleDept to set
	 */
	public void setHandleDept(String handleDept) {
		this.handleDept = handleDept;
	}
	/**
	 * @return the replyTime
	 */
	public Date getReplyTime() {
		return replyTime;
	}
	/**
	 * @param replyTime the replyTime to set
	 */
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	/**
	 * @return the contentAndReason
	 */
	public String getContentAndReason() {
		return contentAndReason;
	}
	/**
	 * @param contentAndReason the contentAndReason to set
	 */
	public void setContentAndReason(String contentAndReason) {
		this.contentAndReason = contentAndReason;
	}
	/**
	 * @return the stepAndSuggest
	 */
	public String getStepAndSuggest() {
		return stepAndSuggest;
	}
	/**
	 * @param stepAndSuggest the stepAndSuggest to set
	 */
	public void setStepAndSuggest(String stepAndSuggest) {
		this.stepAndSuggest = stepAndSuggest;
	}
	/**
	 * @return the proposalTime
	 */
	public Date getProposalTime() {
		return proposalTime;
	}
	/**
	 * @param proposalTime the proposalTime to set
	 */
	public void setProposalTime(Date proposalTime) {
		this.proposalTime = proposalTime;
	}
	/**
	 * @return the reply
	 */
	public String getReply() {
		return reply;
	}
	/**
	 * @param reply the reply to set
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}
	/**
	 * @return the pass
	 */
	public boolean isPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	
}
