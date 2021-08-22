package com.lanqiao.videoVIP.entity;

import java.io.Serializable;

public class Scb implements Serializable {

	/** 用户账号 */
	private String yhzh;
	/** 收藏时间 */
	private String scsj;
	/** 视频编号 */
	private String spid;

	// 构造器
	public Scb() {
		super();
	}

	public Scb(String yhzh, String scsj, String spid) {
		super();
		this.yhzh = yhzh;
		this.scsj = scsj;
		this.spid = spid;
	}

	// getter和setter
	public String getYhzh() {
		return yhzh;
	}

	public void setYhzh(String yhzh) {
		this.yhzh = yhzh;
	}

	public String getScsj() {
		return scsj;
	}

	public void setScsj(String scsj) {
		this.scsj = scsj;
	}

	public String getSpid() {
		return spid;
	}

	public void setSpid(String spid) {
		this.spid = spid;
	}

	@Override
	public String toString() {
		return "Scb [yhzh=" + yhzh + ", scsj=" + scsj + ", spid=" + spid + "]";
	}
}
