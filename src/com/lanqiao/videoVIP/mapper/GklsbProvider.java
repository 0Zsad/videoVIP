package com.lanqiao.videoVIP.mapper;

import com.lanqiao.videoVIP.entity.Gklsb;
import com.lanqiao.videoVIP.util.StrUtil;


public class GklsbProvider {
	public String getListSql(Gklsb user) {
		StringBuffer sql = new StringBuffer("select yhzh,gkls,gksj,spid from gklsb where 1=1 ");
	
		/*if(null != user) {
			if(StrUtil.isNotEmpty(user.getYhzh())) {
				sql.append(" and yhzh like concat('%',#{yhzh},'%') ");
				
			}
			if(user.getGkls() != null) {
				sql.append(" and gkls = #{gkls} ");
				
			}
			if(StrUtil.isNotEmpty(user.getGksj())) {
				sql.append(" and gksj like concat('%',#{gksj},'%') ");
				
			}
			if(StrUtil.isNotEmpty(user.getSpid())) {
				sql.append(" and spid like concat('%',#{spid},'%') ");
				
			}
		}*/
		
		return sql.toString();
	}
}
