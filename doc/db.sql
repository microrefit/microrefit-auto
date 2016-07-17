/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2016-07-17 15:17:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `USER_ACCOUNT` varchar(255) DEFAULT NULL COMMENT '用户账号',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for attach
-- ----------------------------
DROP TABLE IF EXISTS `attach`;
CREATE TABLE `attach` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `attachId` varchar(32) DEFAULT NULL,
  `path` varchar(128) DEFAULT NULL,
  `uuid` varchar(64) DEFAULT NULL,
  `fileName` varchar(128) DEFAULT NULL,
  `uploadDate` datetime DEFAULT NULL,
  `creater` varchar(20) DEFAULT NULL,
  `createrRealName` varchar(20) DEFAULT NULL,
  `origion` varchar(30) DEFAULT NULL,
  `fileSize` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_topic_m2m
-- ----------------------------
DROP TABLE IF EXISTS `blog_topic_m2m`;
CREATE TABLE `blog_topic_m2m` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blogId` bigint(20) NOT NULL,
  `topicId` bigint(20) NOT NULL,
  `topicName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `deptName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for emp_comm
-- ----------------------------
DROP TABLE IF EXISTS `emp_comm`;
CREATE TABLE `emp_comm` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `realName` varchar(20) DEFAULT NULL,
  `releaseTime` datetime DEFAULT NULL COMMENT '提问时间',
  `attachId` varchar(64) DEFAULT NULL COMMENT '附件ID',
  `praise` int(10) DEFAULT '0' COMMENT '点赞数',
  `ref` int(10) DEFAULT NULL COMMENT '转发数',
  `comment` int(10) DEFAULT '0' COMMENT '评论数',
  `store` int(10) DEFAULT NULL,
  `competitive` int(10) DEFAULT NULL,
  `cpTime` datetime DEFAULT NULL,
  `cpName` varchar(20) DEFAULT NULL,
  `cpRealName` varchar(20) DEFAULT NULL,
  `top` int(10) DEFAULT NULL,
  `topTime` datetime DEFAULT NULL,
  `topName` varchar(20) DEFAULT NULL,
  `topRealName` varchar(20) DEFAULT NULL,
  `topDeadline` datetime DEFAULT NULL,
  `content` varchar(2000) DEFAULT NULL,
  `imageId` varchar(255) DEFAULT NULL,
  `deleteStatus` int(1) DEFAULT '0' COMMENT '删除状态0表示正常1表示已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for emp_comm_disc
-- ----------------------------
DROP TABLE IF EXISTS `emp_comm_disc`;
CREATE TABLE `emp_comm_disc` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `upDiscussId` bigint(10) DEFAULT '0' COMMENT '上一级评论人id',
  `empCommId` int(10) DEFAULT NULL,
  `content` varchar(512) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `creater` varchar(20) DEFAULT NULL,
  `createrRealName` varchar(20) DEFAULT NULL,
  `upDiscussUserName` varchar(20) DEFAULT NULL COMMENT '上一级评论人用户名',
  `upDiscussRealName` varchar(20) DEFAULT NULL COMMENT '上一级评论人用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for emp_comm_praise
-- ----------------------------
DROP TABLE IF EXISTS `emp_comm_praise`;
CREATE TABLE `emp_comm_praise` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `empCommId` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `realName` varchar(255) DEFAULT NULL,
  `userId` bigint(20) NOT NULL,
  `userName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for live
-- ----------------------------
DROP TABLE IF EXISTS `live`;
CREATE TABLE `live` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `liveId` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `attachId` varchar(255) DEFAULT NULL,
  `comment` int(11) DEFAULT NULL,
  `imageId` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `realName` varchar(255) DEFAULT NULL,
  `releaseTime` datetime DEFAULT NULL,
  `startTime` datetime DEFAULT NULL COMMENT '开始时间',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间',
  `userId` bigint(20) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for live_discuss
-- ----------------------------
DROP TABLE IF EXISTS `live_discuss`;
CREATE TABLE `live_discuss` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `upDiscussId` bigint(20) DEFAULT NULL COMMENT '如果不是评论上追加的评论，此处默认null',
  `liveId` bigint(20) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `realName` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `top` int(11) DEFAULT NULL,
  `returnName` varchar(255) DEFAULT NULL,
  `userId` bigint(20) NOT NULL,
  `upDiscussUserName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for praise
-- ----------------------------
DROP TABLE IF EXISTS `praise`;
CREATE TABLE `praise` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blogId` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `realName` varchar(255) DEFAULT NULL,
  `userId` bigint(20) NOT NULL,
  `userName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for proposal
-- ----------------------------
DROP TABLE IF EXISTS `proposal`;
CREATE TABLE `proposal` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `contentAndReason` varchar(255) DEFAULT NULL,
  `handleDept` varchar(255) DEFAULT NULL,
  `pass` tinyint(1) NOT NULL,
  `proposalTheme` varchar(255) DEFAULT NULL,
  `proposalTime` datetime DEFAULT NULL,
  `proposalType` varchar(255) DEFAULT NULL,
  `proposer` varchar(255) DEFAULT NULL,
  `proposerDept` varchar(255) DEFAULT NULL,
  `replay` varchar(255) DEFAULT NULL,
  `stepAndSuggest` varchar(255) DEFAULT NULL,
  `reply` varchar(255) DEFAULT NULL,
  `replyTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for proposal_discuss
-- ----------------------------
DROP TABLE IF EXISTS `proposal_discuss`;
CREATE TABLE `proposal_discuss` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `upDiscussId` bigint(20) DEFAULT NULL COMMENT '如果不是评论上追加的评论，此处默认null',
  `proposalId` bigint(20) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `realName` varchar(255) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `top` int(11) DEFAULT NULL,
  `returnName` varchar(255) DEFAULT NULL,
  `userId` bigint(20) NOT NULL,
  `upDiscussUserName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sensitive_word
-- ----------------------------
DROP TABLE IF EXISTS `sensitive_word`;
CREATE TABLE `sensitive_word` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL COMMENT '敏感词内容',
  `level` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for topic
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `realName` varchar(255) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `passWord` varchar(512) DEFAULT NULL,
  `realName` varchar(20) DEFAULT NULL,
  `nickName` varchar(20) DEFAULT NULL,
  `position` varchar(32) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `file` varchar(255) DEFAULT NULL,
  `forceWatchStatus` tinyint(1) DEFAULT NULL COMMENT '强制关注状态',
  `imgId` int(11) NOT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `fromLdap` tinyint(1) NOT NULL,
  `st` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for watcher
-- ----------------------------
DROP TABLE IF EXISTS `watcher`;
CREATE TABLE `watcher` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `realName` varchar(20) DEFAULT NULL,
  `watchUserName` varchar(20) DEFAULT NULL,
  `watchRealName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for weibo
-- ----------------------------
DROP TABLE IF EXISTS `weibo`;
CREATE TABLE `weibo` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `realName` varchar(20) DEFAULT NULL,
  `releaseTime` datetime DEFAULT NULL,
  `attachId` varchar(64) DEFAULT NULL,
  `praise` int(10) DEFAULT '0',
  `ref` int(10) DEFAULT NULL,
  `comment` int(10) DEFAULT '0',
  `store` int(10) DEFAULT NULL,
  `competitive` int(10) DEFAULT NULL,
  `cpTime` datetime DEFAULT NULL,
  `cpName` varchar(20) DEFAULT NULL,
  `cpRealName` varchar(20) DEFAULT NULL,
  `top` int(10) DEFAULT NULL,
  `topTime` datetime DEFAULT NULL,
  `topName` varchar(20) DEFAULT NULL,
  `topRealName` varchar(20) DEFAULT NULL,
  `topDeadline` datetime DEFAULT NULL,
  `content` varchar(2000) DEFAULT NULL,
  `imageId` varchar(255) DEFAULT NULL,
  `deleteStatus` int(1) DEFAULT '0' COMMENT '删除状态0表示正常1表示已删除',
  `position` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for weibo_discuss
-- ----------------------------
DROP TABLE IF EXISTS `weibo_discuss`;
CREATE TABLE `weibo_discuss` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `upDiscussId` bigint(10) DEFAULT '0' COMMENT '上一级评论人id',
  `weiboId` int(10) DEFAULT NULL,
  `content` varchar(512) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `creater` varchar(20) DEFAULT NULL,
  `createrRealName` varchar(20) DEFAULT NULL,
  `upDiscussUserName` varchar(20) DEFAULT NULL COMMENT '上一级评论人用户名',
  `upDiscussRealName` varchar(20) DEFAULT NULL COMMENT '上一级评论人用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
