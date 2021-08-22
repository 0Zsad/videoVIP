package com.lanqiao.videoVIP.util;

import java.util.UUID;

/**
 * 获取 32 位长的UUID值
 * @author lsy
 * email: lsy@lanqiao.org
 * 2021年7月3日
 */
public class UUIDUtil {
	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	/*
	public static void main(String[] args) {
		getUUID();
	}*/
}
