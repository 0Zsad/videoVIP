package com.lanqiao.videoVIP.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.lanqiao.videoVIP.entity.Glyb;

@CacheNamespace
public interface GlybMapper {
	/**增加 */
	@Insert("insert into glyb(glyzh,glypwd) values(#{glyzh},#{glypwd})")
	boolean add(Glyb glyb);
	
	/**删除 */
	@Delete("DELETE FROM glyb WHERE glyzh=#{glyzh}")
	boolean deleteById(String glyzh);
	
	/**修改 */
	@Update("UPDATE glyb SET glypwd=#{glypwd} WHERE glyzh=#{glyzh}")
	boolean update(Glyb glyb);
	
	/**查询密码 */
	@Select("SELECT glyzh,glypwd FROM glyb WHERE glyzh=#{glyzh}")
	Glyb selectById(String glyzh);
	
	/**查询密码 */
	@Select("SELECT glyzh,glypwd FROM glyb WHERE glyzh = #{glyzh} and glypwd = #{glypwd}")
	Glyb selectByObj(Glyb obj);
	
	/**查询管理员列表 */
	@SelectProvider(type=GlybProvider.class, method="getListSql")
	List<Glyb> list(Glyb glyb);
}
