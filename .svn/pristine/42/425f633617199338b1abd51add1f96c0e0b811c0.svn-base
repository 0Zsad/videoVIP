package com.lanqiao.videoVIP.mapper;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;


import com.lanqiao.videoVIP.entity.Pfb;

public interface PfbMapper {
	/** 新增评分 */
	@Insert("insert into Pfb(yhzh,spid,pf) values(#{yhzh},#{spid},#{pf})")
	boolean add(Pfb pfb);
	
	/** 删除用户评分*/
	@Delete("delete from Pfb where yhzh = #{yhzh}")
	boolean deleteByAll(Serializable all);
	
	/** 删除视频评分 */
	@Delete("delete from Pfb where spid = #{spid}")
	boolean deleteById(Serializable id);
	
	/** 修改评分*/
	@Update("update Pfb set yhbh = #{yhbh},spid = #{spid},pfwd = #{pf} where yhbh = #{yhbh} and spid = #{spid}")
	boolean update(Pfb pfb);
	
	/** 查询视频评分记录*/
	@Select("select yhzh,spid,pf from Pfb where spid = #{spid}")
	Pfb selectById(Serializable id);
	
	
		
	@SelectProvider(type=PfbProvider.class, method="getListSql")
	List<Pfb> list(Pfb pfb);

}
