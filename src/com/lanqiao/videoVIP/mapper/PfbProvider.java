package com.lanqiao.videoVIP.mapper;

import com.lanqiao.videoVIP.entity.Pfb;
import com.lanqiao.videoVIP.util.StrUtil;


public class PfbProvider {
	public String getListSql(Pfb pfs) {
		StringBuffer sql = new StringBuffer("select yhzh,spid,pf from pfb where 1=1 ");
	

		if (null != pfs) {
			if(StrUtil.isNotEmpty(pfs.getYhzh())) {
				sql.append(" and spid like concat('%',#{spid},'%') ");
				
			}
			if(StrUtil.isNotEmpty(pfs.getSpbh())) {
				sql.append(" and sppm like concat('%',#{sppm},'%') ");
				
			}
			if(StrUtil.isNotEmpty(pfs.getPf())) {
				sql.append(" and sjh spfm concat('%',#{spfm},'%') ");
				
			}
			}
		
		return sql.toString();
	}
}
