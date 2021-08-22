package com.lanqiao.videoVIP.mapper;

import com.lanqiao.videoVIP.entity.Scb;

public class ScbProvide {
	public String getListSql(Scb scb) {
		StringBuffer sql = new StringBuffer("select yhzh, scsj, spid from scb where 1=1 ");

		return sql.toString();
	}
}
