package com.lanqiao.videoVIP.mapper;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;

import com.lanqiao.videoVIP.entity.SpGklsb;

public interface SpGklsbMapper {
	
	/** 根据用户账号查询*/
	@Select("select yhzh,gkls,gksj,spb.spid,sppm,spfm,splx,spdq,spsj,spjj,bfnum,spdz from spb,gklsb where spb.spid=gklsb.spid and yhzh=#{yhzh}")
	List<SpGklsb> selectById(Serializable yhzh);
	
	/** 查询所有*/
	@Select("select yhzh,gkls,gksj,spb.spid,sppm,spfm,splx,spdq,spsj,spjj,bfnum,spdz from spb,gklsb where spb.spid=gklsb.spid")
	List<SpGklsb> list();
}
