package com.lanqiao.videoVIP.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanqiao.videoVIP.entity.Scb;
import com.lanqiao.videoVIP.service.ScbService;

@Controller
@RequestMapping("ScbController")
public class ScbController {
	@Autowired
	private ScbService scbService;

	/** 添加收藏视频 */
	@RequestMapping("add.do")
	@ResponseBody
	public boolean add(Scb scb) {
		return scbService.add(scb);
	}

	/** 删除收藏视频 */
	//从dao到ctrl都改了些，先别动
	@RequestMapping("deleteById.do")
	@ResponseBody
	public boolean deleteById(String spid) {
		return scbService.deleteById(spid);
	}
	
	/** 删除收藏视频 */
	@RequestMapping("deleteByObj.do")
	@ResponseBody
	public boolean deleteByObj(Scb scb) {
		return scbService.deleteByObj(scb);
	}
	
	/** 删除收藏所有视频 */
	@RequestMapping("deleteCleanAll.do")
	@ResponseBody
	public boolean deleteCleanAll(String yhzh) {
		return scbService.deleteCleanAll(yhzh);
	}

	/** 查询收藏视频 */
	@RequestMapping("select.do")
	@ResponseBody
	public boolean select(Scb scb) {
		return scbService.select(scb);
	}
	
	/** 查询收藏视频 */
	@RequestMapping("list.do")
	@ResponseBody
	public List<Scb> list(Scb scb) {
		return scbService.list(scb);
	}
}
