package com.lanqiao.videoVIP.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanqiao.videoVIP.entity.SpGklsb;
import com.lanqiao.videoVIP.mapper.SpGklsbMapper;

@Service
public class SpGklsbService {
	
	@Autowired
	private SpGklsbMapper spGklsbMapper;
	
	public List<SpGklsb> selectById(Serializable yhzh){
		return spGklsbMapper.selectById(yhzh);
	}
	
	public List<SpGklsb> list(){
		return spGklsbMapper.list();
	}
	
}
