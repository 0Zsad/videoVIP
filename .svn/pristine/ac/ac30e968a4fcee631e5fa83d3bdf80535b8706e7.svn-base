package com.lanqiao.videoVIP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.videoVIP.entity.Glyb;
import com.lanqiao.videoVIP.mapper.GlybMapper;

@Service
public class GlybService {
	@Autowired
	private GlybMapper glybMapper;
	
	/**
	 * 增加
	 */
	public boolean add(Glyb glyb) {
		return glybMapper.add(glyb);
	}
	
	/**
	 * 通过账户删除
	 */
	public boolean deleteById(String glyzh) {
		return glybMapper.deleteById(glyzh);
	}
	
	/**
	 * 更改密码
	 */
	public boolean update(Glyb glyb) {
		return glybMapper.update(glyb);
	}
	
	/**
	 * 查询密码
	 */
	public Glyb selectById(String glyzh) {
		return glybMapper.selectById(glyzh);
	}
	
	/**
	 * 通过账号密码查询
	 */
	public Glyb selectByObj(Glyb obj) {
		return glybMapper.selectByObj(obj);
	}
	
	/**
	 * 查询管理员列表
	 */
	public List<Glyb> list(Glyb glyb){
		return glybMapper.list(glyb);
	}
}
