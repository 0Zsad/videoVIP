package com.lanqiao.videoVIP.util;


import org.apache.commons.codec.digest.DigestUtils;

/**
 * 描述：MD5加密工具<br>
 * @author lsy<br>
 * @date 2016年8月23日<br>
 * @version V1.0<br>
 */
public class EncryptUtil {
	/**
	 * 功能描述：给字符串进行MD5加密
	 * @param str 原始字符串
	 * @return 32位加密过的字符串
	 */
	public static String getEncStr(String str){
		return  DigestUtils.md5Hex(str);//MD5加密
	}
	
	/**
	 * 功能描述：给字符串进行MD5加密
	 * @param str 原始字符串
	 * @param len 密串的长度
	 * @return 密串
	 */
	public static String getEncStr(String str,int len){
		String md5Pwd = DigestUtils.md5Hex(str);//MD5加密
		return md5Pwd.substring(0, len);
	}
	
	/**
	 * 测试方法
	 */
	public static void main(String[] args) {
		String str = "123456";			// 加密前：明文
		
		System.out.println(EncryptUtil.getEncStr(str));
		
		// 获取6位长度的加密密码
		String enc = getEncStr(str,6);	// 加密后：密文
		System.out.println(enc);
	}
}
