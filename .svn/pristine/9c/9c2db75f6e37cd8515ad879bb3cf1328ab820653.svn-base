package com.lanqiao.videoVIP.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.lanqiao.videoVIP.entity.Scb;

@CacheNamespace
public interface ScbMapper {

	@Insert("insert into scb(yhzh,scsj,spid) values(#{yhzh},#{scsj},#{spid})")
	boolean add(Scb scb);

	@Delete("delete from scb where spid = #{spid}")
	boolean deleteById(String spid);

	@Delete("delete from scb where spid = #{spid} and yhzh=#{yhzh}")
	boolean deleteByObj(Scb scb);
	
	@Delete("delete from scb where yhzh=#{yhzh}")
	boolean deleteCleanAll(String yhzh);
	
	@Select("select yhzh, scsj, spid from scb where yhzh=#{yhzh} and spid=#{spid}")
	List<Scb> select(Scb scb);
	
	@SelectProvider(type = ScbProvide.class, method = "getListSql")
	List<Scb> list(Scb scb);

}
