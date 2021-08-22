package com.lanqiao.videoVIP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.videoVIP.entity.Scb;
import com.lanqiao.videoVIP.mapper.ScbMapper;

@Service
public class ScbService {

	@Autowired
	private ScbMapper scbMapper;

	public boolean add(Scb scb) {
		return scbMapper.add(scb);
	}

	public boolean deleteById(String spid) {
		return scbMapper.deleteById(spid);
	}
	
	public boolean deleteByObj(Scb scb) {
		return scbMapper.deleteByObj(scb);
	}
	
	public boolean deleteCleanAll(String yhzh) {
		return scbMapper.deleteCleanAll(yhzh);
	}

	public boolean select(Scb scb) {
		boolean ret = true;
		if (scbMapper.select(scb).size()==0) {
			ret = false;
		}
		return ret;
	}
	
	public List<Scb> list(Scb scb) {
		return scbMapper.list(scb);
	}
}
