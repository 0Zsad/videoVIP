package com.lanqiao.videoVIP.mapper;

import com.lanqiao.videoVIP.entity.Glyb;

public class GlybProvider {
	public String getListSql(Glyb glyb) {
		StringBuffer sql = new StringBuffer("SELECT glyzh,glypwd FROM glyb where 1=1 ");
		return sql.toString();
	}
}
