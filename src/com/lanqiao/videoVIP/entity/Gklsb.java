package com.lanqiao.videoVIP.entity;

import java.io.Serializable;

public class Gklsb implements Serializable{
	/** 用户账号*/
	private String yhzh;
	/** 观看历史记录*/
	private String gkls;
	/** 观看时间*/
	private String gksj;
	/** 视频编号*/
	private String spid;
	
	
	public Gklsb() {}


	public Gklsb(String yhzh, String gkls, String gksj, String spid) {
		super();
		this.yhzh = yhzh;
		this.gkls = gkls;
		this.gksj = gksj;
		this.spid = spid;
	}


	public String getYhzh() {
		return yhzh;
	}


	public void setYhzh(String yhzh) {
		this.yhzh = yhzh;
	}


	public String getGkls() {
		return gkls;
	}


	public void setGkls(String gkls) {
		this.gkls = gkls;
	}


	public String getGksj() {
		return gksj;
	}


	public void setGksj(String gksj) {
		this.gksj = gksj;
	}


	public String getSpid() {
		return spid;
	}


	public void setSpid(String spid) {
		this.spid = spid;
	}


	@Override
	public String toString() {
		return "Gklsb [yhzh=" + yhzh + ", gkls=" + gkls + ", gksj=" + gksj + ", spid=" + spid + "]";
	}
	
	
}
