package com.lanqiao.videoVIP.mapper;

import com.lanqiao.videoVIP.entity.Yhb;
import com.lanqiao.videoVIP.util.StrUtil;

public class YhbProvider {
	/** 动态查询 得空需要修改 */
	public String getListSql(Yhb user) {
		StringBuffer sql = new StringBuffer("select yhzh,pwd,yhnc,yhtx,yhzt from yhb where 1=1 ");
	
		/*if(null != user) {
			if(StrUtil.isNotEmpty(user.getYhzh())) {
				sql.append(" and yhm like concat('%',#{yhm},'%') ");
				
			}
			if(user.getYhsf() != null) {
				sql.append(" and yhsf = #{yhsf} ");
				
			}
			if(StrUtil.isNotEmpty(user.getZcsj())) {
				sql.append(" and zcsj like concat('%',#{zcsj},'%') ");
				
			}
			if(StrUtil.isNotEmpty(user.getSjh())) {
				sql.append(" and sjh like concat('%',#{sjh},'%') ");
				
			}
			if(StrUtil.isNotEmpty(user.getSex())) {
				sql.append(" and sex = #{sex} ");
				
			}
			if(StrUtil.isNotEmpty(user.getEmail())) {
				sql.append(" and email like concat('%',#{email},'%') ");
			}
		}*/
		
		return sql.toString();
	}
	
	/** 动态更改 */
	public String getUpdateSql(Yhb user){
		StringBuffer sql = new StringBuffer("update yhb set  where yhzh = #{yhzh}");
		
		if(null != user) {
			//密码为空时
			if(StrUtil.isNotEmpty(user.getYhnc()) && StrUtil.isNotEmpty(user.getYhzt())) {
				sql.insert(15, "yhnc = #{yhnc},yhzt = #{yhzt}");
				
			}
			//修改用户信息
			if(StrUtil.isNotEmpty(user.getYhnc()) && StrUtil.isNotEmpty(user.getPwd())) {
				sql.insert(15, "pwd = #{pwd},yhnc = #{yhnc}");
				
			}
		}
		
		return sql.toString();
	}
	
	
		/** 模糊查询 */
		public String mhselectSql(Yhb yhb) {
			StringBuffer sql = new StringBuffer("select yhzh,yhzt,yhnc from yhb where 1=1 ");
		
			if(null != yhb) {
				if(StrUtil.isNotEmpty(yhb.getYhzh())) {
					sql.append(" and yhzh like concat('%',#{yhzh},'%') ");
					
				}
				if(StrUtil.isNotEmpty(yhb.getYhzt())) {
					sql.append(" and yhzt like #{yhzt} ");
					
				}
				if(StrUtil.isNotEmpty(yhb.getYhnc())) {
					sql.append(" and yhnc like concat('%',#{yhnc},'%') ");
					
			}
		}
			return sql.toString();
	}
}
