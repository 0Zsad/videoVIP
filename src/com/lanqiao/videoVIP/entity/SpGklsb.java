package com.lanqiao.videoVIP.entity;

import java.io.Serializable;

public class SpGklsb implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 用户账号*/
	private String yhzh;
	/** 观看历史记录*/
	private String gkls;
	/** 观看时间*/
	private String gksj;
	/** 视频编号*/
	private String spid;
	/** 视频片名*/
	private String sppm;
	/** 视频封面*/
	private String spfm;
	/** 视频类型*/
	private String splx;
	/** 视频地区*/
	private String spdq;
	/** 视频时间*/
	private String spsj;
	/** 视频简介*/
	private String spjj;
	/** 视频播放数*/
	private String bfnum;
	/** 视频链接地址*/
	private String spdz;
	
	public SpGklsb() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpGklsb(String yhzh, String gkls, String gksj, String spid, String sppm, String spfm, String splx,
			String spdq, String spsj, String spjj, String bfnum, String spdz) {
		super();
		this.yhzh = yhzh;
		this.gkls = gkls;
		this.gksj = gksj;
		this.spid = spid;
		this.sppm = sppm;
		this.spfm = spfm;
		this.splx = splx;
		this.spdq = spdq;
		this.spsj = spsj;
		this.spjj = spjj;
		this.bfnum = bfnum;
		this.spdz = spdz;
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

	public String getSppm() {
		return sppm;
	}

	public void setSppm(String sppm) {
		this.sppm = sppm;
	}

	public String getSpfm() {
		return spfm;
	}

	public void setSpfm(String spfm) {
		this.spfm = spfm;
	}

	public String getSplx() {
		return splx;
	}

	public void setSplx(String splx) {
		this.splx = splx;
	}

	public String getSpdq() {
		return spdq;
	}

	public void setSpdq(String spdq) {
		this.spdq = spdq;
	}

	public String getSpsj() {
		return spsj;
	}

	public void setSpsj(String spsj) {
		this.spsj = spsj;
	}

	public String getSpjj() {
		return spjj;
	}

	public void setSpjj(String spjj) {
		this.spjj = spjj;
	}

	public String getBfnum() {
		return bfnum;
	}

	public void setBfnum(String bfnum) {
		this.bfnum = bfnum;
	}

	public String getSpdz() {
		return spdz;
	}

	public void setSpdz(String spdz) {
		this.spdz = spdz;
	}

	@Override
	public String toString() {
		return "SpGklsb [yhzh=" + yhzh + ", gkls=" + gkls + ", gksj=" + gksj + ", spid=" + spid + ", sppm=" + sppm
				+ ", spfm=" + spfm + ", splx=" + splx + ", spdq=" + spdq + ", spsj=" + spsj + ", spjj=" + spjj
				+ ", bfnum=" + bfnum + ", spdz=" + spdz + "]";
	}
	
}
