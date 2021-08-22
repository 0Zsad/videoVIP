package com.lanqiao.videoVIP.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.lanqiao.videoVIP.entity.Pfb;

import com.lanqiao.videoVIP.service.PfbService;

@Controller
@RequestMapping("PfbController")
public class PfbController {
	@Autowired
	private PfbService pfbService;

	/** 新增评分*/
	@RequestMapping("add.do")
	@ResponseBody
	public boolean add(Pfb pfb){
		return pfbService.add(pfb);
	}

	/** 删除用户评分*/
	@RequestMapping("deleteByAll.do")
	@ResponseBody
	public boolean deleteByAll(String pfb){
		return pfbService.deleteByAll(pfb);
	}
	
	/** 删除一条记录*/
	@RequestMapping("deleteById.do")
	@ResponseBody
	public boolean deleteById(String spid){
		return pfbService.deleteById(spid);
	}
	
	/** 修改评分*/
	@RequestMapping("update.do")
	@ResponseBody
	private boolean update(Pfb pfb){
		return pfbService.update(pfb);
	}
	
	/** 查询一个 */
	@RequestMapping("selectById.do")
	@ResponseBody
	public Pfb selectById(String spid) {
		return pfbService.selectById(spid);
	}
		
	/** 查询全部 */
	@RequestMapping("list.do")
	@ResponseBody
	public List<Pfb> list(Pfb pfb){
		return pfbService.list(pfb);
	}
}
