package com.lanqiao.videoVIP.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.videoVIP.entity.Pfb;
import com.lanqiao.videoVIP.mapper.PfbMapper;

@Service
public class PfbService {
	@Autowired
	private PfbMapper pfbMapper;
	
	public boolean add(Pfb pfb) {
		return pfbMapper.add(pfb);
	}
	
	public boolean deleteByAll(Serializable all) {
		return pfbMapper.deleteByAll(all);
	}
	
	public boolean deleteById(Serializable id) {
		return pfbMapper.deleteById(id);
	}
	
	public boolean update(Pfb pfb) {
		return pfbMapper.update(pfb);
	}
		
	public Pfb selectById(Serializable id) {
		return pfbMapper.selectById(id);
	}
		
	public List<Pfb> list(Pfb user){
		List<Pfb> list = pfbMapper.list(user);
		return list;
	}
	
}
