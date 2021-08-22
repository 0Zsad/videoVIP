package com.lanqiao.videoVIP.mapper;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.lanqiao.videoVIP.entity.Spb;

public interface SpbMapper {
	
	@Insert("insert into spb(spid,sppm,spjj,spdz,splx,spdq,spsj,bfnum) values(#{spid},#{sppm},#{spjj},#{spdz},#{splx},#{spdq},#{spsj},#{bfnum})")
	boolean add(Spb spb);
	
	@Delete("delete from spb where spid = #{spid}")
	boolean deleteById(Serializable spid);
	
	@Update("update spb set sppm = #{sppm},splx = #{splx},spdq = #{spdq},spjj = #{spjj},spsj = #{spsj},spdz = #{spdz} where spid = #{spid}")
	boolean update(Spb spb);
	
	@Update("update spb set spfm = #{spfm} where spid = #{spid}")
	boolean updateSpfm(Spb spb);
	
	@Update("update spb set bfnum = #{bfnum} where spid = #{spid}")
	boolean updateBfnum(Spb spb);
	
	@Select("select spid,sppm,spfm,splx,spdq,spsj,spjj,bfnum,spdz from spb where spid = #{spid}")
	Spb selectById(Serializable spid);
	
	@Select("select spid,sppm,spfm,splx,spdq,spsj,spjj,bfnum,spdz from spb where splx = #{splx} order by LENGTH(bfnum) desc,bfnum desc ")
	List<Spb> listByType(Serializable splx);
	
	@SelectProvider(type=SpbProvide.class, method="getListSql")
	List<Spb> list(Spb sp);
}
